package Java.Exercicio05;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args){
    Scanner Ler = new Scanner(System.in);
    
    String name;
    Double salary;
    
    //Entrada de dados//
    System.out.print("Digite seu nome: ");
    name = Ler.nextLine();
    
    System.out.print("Digite seu salário: ");
    salary = Ler.nextDouble();
    
    //Calculando e imprimindo o novo salário do funcionario//
    if( salary <= 1000 ){
        System.out.println("O novo salário do(a) " + name + " é de R$" + (salary + (salary * 0.3)));
    }
    else if( salary > 1000 && salary <= 2000 ){
        System.out.println("O novo salário do(a) " + name + " é de R$" + (salary + (salary * 0.2)));
    }
    else if( salary < 2000 ){
        System.out.println("O novo salário do(a) " + name + " é de R$" + (salary + (salary * 0.1)));
    }
    }    
}
