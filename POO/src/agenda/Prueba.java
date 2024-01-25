package agenda;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contacto javier = new Contacto("javier", 670375735);
		System.out.println(javier);
		
		
		AgendaConArray agenda1 = new AgendaConArray();
		AgendaConArray agenda2 = new AgendaConArray(42);
		AgendaConArray agenda3 = new AgendaConArray(agenda2.getContactos());
		
	}

}
