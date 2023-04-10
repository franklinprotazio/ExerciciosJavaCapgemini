package ExercicioQuinze;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Informe um numero: ");
        numero = leitor.nextInt();
        
        if(numero <= 200 && numero >= 100){
            System.out.println("Numero dentro do intervalor");
        } else {
            System.out.println("Numero fora do intervalo");
        }
    }
   
}
