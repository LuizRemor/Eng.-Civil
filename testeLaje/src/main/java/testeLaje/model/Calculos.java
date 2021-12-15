package testeLaje.model;

import testeLaje.model.dao.impl.CoeficientesDaoJDBC;

public class Calculos extends VariaveisLaje {
	
	CoeficientesKeMi coef = new CoeficientesKeMi();

	public Calculos() {

	}
	
	public void setVariaveis() {
		//O QUE ALTERAR
		//LADOS, AJUSTAR O LAMBDA, CASO, ESPESSURA DA LAJE, CARGA ACIDENTAL, PSI2;

		// em metros
		setLadoX(2.45); //ALTERAR
		setLadoY(5.1); //ALTERAR
		setArea(getLadoX() * getLadoY());
		//LAMBDA
		coef.setLambda(getLadoY()/getLadoX());
		//CASO
		coef.setCaso(7.0); //ALTERAR
		// espessuras em cm, divido por 100 para passar pra m - ALTERAR
		setEspessuraRevestimento(2.0 / 100.0); //PADR�O
		setEspessuraContraPiso(3.0 / 100.0); //PADR�O
		setEspessuraLaje(11.0 / 100.0); //ALTERAR
		// tudo em kN/m�
		setGamaConcreto(25.0); //PADR�O
		setGamaContrapiso(21.0); //PADR�O
		setGamaPiso(18.0); //PADR�O
		setpForro(0.5); //PADR�O
		
		// carga acidental
		setCargaQ(4.0); //ALTERAR
		
		//psi2
		setPsi2(0.4); //ALTERAR
		
		//Fc
		setFck(25.0); //PADR�O
		setFcd((getFck()/1.4)/10.0);
		setFctm(0.3*(Math.pow(getFck(),(0.66666666666666666666666666666667))));
		setFctkInf(0.7*getFctm());
		setFctd(getFctkInf()/1.4);
		//Fy
		setFyk(500.0); //PADR�O
		setFyd((getFyk()/1.15)/10);
		//In�rcia
		setInercia((100.0*Math.pow((getEspessuraLaje()*100),3))/12);
		//AUTOMATIZAR
		setCoeficienteMx(0.065);
		setCoeficienteK(0.26); //ALTERAR
		//C�LCULO DO D
		setD(getEspessuraLaje()*100 - 2.5 - 0.5);
	}

	public Double cargaTotal() {
		
		setVariaveis();

		// calculando o pesos de acordo com as espessuras
		setPpConcreto(getGamaConcreto() * getEspessuraLaje());
		setpContrapiso(getGamaContrapiso() * getEspessuraContraPiso());
		setpPiso(getGamaPiso() * getEspessuraRevestimento());
		// carga total
		setCargaTotalP(getPpConcreto() + getpContrapiso() + getpForro() + getpPiso() + getCargaQ());
		return getCargaTotalP();
	}

	public Double cargaPermanente() {
		// carga permanente
		setCargaG(getPpConcreto() + getpContrapiso() + getpForro() + getpPiso());
		
		return getCargaG();
	}

	public Double cargaDeServico() {
		setpServ(getCargaG()+getPsi2()*getCargaQ());
		return getpServ();
	}
	
	public String verificaDirecoes() {
		if(coef.getLambda() >= 2) {
			return "ARMADA EM 1 DIRE��O";
		}
		else {
			return "ARMADA EM 2 DIRE��ES";
		}
	}
	
	public Double ajustaAB() {
		double coeficiente = Math.floor((getLadoX()/getLadoY())*10);
		
		return coeficiente/10;
	}
	
	public Double eCi() {
		double eCi = 0.0;
		//USANDO BASALTO = 1.2
		//CALCARIO = 0.9
		//GRANITO E GNAISSE = 1.0
		eCi = 1*5600*Math.sqrt(getFck());
		
		return eCi;
		
	}
	
	public Double eCs() {
		double eCs = 0.0;
		
		eCs = (0.8+0.2*(getFck()/80))*eCi();
		
		return eCs/10;
	}
	
