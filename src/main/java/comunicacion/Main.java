package comunicacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fabula fabula = new Fabula("pensamiento", "La tortuga y la liebre", "Esopo", 2, "no se debe uno burlar de los demas, ni presumir o ser vanidoso", "Cuento corto");
//		System.out.println(fabula);
		String  comp = "pensamiento\n" +
				"La tortuga y la liebre\n" + 
				"Esopo\n" + 
				"2\n" +
				"no se debe uno burlar de los demas, ni presumir o ser vanidoso";
		boolean ok = false;
		if (fabula.toString().equals(comp)) {
			ok = true;
		}
		System.out.println(comp);
		System.out.println(ok);
		
//		Libro libro = new Libro("Creacion", "El resplandor", "Stephen King", 599,"N/A","Doubleday", "Primera", "no se");
//		String comp2 = "Creacion\n" + 
//				"El resplandor\n" + 
//				"Stephen King\n" + 
//				"599\n" + 
//				"N/A\n" + 
//				"Doubleday\n" + 
//				"Primera";
//		boolean ok2 = false;
//		if (libro.toString().equals(comp2)) {
//			ok2 = true;
//		}
//		
//		System.out.println(comp2);
//		System.out.println(ok2);
//		String  comp1 = "Creacion\n" + 
//				"El resplandor\n" + 
//				"Stephen King\n" + 
//				"599\n" + 
//				"N/A\n" + 
//				"Doubleday\n" + 
//				"Primera";
//		boolean ok3 = false;
//		if (libro.toString().equals(comp1)) {
//			ok3 = true;
//		}
//		System.out.println(ok3);
	}
}
