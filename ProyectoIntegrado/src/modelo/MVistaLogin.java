package modelo;

public class MVistaLogin {

	private String lbltitulo;
	private String urlImg;
	private String lblDNI;
	private String lblPswdd;
	private String lblRegister;
	private String btRegistrarse;
	private String btEntrar;
	
	public MVistaLogin(){
		lbltitulo = "INICIAR SESIÓN";
		urlImg = "C:\\Users\\javie\\Documents\\logo2.png";
		lblDNI = "DNI";
		lblPswdd = "CONTRASE\u00D1A";
		lblRegister = "\u00BFTodav\u00EDa no te has registrado?";
		btRegistrarse = "Registrarse";
		btEntrar = "Entrar";
	}

	public String getLbltitulo() {
		return lbltitulo;
	}

	public void setLbltitulo(String lbltitulo) {
		this.lbltitulo = lbltitulo;
	}

	public String getUrlImg() {
		return urlImg;
	}

	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}

	public String getLblDNI() {
		return lblDNI;
	}

	public void setLblDNI(String lblDNI) {
		this.lblDNI = lblDNI;
	}

	public String getLblPswdd() {
		return lblPswdd;
	}

	public void setLblPswdd(String lblPswdd) {
		this.lblPswdd = lblPswdd;
	}

	public String getLblRegister() {
		return lblRegister;
	}

	public void setLblRegister(String lblRegister) {
		this.lblRegister = lblRegister;
	}

	public String getBtRegistrarse() {
		return btRegistrarse;
	}

	public void setBtRegistrarse(String btRegistrarse) {
		this.btRegistrarse = btRegistrarse;
	}

	public String getBtEntrar() {
		return btEntrar;
	}

	public void setBtEntrar(String btEntrar) {
		this.btEntrar = btEntrar;
	}
	
	
}
