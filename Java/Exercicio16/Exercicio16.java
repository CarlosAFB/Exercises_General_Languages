package Java.Exercicio16;

import java.util.Scanner;

public class Exercicio16 {
  
    static int contquant(int v1){
        if(v1<10){
            return 1;
        }else{
            return contquant(v1%10)+contquant(v1/10);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número : ");
        int a = scanner.nextInt();
        
        System.out.println("Possui "+contquant(a)+" digitos.");
           
    }
    
}
