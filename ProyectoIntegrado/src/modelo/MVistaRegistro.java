package modelo;

public class MVistaRegistro {

	private String lblName;
	private String lblApellidos;
	private String lblNomUser;
	private String lblPassw;
	private String lblCorreo;
	private String lblTipoUser;
	private String lblTitle;
	private String btnRegistro;
	private String lblConfirmacion;
	private String boxEmpresario;
	private String boxFuncionario;
	private String rutaIcono;

	public MVistaRegistro() {
		lblName = "NOMBRE";
		lblApellidos = "APELLIDO";
		lblNomUser = "DNI";
		lblPassw = "CONTRASEÑA";
		lblCorreo = "CORREO ELECTRÓNICO";
		lblTipoUser = "TIPO USUARIO";
		lblTitle = "CREAR REGISTRO";
		btnRegistro = "Registrar";
		lblConfirmacion = "CONFIRMAR CONTRASEÑA";
		boxEmpresario = "Empresario";
		boxFuncionario = "Funcionario";
		rutaIcono = "../resources//logo2.png";
	}

	public String getLblName() {
		return lblName;
	}

	public void setLblName(String lblName) {
		this.lblName = lblName;
	}

	public String getLblApellidos() {
		return lblApellidos;
	}

	public void setLblApellidos(String lblApellidos) {
		this.lblApellidos = lblApellidos;
	}

	public String getLblNomUser() {
		return lblNomUser;
	}

	public void setLblNomUser(String lblNomUser) {
		this.lblNomUser = lblNomUser;
	}

	public String getLblPassw() {
		return lblPassw;
	}

	public void setLblPassw(String lblPassw) {
		this.lblPassw = lblPassw;
	}

	public String getLblCorreo() {
		return lblCorreo;
	}

	public void setLblCorreo(String lblCorreo) {
		this.lblCorreo = lblCorreo;
	}

	public String getLblTipoUser() {
		return lblTipoUser;
	}

	public void setLblTipoUser(String lblTipoUser) {
		this.lblTipoUser = lblTipoUser;
	}

	public String getLblTitle() {
		return lblTitle;
	}

	public void setLblTitle(String lblTitle) {
		this.lblTitle = lblTitle;
	}

	public String getBtnRegistro() {
		return btnRegistro;
	}

	public void setBtnRegistro(String btnRegistro) {
		this.btnRegistro = btnRegistro;
	}

	public String getLblConfirmacion() {
		return lblConfirmacion;
	}

	public void setLblConfirmacion(String lblConfirmacion) {
		this.lblConfirmacion = lblConfirmacion;
	}

	public String getBoxEmpresario() {
		return boxEmpresario;
	}

	public void setBoxEmpresario(String boxEmpresario) {
		this.boxEmpresario = boxEmpresario;
	}

	public String getBoxFuncionario() {
		return boxFuncionario;
	}

	public void setBoxFuncionario(String boxFuncionario) {
		this.boxFuncionario = boxFuncionario;
	}

	public String getRutaIcono() {
		return rutaIcono;
	}

	public void setRutaIcono(String rutaIcono) {
		this.rutaIcono = rutaIcono;
	}

	
	
}
