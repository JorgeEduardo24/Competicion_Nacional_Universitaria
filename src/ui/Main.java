package ui;

import model.Maraton;
import model.Programador;

public class Main {
	private static Maraton maraton;
	
	public static void main(String[] args) {
		maraton = new Maraton();
		maraton.inorden("Eduardo", "3116448900", "Tamasagra-Pasto", "eduardo2410@gmail.com");
		maraton.inorden("Jorge", "31154478970", "Jerusalem-Pasto", "jorgeeduardo2410@gmail.com");
		maraton.inorden("Camilo", "3113348830", "Caicedo-Pasto", "camilo@gmail.com");
		
		printTreeInOrder();
		
		System.out.println("Altura del árbol binario: "+maraton.darAltura(maraton.getProgramadorRaiz()));
	}
	
	public static void printTreeInOrder() {
		if(maraton.getProgramadorRaiz()==null) {
			System.out.println("The tree is empty");
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
