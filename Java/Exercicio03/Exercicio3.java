package Java.Exercicio03;
import java.util.Scanner;
public class Exercicio3 {
   public static void main(String[] args){
       Scanner Ler = new Scanner(System.in);
       int num,
           inverso = 0,
           aux,
           digitado;
       
       System.out.print("Digite um número: ");//Recebendo número//
       digitado = Ler.nextInt();
       num = digitado;
       
       while(num != 0){
           aux = num % 10;//Fragmentando o número digitado pelo usuário//
           num = num /10;
           inverso = (inverso * 10) + aux;//Invertendo o Número//
       }
       if (digitado == inverso){
           System.out.println("O número digitado é palindromo!");
       }
       else{
           System.out.println("O número digitado não é palindromo!");
       }
   } 
}
