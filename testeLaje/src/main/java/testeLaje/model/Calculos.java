package testeLaje.model;

public class Calculos extends VariaveisLaje {

	public Calculos() {

	}

	public void setVariaveis() {

		// em metros - ALTERAR
		setLadoX(3.4);
		setLadoY(4.8);
		setArea(getLadoX() * getLadoY());
		// espessuras em cm, divido por 100 para passar pra m - ALTERAR
		setEspessuraRevestimento(2.0 / 100.0);
		setEspessuraContraPiso(3.0 / 100.0);
		setEspessuraLaje(9.0 / 100.0);
		// tudo em kN/m²
		setGamaConcreto(25.0);
		setGamaContrapiso(21.0);
		setGamaPiso(18.0);
		setpForro(0.5);
		// carga acidental - ALTERAR
		setCargaQ(5.0);
		//psi2 - ALTERAR
		setPsi2(0.4);
		//Fc
		setFck(25.0);
		setFctm(0.3*(Math.pow(getFck(),(0.66666666666666666666666666666667))));
		setFctkInf(0.7*getFctm());
		setFctd(getFctkInf()/1.4);
		//Inércia
		setInercia((100.0*Math.pow((getEspessuraLaje()*100),3))/12);
		//AUTOMATIZAR
		setCoeficienteK(0.36);
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
	
	public Double eCi() {
		double eCi = 0.0;
		
		eCi = 1.2*5600*Math.sqrt(getFck());
		
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
	
	public Double coeficienteMx() {
		double coeficiente = Math.floor((getLadoX()/getLadoY())*10);
		System.out.printf("a/b = %.2f%n", coeficiente/10);
		return 0.045;
	}
	
	public Double momentoDeServico() {
		setmServ(coeficienteMx()*getpServ()*Math.pow(getLadoX(), 2));
		
		return getmServ()*100;
	}
	
	public String comparaMomentos() {
		if(momentoDeServico() < momentoDeFissuracao()) {
			return "OK";
		} 
		else {
			return "Não fechou";
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
			return "Não fechou";
		}
	}
	
}