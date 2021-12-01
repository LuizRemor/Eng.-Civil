package testeLaje.model;

public class VariaveisLaje {

	private Double ladoX;
	private Double ppConcreto;
	private Double gamaConcreto;
	private Double pContrapiso;
	private Double gamaContrapiso;
	private Double pPiso;
	private Double gamaPiso;
	private Double pForro;
	private Double ladoY;
	private Double area;
	private Double a;
	private Double b;
	private Double cargaQ;
	private Double cargaG;
	private Double cargaTotalP;
	private Double espessuraRevestimento;
	private Double espessuraContraPiso;
	private Double espessuraLaje;
	private Double psi2;
	private Double pServ;
	private Double fcd;
	private Double fck;
	private Double fcs;
	private Double fctm;
	private Double fctkInf;
	private Double fctd;
	private Double fyk;
	private Double fyd;
	private Double mFiss;
	private Double mX;
	private Double Xx;
	private Double Xy;
	private Double Xx1;
	private Double Xy1;
	private Double Kx;
	private Double Ky;
	private Double Kx1;
	private Double Ky1;
	private Double miX;
	private Double miY;
	private Double miX1;
	private Double miY1;
	private Double Qx;
	private Double Qy;
	private Double Qx1;
	private Double Qy1;
	private Double mServ;
	private Double inercia;
	private Double coeficienteK;
	private Double coeficienteMx;
	private Double ft0;
	private Double ftInfinito;
	private Double fAdm;
	private Double d;
	private Double x;
	private Double asX;
	private Double asY;
	private Double asX1;
	private Double asY1;
	private Double asMinPos;
	private Double asMinNeg;

	public VariaveisLaje() {
		
	}

	public VariaveisLaje(Double ladoX, Double ppConcreto, Double gamaConcreto, Double pContrapiso,
			Double gamaContrapiso, Double pPiso, Double gamaPiso, Double pForro, Double ladoY, Double area, Double a,
			Double b, Double cargaQ, Double cargaG, Double cargaTotalP, Double espessuraRevestimento,
			Double espessuraContraPiso, Double espessuraLaje, Double psi2, Double pServ, Double fcd, Double fck,
			Double fcs, Double fctm, Double fctkInf, Double fctd, Double fyk, Double fyd, Double mFiss, Double mX,
			Double xx, Double xy, Double xx1, Double xy1, Double kx, Double ky, Double kx1, Double ky1, Double miX,
			Double miY, Double miX1, Double miY1, Double qx, Double qy, Double qx1, Double qy1, Double mServ,
			Double inercia, Double coeficienteK, Double ft0, Double ftInfinito, Double fAdm, Double d, Double x,
			Double asX, Double asY, Double asX1, Double asY1, Double asMinPos, Double asMinNeg, Double coeficienteMx) {
		super();
		this.ladoX = ladoX;
		this.ppConcreto = ppConcreto;
		this.gamaConcreto = gamaConcreto;
		this.pContrapiso = pContrapiso;
		this.gamaContrapiso = gamaContrapiso;
		this.pPiso = pPiso;
		this.gamaPiso = gamaPiso;
		this.pForro = pForro;
		this.ladoY = ladoY;
		this.area = area;
		this.a = a;
		this.b = b;
		this.cargaQ = cargaQ;
		this.cargaG = cargaG;
		this.cargaTotalP = cargaTotalP;
		this.espessuraRevestimento = espessuraRevestimento;
		this.espessuraContraPiso = espessuraContraPiso;
		this.espessuraLaje = espessuraLaje;
		this.psi2 = psi2;
		this.pServ = pServ;
		this.fcd = fcd;
		this.fck = fck;
		this.fcs = fcs;
		this.fctm = fctm;
		this.fctkInf = fctkInf;
		this.fctd = fctd;
		this.fyk = fyk;
		this.fyd = fyd;
		this.mFiss = mFiss;
		this.mX = mX;
		Xx = xx;
		Xy = xy;
		Xx1 = xx1;
		Xy1 = xy1;
		Kx = kx;
		Ky = ky;
		Kx1 = kx1;
		Ky1 = ky1;
		this.miX = miX;
		this.miY = miY;
		this.miX1 = miX1;
		this.miY1 = miY1;
		Qx = qx;
		Qy = qy;
		Qx1 = qx1;
		Qy1 = qy1;
		this.mServ = mServ;
		this.inercia = inercia;
		this.coeficienteK = coeficienteK;
		this.ft0 = ft0;
		this.ftInfinito = ftInfinito;
		this.fAdm = fAdm;
		this.d = d;
		this.x = x;
		this.asX = asX;
		this.asY = asY;
		this.asX1 = asX1;
		this.asY1 = asY1;
		this.asMinPos = asMinPos;
		this.asMinNeg = asMinNeg;
		this.coeficienteMx = coeficienteMx;
	}
	
