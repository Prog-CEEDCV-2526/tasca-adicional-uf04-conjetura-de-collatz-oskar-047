import java.util.Scanner;

public class app{
	public static void main(String args[]){

		// Definir variables
		Scanner sc = new Scanner(System.in);
		int initial_number;

		System.out.println("Escribe un numero para empezar la conjetura de collatz: ");

		while(true){
			if(sc.hasNextInt()){
				initial_number = sc.nextInt();
				System.out.println("Seqüencia de Collatz para el número " + initial_number + ": ");
				calculate(initial_number);
				break;
			} else{
				System.out.println("Escribe un número valido: ");
				// Consumir la entrada invalida
				sc.nextLine();
			}
		}

		sc.close();
	}

	public static void calculate(int number){
		while(number!=1){
			if(number%2!=0){
				// Si es impar
				number = number*3+1;
			} else{
				// si no lo es
				number/=2;
			}
			System.out.println(number);
		}
	}
}