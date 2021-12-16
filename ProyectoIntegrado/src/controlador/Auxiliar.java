package controlador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auxiliar {

	public Auxiliar() {

	}

	public static String getHash(String txt, String hashType) {
		try {
			java.security.MessageDigest md = java.security.MessageDigest.getInstance(hashType);
			byte[] array = md.digest(txt.getBytes());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length; ++i) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
			}
			return sb.toString();
		} catch (java.security.NoSuchAlgorithmException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public static String md5(String txt) {
		return Auxiliar.getHash(txt, "MD5");
	}

	public static String sha1(String txt) {
		return Auxiliar.getHash(txt, "SHA1");
	}

	private static String calcularLetraNif(String nifString) {

		int nifInteger = Integer.valueOf(nifString);
		String[] abecedario = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q",
				"V", "H", "L", "C", "K", "E" };
		int posicion = nifInteger % 23;
		return abecedario[posicion];
	}

	public static boolean isnumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public static boolean comprobarNif(String nif) {
		
		char [] array;
		array = nif.toCharArray();
		
		try {
			// Comprobación de la longitud del nif
			if (nif.length() != 9) {
				return false;
			}
			// Extracción los numeros y las letras del nif
			String numerosNif = nif.substring(0, nif.length() - 1);
			String letra = String.valueOf(array[8]);
			System.out.println(letra);

			if (!isnumeric(numerosNif)) {
				System.out.println("cr7");
				// No se puede convertir la cadena a formato númerico
				return false;
			}
			System.out.println(calcularLetraNif(numerosNif));
			if (!calcularLetraNif(numerosNif).equals(letra)) {
				System.out.println("messi");
				return false;
			}
			System.out.println("lucas");
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

		public static boolean validate(String emailStr) {
		        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		        return matcher.find();
		}

}