	public Double getCoeficienteMx() {
		return coeficienteMx;
	}

	public void setCoeficienteMx(Double coeficienteMx) {
		this.coeficienteMx = coeficienteMx;
	}

	public Double getLadoX() {
		return ladoX;
	}

	public void setLadoX(Double ladoX) {
		this.ladoX = ladoX;
	}

	public Double getPpConcreto() {
		return ppConcreto;
	}

	public void setPpConcreto(Double ppConcreto) {
		this.ppConcreto = ppConcreto;
	}

	public Double getGamaConcreto() {
		return gamaConcreto;
	}

	public void setGamaConcreto(Double gamaConcreto) {
		this.gamaConcreto = gamaConcreto;
	}

	public Double getpContrapiso() {
		return pContrapiso;
	}

	public void setpContrapiso(Double pContrapiso) {
		this.pContrapiso = pContrapiso;
	}

	public Double getGamaContrapiso() {
		return gamaContrapiso;
	}

	public void setGamaContrapiso(Double gamaContrapiso) {
		this.gamaContrapiso = gamaContrapiso;
	}

	public Double getpPiso() {
		return pPiso;
	}

	public void setpPiso(Double pPiso) {
		this.pPiso = pPiso;
	}

	public Double getGamaPiso() {
		return gamaPiso;
	}

	public void setGamaPiso(Double gamaPiso) {
		this.gamaPiso = gamaPiso;
	}

	public Double getpForro() {
		return pForro;
	}

	public void setpForro(Double pForro) {
		this.pForro = pForro;
	}

	public Double getLadoY() {
		return ladoY;
	}

