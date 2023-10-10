import java.util.Scanner;

public class no_primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un número");
        int num = scanner.nextInt();
        boolean noEsPrimo;
        System.out.println("Todos los números divisibles de " + num + " son:");

        for(int i = num; i >= 1; i--){
            noEsPrimo = false;
            for(int j = 2; j <= i -1; j++){
                if(i % j == 0){
                    noEsPrimo = true;
                }
            }
            if(noEsPrimo == true){
                System.out.println(i);
            }

        }
        scanner.close();


        
    }
}