package ubu.gii.dass.refactoring;
/**
 * Tema Refactorizaciones
 * 
 * Ejemplo de aplicación de refactorizaciones. Actualizado para colecciones
 * genéricas de java 1.5
 * 
 * @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos López</A>
 * @version 1.1
 * @see java.io.File
 * 
 */

public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private String _title;
	private MovieType movieType;

	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return movieType.getType();
	}

	public void setPriceCode(int arg) {
		switch(arg){
		case CHILDRENS:
			movieType = new Childrens();
			break;
		case REGULAR:
			movieType = new Regular();
			break;
		case NEW_RELEASE:
			movieType = new NewRelease();
			break;
		default:
			throw new IllegalArgumentException("Incorrect Movie Code");
		}
	}

	public String getTitle() {
		return _title;
	}
}
