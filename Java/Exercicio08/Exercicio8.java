package Java.Exercicio08;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args){ 
    Scanner Ler = new Scanner(System.in);
    
    int num1,
        num2,
        aux,
        cont = 0;
    
    //Entrada de dados//
    System.out.print("Digite o multiplicando: ");
    num1 = Ler.nextInt();
    System.out.print("Digite o multiplicador: ");
    num2 = Ler.nextInt();
    aux = 0;
    
    //Multiplicando com estrutura de repetição//
    while(num1 > cont){
        cont++;
        aux = aux+ num2;
    }
    //Saída//
    System.out.println("Resultado: " + aux);
    }
}
