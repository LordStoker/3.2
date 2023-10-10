import java.util.Scanner;

public class divisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un número");
        int num = scanner.nextInt();
        
        System.out.println("Todos los números divisibles de " + num + " son:");

        for(int i = 1; i <= num ; i++){
                                  
                if(num % i == 0){
                    System.out.println(i);
                }
         }
        scanner.close();       
    }
}