	public Double momentoDeFissuracao() {
		
		setmFiss(0.25*(getFctm()/10)*100* Math.pow(getEspessuraLaje()*100, 2));
				
		return getmFiss();
	}
	
	/*//AUTOMATIZAR A CONSULTA
	public Double coeficienteMx() {
		//double coeficiente = Math.floor((getLadoX()/getLadoY())*10);
		//System.out.printf("a/b = %.2f%n", coeficiente/10);
		return 0.034; //ALTERAR
	}*/
	
	public Double momentoDeServico() {
		setmServ(getCoeficienteMx()*getpServ()*Math.pow(getLadoX(), 2));
		
		return getmServ()*100;
	}
	
	public String comparaMomentos() {
		if(momentoDeServico() < momentoDeFissuracao()) {
			return "OK";
		} 
		else {
			return "N�o fechou";
		}
	}
	
	public Double flechaCurtaDuracao() {
		
		double numerador = getpServ()*Math.pow(10, -4)*Math.pow((getLadoX()*100), 4);
		double denominador = eCs()*getInercia();
		
		setFt0(getCoeficienteK()*(numerador/denominador));
		
		return getFt0();
	}
	
	public Double flechaLongaDuracao() {
				
		setFtInfinito((1+1.32)*getFt0());
		
		return getFtInfinito();
	}
	
	public Double flechaAdm() {
		setfAdm((getLadoX()*100)/250);
		
		return getfAdm();
	}
	
	public String comparaFlechas() {
		if(getFtInfinito() < getfAdm()) {
			return "OK";
		}
		else {
			return "N�o fechou";
		}
	}
	public Double ajustaLambda() {
		coef.setLambda(99999.0); //ALTERAR
		return coef.getLambda();
	}
	
	public void setCoeficientes() {
		
		CoeficientesDaoJDBC consulta = new CoeficientesDaoJDBC();

		coef = consulta.pesquisaCoeficientesKeMi(coef.getLambda(), coef.getCaso());
		
		setMiX(consulta.obj.getMiX());
		setMiY(consulta.obj.getMiY());
		setMiX1(consulta.obj.getMiX1());
		setMiY1(consulta.obj.getMiY1());
		setKx(consulta.obj.getKx());
		setKy(consulta.obj.getKy());
		setKx1(consulta.obj.getKx1());
		setKy1(consulta.obj.getKy1());

	}
	
	public String calculaMomentoDeProjeto() {
		
		setCoeficientes();
		
		coef.setMiX(coef.getMiX()*((getCargaTotalP()*(Math.pow(getLadoX(), 2)))/100));
		coef.setMiY(coef.getMiY()*((getCargaTotalP()*(Math.pow(getLadoX(), 2)))/100));
		coef.setMiX1(coef.getMiX1()*((getCargaTotalP()*(Math.pow(getLadoX(), 2)))/100));
		coef.setMiY1(coef.getMiY1()*((getCargaTotalP()*(Math.pow(getLadoX(), 2)))/100));
		
		return "X = " + coef.getMiX()*100*1.4
			 + " Y = " + coef.getMiY()*100*1.4
			 + " X1 = " + coef.getMiX1()*100*1.4
			 + " Y1 = " + coef.getMiY1()*100*1.4;
	}
	
	public String calculaX() {
		
		double numerador = 2*coef.getMiX()*100*1.4;
		double denominador = 0.85*getFcd()*100*Math.pow(getD(), 2);
		double resultado = numerador/denominador;
		
		setXx((getD()/0.8)*(1-(Math.sqrt(1-resultado))));
		
		numerador = 2*coef.getMiY()*100*1.4;
		resultado = numerador/denominador;
		
		setXy((getD()/0.8)*(1-(Math.sqrt(1-resultado))));
		
		numerador = 2*coef.getMiX1()*100*1.4;
		resultado = numerador/denominador;
		
		setXx1((getD()/0.8)*(1-(Math.sqrt(1-resultado))));
		
		numerador = 2*coef.getMiY1()*100*1.4;
		resultado = numerador/denominador;
		
		setXy1((getD()/0.8)*(1-(Math.sqrt(1-resultado))));
		
		return "X "   + getXx()  +
			   " Y "  + getXy()  +
			   " x1 " + getXx1() +
			   " y1 " + getXy1();
		
		
	}
	
