package model;

//import java.util.ArrayList;
//import java.util.List;

public class Maraton {
	//private int numProgramadores;
	private Programador programadorRaiz;
	//private List<Programador> programadores;
	
	public Maraton() {
		//programadores = new ArrayList<Programador>();
	}
	
	public Programador getProgramadorRaiz() {
		return programadorRaiz;
	}

	public void setProgramadorRaiz(Programador programadorRaiz) {
		this.programadorRaiz = programadorRaiz;
	}
	
	
	/**
	  * Retorna una colección con los nombres de todos los programadores, ordenados alfabéticamente en orden ascendente 
	  * @param acumulado colección donde se van agregando los nombres de los programadores ordenadamente
	  */
	 public void inorden(String nombre, String telefono, String direccion,String eMail){
		 Programador nuevoProgramador = new Programador(nombre,telefono,direccion,eMail);
			if(programadorRaiz==null) {
				programadorRaiz = nuevoProgramador;
			}else {
				inorden(programadorRaiz,nuevoProgramador);
			}
	 }
	 
	 private void inorden(Programador actual, Programador nuevoProgramador) {
		 if ((nuevoProgramador.getNombre().compareToIgnoreCase(actual.getNombre())) <= 0) {
				if (actual.getIzquierda() == null) {
					actual.setIzquierda(nuevoProgramador);
					actual.setArriba(actual);
				}else {
					inorden(actual.getIzquierda(),nuevoProgramador);
				}
			}else {
				if(actual.getDerecha()==null) {
					actual.setDerecha(nuevoProgramador);
					nuevoProgramador.setArriba(actual);
				}else {
					inorden(actual.getDerecha(),nuevoProgramador);
				}
			}
	 }
	 
	 
	 /**
	  * Retorna la altura del árbol de programadores que comienza en este nodo
	  * @return altura del árbol que comienza en este nodo
	  */
	public int darAltura(Programador actual){
	   if(actual!=null) {
		   return 1+Math.max(darAltura(actual.getIzquierda()), darAltura(actual.getDerecha()));
	   }
	   return 0;
	}


	
	
	/*
	public void agregarProgramador(String nombre, String telefono, String direccion, String eMail) {
		programadores.add(new Programador(nombre,telefono,direccion,eMail));
	}
	
	public List<Programador> getProgramadores(){
		return this.programadores;
	}
	
	*/
	/*
	public void agregarProgramador(String nombre, String telefono, String direccion, String eMail) {
		Programador nuevoProgramador = new Programador(nombre,telefono,direccion,eMail);
		if(programadorRaiz==null) {
			programadorRaiz = nuevoProgramador;
		}else {
			agregarProgramador(programadorRaiz,nuevoProgramador);
		}
	}
	
	//Ordenar alfabeticamente
	private void agregarProgramador(Programador current, Programador nuevoProgramador) {
		if ((nuevoProgramador.getNombre().compareToIgnoreCase(current.getNombre())) <= 0) {
			if (current.getIzquierda() == null) {
				current.setIzquierda(nuevoProgramador);
				current.setArriba(current);
			}else {
				agregarProgramador(current.getIzquierda(),nuevoProgramador);
			}
		}else {
			if(current.getDerecha()==null) {
				current.setDerecha(nuevoProgramador);
				nuevoProgramador.setArriba(current);
			}else {
				agregarProgramador(current.getDerecha(),nuevoProgramador);
			}
		}
	}
	*/
	
}
