package model;

//import java.util.Collection;

public class Programador {
	private String nombre;
	private String telefono;
	private String direccion;
	private String eMail;
	
	public Programador arriba;
	public Programador izquierda;
	public Programador derecha;
	
	
	public Programador(String nombre, String telefono, String direccion, String eMail) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.eMail = eMail;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	public Programador getArriba() {
		return arriba;
	}

	public void setArriba(Programador arriba) {
		this.arriba = arriba;
	}

	public Programador getIzquierda() {
		return izquierda;
	}
	
	public void setIzquierda(Programador izquierda) {
		this.izquierda = izquierda;
	}

	public Programador getDerecha() {
		return derecha;
	}

	public void setDerecha(Programador derecha) {
		this.derecha = derecha;
	}
	
	@Override
	public String toString() {
		return "Programador: "+getNombre()+
				"\nTelefono: "+getTelefono()+
				"\nDireccion: "+getDireccion()+
				"\nCorreo electronico: "+geteMail();
	}
	
}
