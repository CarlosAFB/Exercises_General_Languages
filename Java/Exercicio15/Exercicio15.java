package Java.Exercicio15;
import java.util.Scanner;
public class Exercicio15 {
     public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        
        String name[] = new String[1000];
        double n1b1, n2b1, n1b2, n2b2, n1b3, n2b3, n1b4, n2b4;//Variáveis que armazenam cada nota dos bimestres inseridas pelo usuário.//
        double md1[] = new double[1000],//Média primeiro bimestre//
               md2[] = new double[1000],//Média segundo bimestre//
               md3[] = new double[1000],//Média terceiro bimestre//
               md4[] = new double[1000], //Média primeiro bimestre//
               mda[] = new double[1000];//Média total dos bimestres//
        int cont,
            i,
            p1=0,//Armazena a quantidade de aprovados//
            pf;//Porcentagem final//
        double aux1 = 0, aux2 = 0, aux3 = 0, aux4 = 0;//Variáveis utilizadas para somar a média de cada semestre e posteriormente determinar qual bimestre obteve a nota mais alta e nota mais baixa. //
        
        
        
        System.out.print("Quantos alunos você deseja cadastrar: ");
        cont = Ler.nextInt();
        
        for(i = 1; i <= cont; i++){
        System.out.printf("Nome do %sº aluno: ", i);
        name[i] = Ler.next();
                
        System.out.println("=PRIMEIRO BIMESTRE=");
        System.out.print("Digite a primeira nota: ");
        n1b1 = Ler.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2b1 = Ler.nextDouble();
        md1[i] = (n1b1+n2b1)/2; //Calculando a média das notas inseridas no primeiro bimestre.//
        aux1 = aux1 + md1[i]; //armazenamento da média do primeiro bimestre somada com suas antecedentes.//
        
        System.out.println("=SEGUNDO BIMESTRE=");
        System.out.print("Digite a primeira nota: ");
        n1b2 = Ler.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2b2 = Ler.nextDouble();
        md2[i] = (n1b2+n2b2)/2; //Calculando a média das notas inseridas no segundo bimestre.//
        aux2 = aux2 + md2[i]; //armazenamento da média do segundo bimestre somada com suas antecedentes.//
        
        System.out.println("=TERCEIRO BIMESTRE=");
        System.out.print("Digite a primeira nota: ");
        n1b3 = Ler.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2b3 = Ler.nextDouble();
        md3[i] = (n1b3+n2b3)/2; //Calculando a média das notas inseridas no terceiro bimestre.//
        aux3 = aux3 + md3[i]; //armazenamento da média do terceiro bimestre somada com suas antecedentes.//
        
        System.out.println("=QUARTO BIMESTRE=");
        System.out.print("Digite a primeira nota: ");
        n1b4 = Ler.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2b4 = Ler.nextDouble();
        md4[i] = (n1b4+n2b4)/2; //Calculando a média das notas inseridas no quarto bimestre.//
        aux4 = aux4 + md4[i]; //armazenamento da média do quarto bimestre somada com suas antecedentes.//
        
        mda[i] = ((md1[i]+md2[i]+md3[i]+md4[i])/4); //Calculando a média das medias de cada bimestre.(Média anual).//
        }
        
        
        //Imprimindo o nome do aluno a sua média final e seu status de aprovação.//
         for(i = 1; i <= cont; i++){
             System.out.print("O aluno "+name[i]+", possui a média final de "+ mda[i]+" e está ");
             if(mda[i] >= 60){
                 System.out.println("APROVADO.");
                 p1 = p1+1; //Armazenando a quantidade de alunos aprovados posteriomente séra utilizada para calcular a porcentagem Final.//
             }
             else{
                 System.out.println("REPROVADO.");
             }
         }
         
        //Imprimindo a porcentagem de alunos aprovados e reprovados.//
        pf = ((p1*100)/cont);//Porcentagem Final.//
        System.out.println("Porcentagem de alunos aprovados: " +pf+"%");
        System.out.println("Porcentagem de alunos reprovados: " + (100-pf)+"%");
        
        //Condicionais que indentificam qual bimestre obteve a maior nota//
        if(aux1 > aux2 && aux1 > aux3 && aux1 > aux4){
            System.out.println("O primeiro bimestre obteve a nota mais alta.");
        }
        else if(aux2 > aux1 && aux2 > aux3 && aux2 > aux4){
            System.out.println("O segundo bimestre obteve a nota mais alta.");
        }
        else if(aux3 > aux1 && aux3 > aux2 && aux3 > aux4){
            System.out.println("O terceiro bimestre obteve a nota mais alta.");
        }
        else if(aux4 > aux1 && aux4 > aux2 && aux4 > aux3){
            System.out.println("O quarto bimestre obteve a nota mais alta.");
        }
        else{
            System.out.println("Bimestres com notas iguais.");
        }
        
        
        //Condicionais que indentificam qual bimestre obteve a menor nota//
        if(aux1 < aux2 && aux1 < aux3 && aux1 < aux4){
            System.out.println("O primeiro bimestre obteve a nota mais baixa.");
        }
        else if(aux2 < aux1 && aux2 < aux3 && aux2 < aux4){
            System.out.println("O segundo bimestre obteve a nota mais baixa.");
        }
        else if(aux3 < aux1 && aux3 < aux2 && aux3 < aux4){
            System.out.println("O terceiro bimestre obteve a nota mais baixa.");
        }
        else if(aux4 < aux1 && aux4 < aux2 && aux4 < aux3){
            System.out.println("O quarto bimestre obteve a nota mais baixa.");
        }
        else{
            System.out.println("Bimestres com notas iguais.");
        }
             
    }
    
}
