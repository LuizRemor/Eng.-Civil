package testeLaje.model;

public class Coeficientes {
	
	private Double caso;
	private Double lambda;
	private Double miX;
	private Double miY;
	private Double miX1;
	private Double miY1;
	private Double Kx;
	private Double Ky;
	private Double Kx1;
	private Double Ky1;
		
	public Coeficientes() {
		
	}

	public Coeficientes(Double caso, Double lambda, Double miX, Double miY, Double miX1, Double miY1, Double kx,
			Double ky, Double kx1, Double ky1) {
		super();
		this.caso = caso;
		this.lambda = lambda;
		this.miX = miX;
		this.miY = miY;
		this.miX1 = miX1;
		this.miY1 = miY1;
		Kx = kx;
		Ky = ky;
		Kx1 = kx1;
		Ky1 = ky1;
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

	public Double getMiX() {
		return miX;
	}

	public void setMiX(Double miX) {
		this.miX = miX;
	}

	public Double getMiY() {
		return miY;
	}

	public void setMiY(Double miY) {
		this.miY = miY;
	}

	public Double getMiX1() {
		return miX1;
	}

	public void setMiX1(Double miX1) {
		this.miX1 = miX1;
	}

	public Double getMiY1() {
		return miY1;
	}

	public void setMiY1(Double miY1) {
		this.miY1 = miY1;
	}

	public Double getKx() {
		return Kx;
	}

	public void setKx(Double kx) {
		Kx = kx;
	}

	public Double getKy() {
		return Ky;
	}

	public void setKy(Double ky) {
		Ky = ky;
	}

	public Double getKx1() {
		return Kx1;
	}

	public void setKx1(Double kx1) {
		Kx1 = kx1;
	}

	public Double getKy1() {
		return Ky1;
	}

	public void setKy1(Double ky1) {
		Ky1 = ky1;
	}

}