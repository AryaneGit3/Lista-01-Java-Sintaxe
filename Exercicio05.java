import java.util.Scanner;

public class Exercicio05{
    
    public static void main(String[] args){
        Scanner scanner = new Sacanner(System.in);
        
        System.out.println("Digite seu peso em quilogramas:");
        double peso = scanner.nextDouble();
        
        System.out.println("Digite a sua altura em metros:");
        double altura = scanner.nextDouble();
        
        double imc = peso/(altura*altura);
        
        System.out.println(" Seu IMC é %.2f\n"+imc);
        
        
        
    }
    
}  