	public void setLadoY(Double ladoY) {
		this.ladoY = ladoY;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	public Double getCargaQ() {
		return cargaQ;
	}

	public void setCargaQ(Double cargaQ) {
		this.cargaQ = cargaQ;
	}

	public Double getCargaG() {
		return cargaG;
	}

	public void setCargaG(Double cargaG) {
		this.cargaG = cargaG;
	}

	public Double getCargaTotalP() {
		return cargaTotalP;
	}

	public void setCargaTotalP(Double cargaTotalP) {
		this.cargaTotalP = cargaTotalP;
	}

	public Double getEspessuraRevestimento() {
		return espessuraRevestimento;
	}

	public void setEspessuraRevestimento(Double espessuraRevestimento) {
		this.espessuraRevestimento = espessuraRevestimento;
	}

	public Double getEspessuraContraPiso() {
		return espessuraContraPiso;
	}

	public void setEspessuraContraPiso(Double espessuraContraPiso) {
		this.espessuraContraPiso = espessuraContraPiso;
	}

	public Double getEspessuraLaje() {
		return espessuraLaje;
	}

	public void setEspessuraLaje(Double espessuraLaje) {
		this.espessuraLaje = espessuraLaje;
	}

	public Double getPsi2() {
		return psi2;
	}

	public void setPsi2(Double psi2) {
		this.psi2 = psi2;
	}

	public Double getpServ() {
		return pServ;
	}

	public void setpServ(Double pServ) {
		this.pServ = pServ;
	}

	public Double getFcd() {
		return fcd;
	}

	public void setFcd(Double fcd) {
		this.fcd = fcd;
	}

	public Double getFck() {
		return fck;
	}

	public void setFck(Double fck) {
		this.fck = fck;
	}

	public Double getFcs() {
		return fcs;
	}

	public void setFcs(Double fcs) {
		this.fcs = fcs;
	}

	public Double getFctm() {
		return fctm;
	}

	public void setFctm(Double fctm) {
		this.fctm = fctm;
	}

	public Double getFctkInf() {
		return fctkInf;
	}

	public void setFctkInf(Double fctkInf) {
		this.fctkInf = fctkInf;
	}

	public Double getFctd() {
		return fctd;
	}

	public void setFctd(Double fctd) {
		this.fctd = fctd;
	}

	public Double getFyk() {
		return fyk;
	}

	public void setFyk(Double fyk) {
		this.fyk = fyk;
	}

	public Double getFyd() {
		return fyd;
	}

	public void setFyd(Double fyd) {
		this.fyd = fyd;
	}

	public Double getmFiss() {
		return mFiss;
	}

	public void setmFiss(Double mFiss) {
		this.mFiss = mFiss;
	}

	public Double getmX() {
		return mX;
	}

	public void setmX(Double mX) {
		this.mX = mX;
	}

	public Double getXx() {
		return Xx;
	}

	public void setXx(Double xx) {
		Xx = xx;
	}

	public Double getXy() {
		return Xy;
	}

	public void setXy(Double xy) {
		Xy = xy;
	}

	public Double getXx1() {
		return Xx1;
	}

	public void setXx1(Double xx1) {
		Xx1 = xx1;
	}

	public Double getXy1() {
		return Xy1;
	}

	public void setXy1(Double xy1) {
		Xy1 = xy1;
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

	public Double getQx() {
		return Qx;
	}

	public void setQx(Double qx) {
		Qx = qx;
	}

	public Double getQy() {
		return Qy;
	}

	public void setQy(Double qy) {
		Qy = qy;
	}

	public Double getQx1() {
		return Qx1;
	}

	public void setQx1(Double qx1) {
		Qx1 = qx1;
	}

	public Double getQy1() {
		return Qy1;
	}

	public void setQy1(Double qy1) {
		Qy1 = qy1;
	}

	public Double getmServ() {
		return mServ;
	}

	public void setmServ(Double mServ) {
		this.mServ = mServ;
	}

	public Double getInercia() {
		return inercia;
	}

	public void setInercia(Double inercia) {
		this.inercia = inercia;
	}

	public Double getCoeficienteK() {
		return coeficienteK;
	}

	public void setCoeficienteK(Double coeficienteK) {
		this.coeficienteK = coeficienteK;
	}

	public Double getFt0() {
		return ft0;
	}

	public void setFt0(Double ft0) {
		this.ft0 = ft0;
	}

	public Double getFtInfinito() {
		return ftInfinito;
	}

	public void setFtInfinito(Double ftInfinito) {
		this.ftInfinito = ftInfinito;
	}

	public Double getfAdm() {
		return fAdm;
	}

	public void setfAdm(Double fAdm) {
		this.fAdm = fAdm;
	}

	public Double getD() {
		return d;
	}

	public void setD(Double d) {
		this.d = d;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getAsX() {
		return asX;
	}

	public void setAsX(Double asX) {
		this.asX = asX;
	}

	public Double getAsY() {
		return asY;
	}

	public void setAsY(Double asY) {
		this.asY = asY;
	}

	public Double getAsX1() {
		return asX1;
	}

	public void setAsX1(Double asX1) {
		this.asX1 = asX1;
	}

	public Double getAsY1() {
		return asY1;
	}

	public void setAsY1(Double asY1) {
		this.asY1 = asY1;
	}

	public Double getAsMinPos() {
		return asMinPos;
	}

	public void setAsMinPos(Double asMinPos) {
		this.asMinPos = asMinPos;
	}

	public Double getAsMinNeg() {
		return asMinNeg;
	}

	public void setAsMinNeg(Double asMinNeg) {
		this.asMinNeg = asMinNeg;
	}
	
}