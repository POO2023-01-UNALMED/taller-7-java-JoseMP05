package comunicacion;

public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	//Getters and Setters
	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}



	public String getInterpretacion() {
		return interpretacion;
	}



	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}


	//Methods
	public int cantidadLetras(){
		return letras.length;
	}
	
	public String interpretacion() {
		return getInterpretacion();
	}
	
	public String toString() {
		String string = ""; 
		for(String letra: letras) {
			string += letra + ",";
		}
		
		return string;
	}
}
