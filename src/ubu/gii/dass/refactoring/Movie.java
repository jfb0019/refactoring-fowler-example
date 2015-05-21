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
		case MovieType.CHILDRENS:
			movieType = new Childrens();
			break;
		case MovieType.REGULAR:
			movieType = new Regular();
			break;
		case MovieType.NEW_RELEASE:
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
