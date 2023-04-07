package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}

	//Getters and Setters
	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//Methods
	public int palabrasTotales(int number) {
		int factor = 1;
		int total = super.getPaginas() * number * factor;
		
		return total;
	}
	
	public String interpretacion() {
		return getInterpretacion();
	}
	
	public String toString() {
		String string = super.getOrigen() + "\n";
		string += super.getTitulo() + "\n";
		string += super.getAutor() + "\n";
		string += super.getPaginas() + "\n";
		string += this.getEnsenanza() + "\n";
		
		return  string;
	}
}
