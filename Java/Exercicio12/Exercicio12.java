package Java.Exercicio12;
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int num,
            n1,
            cont,
            t,
            arm[] = new int[1000];

        //Entrada de dados//
        System.out.print("Digite um número: ");
        num = Ler.nextInt();
        n1 = num;

        cont = 0;
        while (cont < n1) {
            if((num/16) > 0) {
                arm[cont]= num % 16;//Fragmentando número e o atribindo ao vetor//
                num = num / 16;
                cont++;
                }
            else {
                break;
                }
        }

        //Recebendo valor de cont para inverter//
        arm[cont]=num;
        t=cont;

        System.out.print("Convertido para hexadecimal: ");

        cont = t;
        //Saída de dados em ordem invertida//
        while (cont >= 0) {
                if(arm[cont] < 10) {
                        System.out.print(arm[cont]);
                }

                else if(arm[cont] == 10) {
                        System.out.print("A");
                }
                else if(arm[cont] == 11) {
                        System.out.print("B");
                }
                else if(arm[cont] == 12) {
                        System.out.print("C");
                }
                else if(arm[cont] == 13) {
                        System.out.print("D");
                }
                else if(arm[cont] == 14) {
                        System.out.print("E");
                }
                else if(arm[cont] == 15) {
                        System.out.print("F");
                }
                cont--;

        }
	}

}

