package Java.Exercicio06;
import java.util.Scanner;
public class Exercicio6 {
    public static void main (String[] args){
    Scanner Ler = new Scanner(System.in);
    
    String name;
    Double hour,
           extra,
           sm = 998.0,
           sb,
           sl,
           inss,
           ir;
    //Recebendo dados do usuário//
    System.out.print("Digite o nomedo funcionário: ");
    name = Ler.nextLine();
    
    System.out.print("Digite as horas extras trabalhadas: ");
    hour = Ler.nextDouble();
    
    extra = 15.73 * hour;// Calculando Horas Extras.//
    sb = (sm + sm)+extra;// Calculando salário bruto.//
    
    //Calculando imposto de renda de acordo com o salário bruto.//
    if(sb <= 2826.65){
        ir = 0.075;
    }
    else if(sb > 2826.66 && sb < 3751.05){
        ir = 0.15;
    }
    else if(sb > 3751.06 && sb < 4664.68){
        ir = 0.225;
    }
    else{
        ir = 0.275;
    }
    
    
    //Calculando INSS de acordo com o salário bruto.//
    if(sb <= 2919.72){
        inss = 0.09;
    }
    else{
        inss = 0.11;
    }
    
    sl = sb-((sb*inss)+(sb*ir));//Calculando salário liquido.//
    
    //Imprimindo o resultado para o usuário.//    
    System.out.println(name+", seu salário bruto e de R$"+sb);    
    System.out.println(name+", seu salário liquido e de R$"+sl);    
    }
}
