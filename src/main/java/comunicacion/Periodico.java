package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	//Getters and Setters
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPrimicia() {
		return primicia;
	}

	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//Methods
	public int palabrasTotales(int number) {
		int factor = 10;
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
		string += this.getFecha() + "\n";
		string += this.getPrimicia() + "\n";
		
		return  string;
	}
}
