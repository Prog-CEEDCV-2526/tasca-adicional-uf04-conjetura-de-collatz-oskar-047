package gvaCEED;
import java.util.Scanner;

public class Collatz{
	public static void main(String args[]){

		// Definir variables
		Scanner sc = new Scanner(System.in);

		System.out.println("Elige una opción: ");
		System.out.println("1. Calcular conjetura de collatz de un número: ");
		System.out.println("2. Calcular conjetura de collatz desde el número 2 hasta el número... : ");

		while(true){
			if(!sc.hasNextInt()){
				System.out.println("Escribe un número correcto: ");
				sc.nextLine();
				continue;
			}

			int sel = sc.nextInt();
			if(sel==1){
				calculate_collatz(sc);
				break;
			} else if(sel==2){
				calculate_several_collatz(sc);
				break;
			}
		}

		sc.close();
	}

	// Función que calcula la seqüencia de Collatz con 1 número
	public static void calculate_collatz(Scanner sc){
		while(true){
			System.out.println("Escribe un número para calcular la conjetura de Collatz: ");
			if(!sc.hasNextInt()){
				sc.nextLine();
				continue;
			}

			int number = sc.nextInt();
			calculate(number);
			break;
		}
	}

	// Función que calcula toda la seqüencia de Collatz desde el número 2 hasta el que el usuario elija
	public static void calculate_several_collatz(Scanner sc){
		System.out.println(); // Linea vacia para legibilidad
		System.out.println("Se va a calcular la conjetura de Collatz con los numeros entre 2 y ...: ");

		while(true){
			System.out.println("Escribe un numero valido (mayor que 2): ");
			if(!sc.hasNextInt()){
				sc.nextLine();
				continue;
			}

			int number = sc.nextInt();
			for(int i=2; i<number; i++){
				System.out.println();
				calculate(i);
			}
			break;
		}
	}

	// Función que recibe 1 número como parametro y calcula su seqüencia de Collatz
	public static void calculate(int number){
		System.out.println("Seqüencia de collatz para el número: " + number);
		String text = "";
		int pasos = 0;
		while(number!=1){
			if(number%2!=0){
				// Si es impar
				number = number*3+1;
			} else{
				// si no lo es
				number/=2;
			}
			text += " " + number;
			pasos++;
		}
		System.out.println("Seqüencia: " + text);
		System.out.println("Pasos totales: " + pasos);
	}
}
