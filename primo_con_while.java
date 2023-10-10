import java.util.Scanner;

public class primo_con_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número (mayor que 1):");
        int num = scanner.nextInt();
        int i = 2;
        boolean esPrimo;
        esPrimo = true;

        if (num < 2) {
            System.out.println("El número no es mayor que 1.");
        } 
        else {
            while (i < num) {
                if (num % i == 0) {
                    esPrimo = false;
                }
                i++;
            }
            if (esPrimo == true) {
                System.out.println("El número " + num + " es primo");
            } else {
                System.out.println("El número " + num + " no es primo");
            }
        }
        scanner.close();
    }
}
