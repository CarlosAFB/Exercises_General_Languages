package Java.Exercicio10;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        
        int cont,
            ser,
            d1,
            d2 = 2;
        
        double calc,
              total = 0;
        
        //Entrada de dados com restrinção//
        do{
        System.out.print("Digite a quantidade de números na série: ");
        ser = Ler.nextInt();
        }while(ser < 5 && ser > 30);
        
        //Calculando a fórmula//
        for(cont = 0; cont < ser; cont++){
            d1 = 100;
            d1 = d1 - d2;      
            calc = d1 / d2;
            total = total + calc;

            d2 = d2 + 2; 
    }
        //Saída//
        System.out.println("Resultado: " + total);
    }
}
