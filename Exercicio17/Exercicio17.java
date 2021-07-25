
package Exercicio17;

import java.util.Scanner;

public class Exercicio17 {
     static int contMDC(int v1, int v2){
       if(v1%v2==0){
           return v2;
       }else{
           return contMDC(v2,(v1%v2));
       } 
    }
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int x = Ler.nextInt();
        System.out.print("Digite o segundo número: ");
        int y = Ler.nextInt();
        System.out.println("O MDC é: "+contMDC(x,y));
    }  
}
