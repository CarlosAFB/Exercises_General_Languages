package Java.Exercicio01;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //Declaração de variáveis//
        double n1,
                n2,
                n3,
                p1,
                p2,
                p3,
                med, 
                medFinal;

        //Entrada de notas e pesos//
        System.out.print("Digite a primeira nota: ");
        n1 = ler.nextDouble();
        System.out.print("Digite o primeir peso: ");
        p1 = ler.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = ler.nextDouble();
        System.out.print("Digite o segundo peso: ");
        p2 = ler.nextDouble();
        System.out.print("Digite a terceira nota: ");
        n3 = ler.nextDouble();
        System.out.print("Digite o terceiro peso: ");
        p3 = ler.nextDouble();

        //Calculo dos pesos e declaração de novas variáveis//
        double pn1 = p1 * 0.1;
        double pn2 = p2 * 0.1;
        double pn3 = p3 * 0.1;

        //Calculo da Média Ponderada//
        med = (n1 * pn1 + n2 * pn2 + n3 * pn3);
        medFinal = med / 10;

        //Saída de dados//
        System.out.println("Aluno com Média Ponderado de: " + medFinal);

        if (medFinal >= 60) {
            System.out.println("Aprovado");
        }
        else if(medFinal < 60){
            System.out.println("Reprovado");
        }
    }
}
