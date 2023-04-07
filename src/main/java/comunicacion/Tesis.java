package comunicacion;

public class Tesis extends Escrito{
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	//Getters and Setters
	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String[] getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//Methods
	public int palabrasTotales(int number) {
		int factor = 5;
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
		string += this.getIdea() + "\n";
		string += this.getArgumentos().length + "\n";
		string += this.getConclusion() + "\n";
		string += this.getReferencias() + "\n";
		
		return  string;
	}
}
