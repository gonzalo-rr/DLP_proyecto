package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String str) {
		try {
			// '\126'
			if (str.equals("'\\t'")) {
				return '\t';
			} else if (str.equals("'\\n'")) {
				return '\n';
			} else if (str.equals("'\\r'")) {
				return '\r';
			}
			if (str.charAt(1) == ('\\')) {
				if (str.length() > 3) {
					return (char) Integer.parseInt(str.substring(2, str.length() - 1));
				}
			} else {
				return str.charAt(1);
			}
		} catch (NullPointerException | IllegalArgumentException e) {
			System.out.println(e);
		}
		return '_';
	}

	public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static boolean lexemeToBool(String str) {
		try {
			return Boolean.parseBoolean(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return false;
	}

}
