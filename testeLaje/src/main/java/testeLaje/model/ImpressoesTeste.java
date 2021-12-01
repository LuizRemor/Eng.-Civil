/*package testeLaje.model;

public class ImpressoesTeste {

	public static void main(String[] args) {
		
		Calculos calc = new Calculos();
		
		System.out.printf("Carga total (kN/m²)      = %.2f%n", calc.cargaTotal());
		System.out.printf("Carga permanente (kN/m²) = %.2f%n", calc.cargaPermanente());
		System.out.printf("Carga de serviço (kN/m²) = %.2f%n", calc.cargaDeServico());
		System.out.println();
		System.out.println("" + calc.verificaDirecoes());
		System.out.println();
		System.out.printf("Eci (MPa)    = %.2f%n", calc.eCi());
		System.out.printf("Ecs (kN/cm²) = %.2f%n", calc.eCs());
		System.out.println();
		System.out.printf("Fcd (kN/cm²)  = %.2f%n", calc.getFcd());
		System.out.printf("Fctm (MPa)    = %.2f%n", calc.getFctm());
		System.out.printf("FctkInf (MPa) = %.2f%n", calc.getFctkInf());
		System.out.printf("Fctd (kN/cm²) = %.2f%n", calc.getFctd());
		System.out.println();
		System.out.printf("a/b ---------> = %.3f%n", calc.ajustaAB());
		System.out.printf("Coeficiente Mx = %.3f%n", calc.getCoeficienteMx());
		System.out.printf("Lambda = %.2f%n", calc.ajustaLambda());
		System.out.println();
		System.out.printf("Momento de serviço    (kN.cm / m) = %.3f%n", calc.momentoDeServico());
		System.out.printf("Momento de fissuração (kN.cm / m) = %.2f%n", calc.momentoDeFissuracao());
		System.out.println("Comparando o Mserv com Mfiss: " + calc.comparaMomentos());
		System.out.println();
		System.out.printf("Inércia (cm4) = %.2f%n", calc.getInercia());
		System.out.println();
		System.out.printf("Flecha de curta duração (cm) = %.3f%n", calc.flechaCurtaDuracao());
		System.out.printf("Flecha de longa duração (cm) = %.3f%n", calc.flechaLongaDuracao());
		System.out.printf("Flecha admissível       (cm) = %.3f%n", calc.flechaAdm());
		System.out.println("Comparando a FtInfinito com Fadm: " + calc.comparaFlechas());
		System.out.println();
		System.out.println("Momento de projeto (kN.cm/m) --> " + calc.calculaMomentoDeProjeto());
		System.out.println("Valores de X (cm) -------------> " + calc.calculaX());
		System.out.println();
		System.out.println("Valores de Aço (cm²/m) ----------> " + calc.calculaAco());
		System.out.println("Valores mínimos de Aço (cm²/m) --> " + calc.calculaAsMin());
		System.out.println("Decisão dos aços (cm²/m) --------> " + calc.decideAco());
		System.out.println();
		System.out.println("Reações = (kN/m) --> " + calc.calculaRecaoTotal());
		System.out.println();
		System.out.printf("Reações totais ------------> =  %.2f%n", calc.somaReacoes());
		System.out.println();
		System.out.printf("Reações totais analítico --> =  %.2f%n", calc.reacaoAnalitica());
		System.out.println();
		System.out.printf("Percentual de erro: %.2f%n", calc.calculaErro());
		
	}

}*/