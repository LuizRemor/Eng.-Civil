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
	private Double fck;
	private Double fcs;
	private Double fctm;
	private Double fctkInf;
	private Double fctd;
	private Double mFiss;
	private Double mX;
	private Double mServ;
	private Double inercia;
	private Double coeficienteK;
	private Double ft0;
	private Double ftInfinito;
	private Double fAdm;
	private Double lambda;
	private Double d;
	private Double x;
	private Double as;
	private Double asMinPos;
	private Double asMinNeg;

	public VariaveisLaje() {

	}

	public VariaveisLaje(Double ladoX, Double ppConcreto, Double gamaConcreto, Double pContrapiso,
			Double gamaContrapiso, Double pPiso, Double gamaPiso, Double pForro, Double ladoY, Double area, Double a,
			Double b, Double cargaQ, Double cargaG, Double espessuraRevestimento, Double espessuraContraPiso,
			Double espessuraLaje, Double pServ, Double fcs, Double fctm, Double fctkInf, Double fctd, Double mFiss,
			Double mX, Double mServ, Double inercia, Double ft0, Double ftInfinito, Double fAdm, Double lambda,
			Double d, Double x, Double as, Double asMinPos, Double asMinNeg, Double cargaTotalP, Double psi2,
			Double fck, Double coeficienteK) {
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
		this.espessuraRevestimento = espessuraRevestimento;
		this.espessuraContraPiso = espessuraContraPiso;
		this.espessuraLaje = espessuraLaje;
		this.pServ = pServ;
		this.fcs = fcs;
		this.fctm = fctm;
		this.fctkInf = fctkInf;
		this.fctd = fctd;
		this.mFiss = mFiss;
		this.mX = mX;
		this.mServ = mServ;
		this.inercia = inercia;
		this.ft0 = ft0;
		this.ftInfinito = ftInfinito;
		this.fAdm = fAdm;
		this.lambda = lambda;
		this.d = d;
		this.x = x;
		this.as = as;
		this.asMinPos = asMinPos;
		this.asMinNeg = asMinNeg;
		this.cargaTotalP = cargaTotalP;
		this.psi2 = psi2;
		this.fck = fck;
		this.coeficienteK = coeficienteK;
	}
	
	
	
	public Double getCoeficienteK() {
		return coeficienteK;
	}

	public void setCoeficienteK(Double coeficienteK) {
		this.coeficienteK = coeficienteK;
	}

	public Double getFck() {
		return fck;
	}

	public void setFck(Double fck) {
		this.fck = fck;
	}

	public Double getPsi2() {
		return psi2;
	}

	public void setPsi2(Double psi2) {
		this.psi2 = psi2;
	}

	public Double getCargaTotalP() {
		return cargaTotalP;
	}

	public void setCargaTotalP(Double cargaTotalP) {
		this.cargaTotalP = cargaTotalP;
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

	public Double getpServ() {
		return pServ;
	}

	public void setpServ(Double pServ) {
		this.pServ = pServ;
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

	public Double getLambda() {
		return lambda;
	}

	public void setLambda(Double lambda) {
		this.lambda = lambda;
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

	public Double getAs() {
		return as;
	}

	public void setAs(Double as) {
		this.as = as;
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