package Java.Exercicio04;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] Args){
    Scanner Ler = new Scanner(System.in);
    
    
    char comb;
    double li;
    
    //Entrada de dados//
    System.out.println("Escolha o combústivel digitando seu caracter correspondente: "
    + "\n e) etanol,"
    + "\n g) gasolina,"
    + "\n d) diesel;");
    comb =  Ler.next().charAt(0);
   
    System.out.print("Digite a quantidade de litros: ");
    li = Ler.nextDouble();
    
    //Calculando e imprimindo o valor dos litros de acordo com a opção escolhida pelo usuário//
    switch(comb){
        case 'e':
            System.out.println("Valor a pagar R$" + li * 2.90);
            break;
        case 'g':
            System.out.println("Valor a pagar R$" + li * 4.30);
            break;
        case 'd':
            System.out.println("Valor a pagar R$" + li * 3.60);
            break;
        default:
            System.out.println("Você digitou um caracter inválido.");
    }
    }
}