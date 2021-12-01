package testeLaje.model;

public class CoeficienteMx {
	
	public Double caso;
	public Double lambda;
	public Double coeficiente;
	
	public CoeficienteMx() {
		
	}

	public CoeficienteMx(Double caso, Double lambda, Double coeficiente) {
		super();
		this.caso = caso;
		this.lambda = lambda;
		this.coeficiente = coeficiente;
	}

	public Double getCaso() {
		return caso;
	}

	public void setCaso(Double caso) {
		this.caso = caso;
	}

	public Double getLambda() {
		return lambda;
	}

	public void setLambda(Double lambda) {
		this.lambda = lambda;
	}

	public Double getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(Double coeficiente) {
		this.coeficiente = coeficiente;
	}
	
}