	public String calculaAco() {
		setAsX((0.85*0.8*getFcd()*100*getXx())/getFyd());
		setAsY((0.85*0.8*getFcd()*100*getXy())/getFyd());
		setAsX1((0.85*0.8*getFcd()*100*getXx1())/getFyd());
		setAsY1((0.85*0.8*getFcd()*100*getXy1())/getFyd());
		
		return "As X = "   + getAsX() +
			   " As Y = "  + getAsY() +
			   " As X1 = " + getAsX1() +
			   " As Y1 = " + getAsY1();
	}
	
	public String calculaAsMin() {
		setAsMinPos(0.67*0.0015*100*(getEspessuraLaje()*100));
		setAsMinNeg(0.0015*100*(getEspessuraLaje()*100));
		
		return "As m�nimo Positivo = "   + getAsMinPos() +
			   " As m�nimo Negativo = "  + getAsMinNeg();
	}
	
	public String decideAco() {
		
		if(getAsX() > getAsMinPos()) {
			setAsX(getAsX());
		}
		else {
			setAsX(getAsMinPos());
		}
		
		if(getAsY() > getAsMinPos()) {
			setAsY(getAsY());
		}
		else {
			setAsY(getAsMinPos());
		}
		
		if(getAsX1() > getAsMinNeg()) {
			setAsX1(getAsX1());
		}
		else {
			setAsX1(getAsMinNeg());
		}
		
		if(getAsY1() > getAsMinNeg()) {
			setAsY1(getAsY1());
		}
		else {
			setAsY1(getAsMinNeg());
		}
		
		return  "AsPOS X = "  + getAsX() +
			   " AsPOS Y = "  + getAsY() +
			   " AsNEG X1 = " + getAsX1() +
			   " AsNEG Y1 = " + getAsY1();
	}
	
	/*public List<EspacamentoBitola> retornaEspacamentoBitola() {
		
		EspacamentoBitolaDaoJDBC espacamentoBitola = new EspacamentoBitolaDaoJDBC();
		
		return espacamentoBitola.pesquisaEspacamento(getAsX());
		
	}*/
	
	public void calculaReacoes() {
		
		setQx((getKx()*getCargaTotalP()*getLadoX())/10);
		setQy((getKy()*getCargaTotalP()*getLadoX())/10);
		setQx1((getKx1()*getCargaTotalP()*getLadoX())/10);
		setQy1((getKy1()*getCargaTotalP()*getLadoX())/10);
		
	}
	
	public String calculaRecaoTotal() {
		calculaReacoes();
		
		if(getQx() == 0) {
			setQx(getQx1());
		}
		else {
			getQx();
		}
		if(getQx1() == 0) {
			setQx1(getQx());
		}
		else {
			getQx1();
		}
		if(getQy() == 0) {
			setQy(getQy1());
		}
		else {
			getQy();
		}
		if(getQy1() == 0) {
			setQy1(getQy());
		}
		else {
			getQy1();
		}
		
		return  "QX "  + getQx()  +
			   " QY "  + getQy()  +
			   " Qx1 " + getQx1() +
			   " Qy1 " + getQy1();
	}
	
	public Double somaReacoes() {
		double somatorio;
		
		somatorio = getQx()*getLadoY() + getQy()*getLadoY() + getQx1()*getLadoX() + getQy1()*getLadoX();
		
		return somatorio;
	}
	
	public Double reacaoAnalitica() {
		double soma;
		
		soma = getCargaTotalP()*getLadoX()*getLadoY();
		
		return soma;
	}
	
	public Double calculaErro() {
		double divisao;
		
		divisao = somaReacoes()/reacaoAnalitica();
		
		return (1-divisao)*100;
	}

}