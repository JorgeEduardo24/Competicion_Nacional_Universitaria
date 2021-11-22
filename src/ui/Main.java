package ui;

import model.Maraton;
import model.Programador;

public class Main {
	private static Maraton maraton;
	public static void main(String[] args) {
		maraton = new Maraton();
		maraton.inorden("Eduardo Erazo", "3116448900", "Jerusalem-Pasto", "eduardo2410@gmail.com");
		maraton.inorden("Jorge Jojoa", "31154478970", "Bochalema-Cali", "jorgeduardo2140@yahoo.com");
		maraton.inorden("Camilo Guerrero", "3113348830", "Melendez-Cali", "camilo@gmail.com");
		maraton.inorden("Estefania Legarda", "3148572321", "Engativá-Bogotá", "estefa123@hotmail.com");
		maraton.inorden("Angela Ortiz", "3002119166", "El Poblado-Medellín", "angelita5@outlook.com");
		maraton.inorden("Pablo Lopez", "3245557889", "Villa del Prado-Pereira", "pablo951@u.icesi.edu.co");
		maraton.inorden("Maria Sandoval", "3169858619", "Los Cerros-Cartagena", "mari@gmail.es");
		maraton.inorden("Valentina Santacruz", "3055556545", "Laureles-Medellín", "valenSantacruz@yahoo.com");
		maraton.inorden("Natalia Velasquez", "3227555620", "La Asunción-Manizales", "nataVelasquez@gamil.com");
		maraton.inorden("Samuel de la Cruz", "3147532448", "El Bosque-Pasto", "samuCruz@outlook.com");
		
		System.out.println("                   PROGRAMADORES: ");
		printTreeInOrder();
		
		System.out.println("\nAltura del árbol binario: "+maraton.darAltura(maraton.getProgramadorRaiz()));
		System.out.println("\nTotal de programadores: "+maraton.getNumProgramadores());
	}

	public static void printTreeInOrder() {
		if(maraton.getProgramadorRaiz()==null) {
			System.out.println("El árbol está vacío");
		}else {
			printTreeInOrder(maraton.getProgramadorRaiz());
		}
	}

	private static void printTreeInOrder(Programador actual) {
		if (actual != null) {
			printTreeInOrder(actual.getIzquierda());
			System.out.println();
			System.out.println(actual.toString());
			printTreeInOrder(actual.getDerecha());
		}
	}
}
