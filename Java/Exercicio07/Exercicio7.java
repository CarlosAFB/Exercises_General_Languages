package Java.Exercicio07;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args){
    Scanner Ler = new Scanner(System.in);
    
    int soy,
        cane,
        coffee,
        cotton;
    
    double tol,
           tol2,
           desc = 0;
    
    //Entrada de dados//
    System.out.println("Aluguel de colheitadeiras:"+
    "\n Soja: R$ 200,00 por hectare;" +
    "\n Cana: R$ 450,00 por hectare;" +
    "\n Café: R$ 330,00 por hectare;" +
    "\n Algodão: R$ 270,00 por hectare.");
     
    System.out.print("Digite a quantidade de hectares de Soja: ");
    soy = Ler.nextInt();
    
    System.out.print("Digite a quantidade de hectares de Cana: ");
    cane = Ler.nextInt();
    
    System.out.print("Digite a quantidade de hectares de Café: ");
    coffee = Ler.nextInt();
    
    System.out.print("Digite a quantidade de hectares de Algodão: ");
    cotton = Ler.nextInt();
    
    tol2 = (soy+cane+coffee+cotton);//Somando o total de hectares inseridos pelo usuário// 
    tol = (soy * 200)+(cane * 450)+(coffee * 330)+(cotton * 270);//Calculando os hectares inseridos de acordo com seu respectivos valores//
    
    //Atribuindo os descontos da copra do usuário//
    if(tol > 5000 && tol2 > 30){
        desc = ((soy * 200)-((soy * 200)*0.03))+
               ((cane * 450)-((cane * 450)*0.02))+
               ((coffee * 330)-((coffee * 330)*0.025))+
               ((cotton * 270)-((cotton * 270)*0.04));
        desc = (desc-(desc*0.05));
    }
    else if(tol > 5000){
        desc = (tol-(tol*0.05));
         System.out.println("Teste desconto 2");
    }
    else if(tol2 > 30){
        desc = ((soy * 200)-((soy * 200)*0.03))+
               ((cane * 450)-((cane * 450)*0.02))+
               ((coffee * 330)-((coffee * 330)*0.025))+
               ((cotton * 270)-((cotton * 270)*0.04));
    }
    else{
        desc = tol;
    }
    //Imprimindo o valor total e o valor com descondo//
    System.out.println("Valor total R$" + tol);
    System.out.println("Valor com desconto R$" + desc);
    
}
}