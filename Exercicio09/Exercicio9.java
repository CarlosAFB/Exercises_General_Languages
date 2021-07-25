package Exercicio09;
import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args){
    Scanner Ler = new Scanner(System.in);
    
    int n1,
        n2,
        cont,
        quo=1,
        rest=0;
            
    //Entrada de dados//
    System.out.print("Digite o divisor: ");
    n1 = Ler.nextInt();
    
    System.out.print("Digite o dividendo: ");
    n2 = Ler.nextInt();
    
    //Calculando a divisão com estrutura de repetição//
    cont = n2;
    while( n1 > cont ){
        cont = cont + n2;
        quo++;
        rest = (n1 - cont);
        
        
    }
    if (rest != 0){
            rest= n1 - cont + n2;
            quo= quo-1;
        }
    //Saída//
    System.out.println("Resultado quociente: " + quo);
    System.out.println("Resultado resto: " + rest);
    }
}
