package gvaCEED;
public class CollatzLogic {

    // Genera un pas de la seqüència de Collatz
    public static int next(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("El número ha de ser positiu");
        }
        return (n % 2 == 0) ? n / 2 : n * 3 + 1;
    }

    // Retorna el total de passos fins arribar a 1
    public static int stepsToReachOne(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("El número ha de ser positiu");
        }

        int passos = 0;
        while (n != 1) {
            n = next(n);
            passos++;
        }
        return passos;
    }
}
