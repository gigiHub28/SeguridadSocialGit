package modelo;

public class MVistaFTP {

	private String titulo;
	private String[] btnNombres = { "Subir archivo", "Bajar archivo", "Renombrar archivo", "Crear carpeta",
			"Borrar carpeta", "Renombrar carpeta", "Salir" };

	public MVistaFTP() {

		titulo = "FTP";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String[] getBtnNombres() {
		return btnNombres;
	}

	public void setBtnNombres(String[] btnNombres) {
		this.btnNombres = btnNombres;
	}

}
