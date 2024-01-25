package agenda;

import java.util.ArrayList;

public class Agenda {
	
	//Atributos
	private ArrayList<Contacto> listaDeContactos;
	
	//Métodos
	public Agenda() { //Agenda vacía por defecto
		listaDeContactos= new ArrayList<Contacto>();
		
	}

	public Agenda(ArrayList<Contacto> listaDeContactos) {		//Clonar una agenda
		super();
		this.listaDeContactos = listaDeContactos;
	}

	public ArrayList<Contacto> getListaDeContactos() {
		return listaDeContactos;
	}

	public void setListaDeContactos(ArrayList<Contacto> listaDeContactos) {
		this.listaDeContactos = listaDeContactos;
	}
	
	//añadir un contacto
	public void add(Contacto nuevo) {
		this.listaDeContactos.add(nuevo);
	}

	//Borrar un contacto
	public boolean delete(Contacto viejo) {
		return this.listaDeContactos.remove(viejo);
	}
	
	//Borrar un contacto si me dan su nombre
	public boolean delete(String nombreViejo) {
		for (Contacto contacto : listaDeContactos) {
			if (contacto.getNombre().equals(nombreViejo)) {
				this.delete(contacto);
				return true;
			}
		}
		return false;
	}
	
}
