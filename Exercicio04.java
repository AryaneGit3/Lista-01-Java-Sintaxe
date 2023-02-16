import java.util.Scanner;
public class Exercicio04 {
    
    public static void main(String[] args) {
        double valorDolar;
        double valorReal;
        
        System.out.println("Insira um valor em dólar para ser convertido em real:");
        Scanner sc1 = new Scanner(System.in);
        valorDolar = sc1.nextDouble();
        
        System.out.println(valorDolar);
        
        valorReal = valorDolar * 5.10;
        
        System.out.println(valorReal);
       
        
        
    }// fim main
    
} // fim class
