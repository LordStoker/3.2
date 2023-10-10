import java.util.Scanner;

public class bucle_media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        int num;
        int suma = 0;
        int contador = 0;
        float media;
        do {    
            System.out.println("Introduce un número o pulsa 0 para salir:");
            num = scanner.nextInt();
            if (num > 0){
                suma = suma + num;
                contador++;
            }           
        }
        while (num != 0);
        media = (float)suma / contador;
        System.out.println("La media de los números introducidos es igual a " + media);
     
        scanner.close();        
    }

}
