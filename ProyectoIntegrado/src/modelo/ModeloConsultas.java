package modelo;

public class ModeloConsultas {
	private String sqlInsert;
	private String existeUsuario;

	public ModeloConsultas() {

	}

	public String getSqlInsert() {
		sqlInsert = "INSERT INTO usuarios (nombre,apellido,nombre_usuario,contrasenia_usuario,correo_usuario,tipo_usuario) "
				+ "VALUES(?,?,?,?,?,?)";

		return sqlInsert;
	}

	public void setSqlInsert(String sqlInsert) {
		this.sqlInsert = sqlInsert;
	}

	public String getExisteUsuario(String nombreUsuario, String email) {
		existeUsuario = "SELECT * FROM usuarios WHERE nombre_usuario = '" + nombreUsuario + "' OR correo_usuario = '"
				+ email + "'";
		return existeUsuario;
	}

	public void setExisteUsuario(String existeUsuario) {
		this.existeUsuario = existeUsuario;
	}

}
