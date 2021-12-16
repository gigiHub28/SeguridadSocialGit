package modelo;

public class ModeloConsultas {
	private String sqlInsert;
	private String existeUsuario;
	private String nomUsuario;

	public ModeloConsultas() {

	}

	public String getSqlInsert() {
		sqlInsert = "INSERT INTO usuarios (nombre,apellido,dni,password_usuario,correo_usuario,tipo_usuario) "
				+ "VALUES(?,?,?,?,?,?)";

		return sqlInsert;
	}

	public void setSqlInsert(String sqlInsert) {
		this.sqlInsert = sqlInsert;
	}

	public String getExisteUsuario(String dni, String email) {
		existeUsuario = "SELECT * FROM usuarios WHERE dni = '" + dni + "' OR correo_usuario = '" + email + "'";
		return existeUsuario;
	}

	public void setExisteUsuario(String existeUsuario) {
		this.existeUsuario = existeUsuario;
	}

	public String getNomUsuario(String dni, String passwd) {
		nomUsuario = "SELECT nombre from usuarios where dni like '" + dni + "' and password_usuario like '" + passwd + "'";
		return nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

}
