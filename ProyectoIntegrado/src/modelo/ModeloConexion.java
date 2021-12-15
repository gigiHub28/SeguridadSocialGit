package modelo;

public class ModeloConexion {
	private String driver;
	private String url;
	private String user;
	private String password;

	public ModeloConexion() {
		driver = "com.mysql.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/seguridad_social";
		user = "root";
		password = "";
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsuario() {
		return user;
	}

	public void setUsuario(String usuario) {
		this.user = usuario;
	}

	public String getContrasenia() {
		return password;
	}

	public void setContrasenia(String contrasenia) {
		this.password = contrasenia;
	}
}
