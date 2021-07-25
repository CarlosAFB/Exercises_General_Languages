package Exercicio11;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args){
    Scanner Ler = new Scanner(System.in);
    
    int num,
        var;
    //Entrada de dados// 
    System.out.print("Digite o número a ser verificado: ");
    num = Ler.nextInt();
    
    var = num % 3;//Calculando resto para verificar se o número  é triangular//
    
    //Verificação e saída de dados//
    if (var == 0){
        System.out.println("O Número é triangular.");
    }
    else{
        System.out.println("O Número não é triangular. ");
    }
    }
}
