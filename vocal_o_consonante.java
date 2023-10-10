import java.util.Scanner;

public class vocal_o_consonante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una letra");
        char letra = scanner.next().charAt(0);
        letra = Character.toLowerCase(letra);

        if (letra == 'a') {
            System.out.println("La letra " + letra + " es una vocal.");
        }
        else if (letra == 'e') {
            System.out.println("La letra " + letra + " es una vocal.");
        } 
        else if (letra == 'i') {
            System.out.println("La letra " + letra + " es una vocal.");
        } 
        else if (letra == 'o') {
            System.out.println("La letra " + letra + " es una vocal.");
        } 
        else if (letra == 'u') {
            System.out.println("La letra " + letra + " es una vocal.");
        } 
        else {
            System.out.println("La letra " + letra + " es consonante.");
        }

        scanner.close();
    }

}
