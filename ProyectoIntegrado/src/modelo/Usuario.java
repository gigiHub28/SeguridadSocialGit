package modelo;

public class Usuario {

	private int id_usuario;
	private String nombre;
	private String apellidos;
	private String dni;
	private String contra;
	private String correoElec;
	private String tipo_usu;

	public Usuario() {

	}

	public Usuario(String nombre, String apellidos, String nombre_usu, String contra, String correoElec,
			String tipo_usu) {

		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = nombre_usu;
		this.contra = contra;
		this.correoElec = correoElec;
		this.tipo_usu = tipo_usu;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String nombre_usu) {
		this.dni = nombre_usu;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public String getCorreoElec() {
		return correoElec;
	}

	public void setCorreoElec(String correoElec) {
		correoElec = correoElec;
	}

	public String getTipo_usu() {
		return tipo_usu;
	}

	public void setTipo_usu(String tipo_usu) {
		this.tipo_usu = tipo_usu;
	}

}
