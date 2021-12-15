package testeLaje.model;

public class EspacamentoBitola {
	
	private Double bitola;
	private Double espacamento;
	private Double area_aco;
	
	public EspacamentoBitola() {
		
	}

	public EspacamentoBitola(Double bitola, Double espacamento, Double area_aco) {
		super();
		this.bitola = bitola;
		this.espacamento = espacamento;
		this.area_aco = area_aco;
	}

	public Double getBitola() {
		return bitola;
	}

	public void setBitola(Double bitola) {
		this.bitola = bitola;
	}

	public Double getEspacamento() {
		return espacamento;
	}

	public void setEspacamento(Double espacamento) {
		this.espacamento = espacamento;
	}

	public Double getArea_aco() {
		return area_aco;
	}

	public void setArea_aco(Double area_aco) {
		this.area_aco = area_aco;
	}

	@Override
	public String toString() {
		return "[bitola = " + bitola + ", espacamento = " + espacamento + ", area_aco = " + area_aco + "]";
	}
	
}