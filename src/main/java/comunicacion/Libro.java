package comunicacion;

public class Libro extends Escrito{
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}

	//Getters and Setters
	public String getCo_autor() {
		return co_autor;
	}

	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
	//Methods
	public int palabrasTotales(int number) {
		int factor = 2;
		int total = super.getPaginas() * number * factor;
		
		return total;
	}
	
	public String interpretacion() {
		return getInterpretacion();
	}
	
	public String toString() {
		String string = this.getOrigen() + "\n";
		string += this.getTitulo() + "\n";
		string += this.getAutor() + "\n";
		string += this.getPaginas() + "\n";
		string += this.getCo_autor() + "\n";
		string += this.getEditorial()  + "\n";
		string += this.getEdicion() + "\n";
		
		return  string;
	}
}
