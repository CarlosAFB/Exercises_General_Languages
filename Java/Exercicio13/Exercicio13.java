package Java.Exercicio13;
import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args){
    Scanner Ler = new Scanner(System.in);
    
    int octal,
        n1 = 0,
        i,
        arm[] = new int [100],
        pt[] = new int [100],
        result = 0;
    
    System.out.println("Digite o número inteiro em base octal: ");
    octal = Ler.nextInt();
    
    for(i=0; octal != 0; i++){
        arm[i] = octal%10; //Fragmentando o número digitado pelo usuário//
        octal = octal/10;
        pt[i] =  arm[i]*(int)Math.pow(8,n1);//Armazenando o número fragmentado multiplicado por 8 elevado a n1//
        n1 = n1 + 1;//Acrescentando mais 1 unidade na exponenciação da próxima repetição//
        result = result + pt[i];//Armazenando o resultado das multiplicações somada com seus antecedentes//

    }
        System.out.println("O número convertido para deciaml é: " + result);
    
    }
}
