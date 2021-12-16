package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.ModeloConexion;
import modelo.Usuario;

public class ConexionBD {
	private Statement miStatement;
	private Connection miConexion;
	private ResultSet result;
	private ModeloConexion miModelo;
	private Usuario miUsuario;
	private PreparedStatement ps;

	public ConexionBD() {
		miModelo = new ModeloConexion();
		miUsuario = new Usuario();
	}

	public void crearConexion() {
		try {
			// cargar el driver
			Class.forName("com.mysql.jdbc.Driver");

			// establecemos la conexion con la BD
			miConexion = DriverManager.getConnection(miModelo.getUrl(), miModelo.getUsuario(),
					miModelo.getContrasenia());

			// establecer conexion BD
			miStatement = miConexion.createStatement();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public boolean insertUsuario(Usuario usuario, String sql) {

		try {
			ps = miConexion.prepareStatement(sql);
			ps.setString(1, usuario.getNombre());
			ps.setString(2, usuario.getApellidos());
			ps.setString(3, usuario.getDni());
			ps.setString(4, usuario.getContra());
			ps.setString(5, usuario.getCorreoElec());
			ps.setString(6, usuario.getTipo_usu());
			ps.executeUpdate();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean existeUsusuario(String sql) {

		try {
			result = miStatement.executeQuery(sql);
			if (result.next()) {

				System.out.println("entroo");
				return true;
			}
			System.out.println("hola");
			return false;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}