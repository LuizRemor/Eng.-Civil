package testeLaje.model;

import java.util.ArrayList;
import java.util.List;

import testeLaje.model.dao.impl.EspacamentoBitolaDaoJDBC;

public class ImpressoesTeste {

	public static void main(String[] args) {
		
		Calculos calc = new Calculos();
		EspacamentoBitolaDaoJDBC consulta = new EspacamentoBitolaDaoJDBC();
			
		System.out.printf("Carga total (kN/m�)      = %.2f%n", calc.cargaTotal());
		System.out.printf("Carga permanente (kN/m�) = %.2f%n", calc.cargaPermanente());
		System.out.printf("Carga de servi�o (kN/m�) = %.2f%n", calc.cargaDeServico());
		System.out.println();
		System.out.println("" + calc.verificaDirecoes());
		System.out.println();
		System.out.printf("Eci (MPa)    = %.2f%n", calc.eCi());
		System.out.printf("Ecs (kN/cm�) = %.2f%n", calc.eCs());
		System.out.println();
		System.out.printf("Fcd (kN/cm�)  = %.2f%n", calc.getFcd());
		System.out.printf("Fctm (MPa)    = %.2f%n", calc.getFctm());
		System.out.printf("FctkInf (MPa) = %.2f%n", calc.getFctkInf());
		System.out.printf("Fctd (kN/cm�) = %.2f%n", calc.getFctd());
		System.out.println();
		System.out.printf("a/b ---------> = %.3f%n", calc.ajustaAB());
		System.out.printf("Coeficiente Mx = %.3f%n", calc.getCoeficienteMx());
		System.out.printf("Lambda = %.2f%n", calc.ajustaLambda());
		System.out.println();
		System.out.printf("Momento de servi�o    (kN.cm / m) = %.3f%n", calc.momentoDeServico());
		System.out.printf("Momento de fissura��o (kN.cm / m) = %.2f%n", calc.momentoDeFissuracao());
		System.out.println("Comparando o Mserv com Mfiss: " + calc.comparaMomentos());
		System.out.println();
		System.out.printf("In�rcia (cm4) = %.2f%n", calc.getInercia());
		System.out.println();
		System.out.printf("Flecha de curta dura��o (cm) = %.3f%n", calc.flechaCurtaDuracao());
		System.out.printf("Flecha de longa dura��o (cm) = %.3f%n", calc.flechaLongaDuracao());
		System.out.printf("Flecha admiss�vel       (cm) = %.3f%n", calc.flechaAdm());
		System.out.println("Comparando a FtInfinito com Fadm: " + calc.comparaFlechas());
		System.out.println();
		System.out.println("Momento de projeto (kN.cm/m) --> " + calc.calculaMomentoDeProjeto());
		System.out.println("Valores de X (cm) -------------> " + calc.calculaX());
		System.out.println();
		System.out.println("Valores de A�o (cm�/m) ----------> " + calc.calculaAco());
		System.out.println("Valores m�nimos de A�o (cm�/m) --> " + calc.calculaAsMin());
		System.out.println("Decis�o dos a�os (cm�/m) --------> " + calc.decideAco());
		System.out.println();
		System.out.println("ESCOLHER O A�O POSITIVO EM X - �REA DE A�O = " + calc.getAsX());
		consulta.pesquisaEspacamento(1.65);
		System.out.println();
		System.out.println("ESCOLHER O A�O POSITIVO EM Y - �REA DE A�O = " + calc.getAsY());
		consulta.pesquisaEspacamento(0.9);
		System.out.println();
		System.out.println("ESCOLHER O A�O NEGATIVO EM X - �REA DE A�O = " + calc.getAsX1());
		consulta.pesquisaEspacamento(2.61);
		System.out.println();
		System.out.println("ESCOLHER O A�O NEGATIVO EM Y - �REA DE A�O = " + calc.getAsY1());
		consulta.pesquisaEspacamento(1.66);
		System.out.println();
		System.out.println("Rea��es = (kN/m) --> " + calc.calculaRecaoTotal());
		System.out.println();
		System.out.printf("Rea��es totais ------------> =  %.2f%n", calc.somaReacoes());
		System.out.println();
		System.out.printf("Rea��es totais anal�tico --> =  %.2f%n", calc.reacaoAnalitica());
		System.out.println();
		System.out.printf("Percentual de erro: %.2f%n", calc.calculaErro());
		
	}

}