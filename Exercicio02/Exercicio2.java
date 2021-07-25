package Exercicio02;
import java.util.Scanner;
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        
        //Declaração de variáveis//
        double  seg1,
                seg2,
                seg3,
                aux;

        //Entrada de dados//
        System.out.print("Digite o primeiro segmento: ");
        seg1 = Ler.nextDouble();
        System.out.print("Digite o segundo segmento: ");
        seg2 = Ler.nextDouble();
        System.out.print("Digite o terceiro segmento: ");
        seg3 = Ler.nextDouble();
        
        //Obtendo a valor da subtração de dois seguimentos//
        aux = seg1 - seg2;

        //Condicionais imprimindo o tipo de triângulo//
        if (aux <= seg3) {
            if (seg1 == seg2 && seg2 == seg3) {
                System.out.println("Triangulo Equilátero");
            } 
            else if (seg1 != seg2 && seg2 != seg3) {
                System.out.println("Triângulo Escaleno");
            } 
            else {
                if (seg1 == seg2 && seg2 != seg3){
                System.out.println("Triangulo Isóceles");
                }
                if (seg1 == seg3 && seg3 != seg2){
                System.out.println("Triangulo Isóceles");
                }
                if (seg2 == seg3 && seg3 != seg1){
                System.out.println("Triangulo Isóceles");
                }
            } 
       } 
        else if (aux > seg3) {
            System.out.print("Não é Triângulo");
        }
    }
}