package Exercicio14;
import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        
        int n = 0 ,
            cont = 0,
            cont2 = 0,
            cont3 = 0;
        String[] name = new String[1000];
        int[] age = new int[1000];
        double[] height = new double[1000];
        double[] weight = new double[1000];
        double[] imc = new double[1000];
        String[] sex = new String[1000];
        
        String pv = "não definido pelo usuário.",//Atribuição inicial para caso o usuário decida não continuar a responder as perguntas//
               pv2 = "não definido pelo usuário.";//Atribuição inicial para caso o usuário decida não continuar a responder as perguntas//
        double pf = 0,
               pf1 = 0,
               pf2 = 0,          
               id = 0,
               c2 = 0,
               x = 0;
        String sex1 = "x",
               sex2 = "x" ;
        int opcP = 1,
            opcF,     
            c1 = 0;
        
        //Entrada de dados em um loop indefinido//
        while(opcP == 1){
            n = n + 1;//Número do vetor a cada loop//
            System.out.print("Digite o nome: ");
            name[n] = Ler.next();
            System.out.print("Se você deseja continuar inserindo os dados digite '1', coso contrário digite '0': ");//#01 - Perguntando ao usúario se ele deseja continuar respondendo perguntas//
            opcF = Ler.nextInt();//#02 - Recebendo dado da pergunta caso ele digite 1 irá para a próxima condicional//
            if(opcF == 1){
                System.out.print("Digite a idade: ");
                age[n] = Ler.nextInt();
   
                System.out.print("Se você deseja continuar inserindo os dados digite '1', caso contrário digite '0': ");//#01
                opcF = Ler.nextInt();//#02
                if(opcF == 1){
                    System.out.print("Digite seu peso: ");
                    weight[n] = Ler.nextDouble();

                    System.out.print("Se você deseja continuar inserindo os dados digite '1', caso contrário digite '0': ");//#01
                    opcF = Ler.nextInt();//#02
                    if(opcF == 1){
                        System.out.print("Digite o altura: ");
                        height[n] = Ler.nextDouble();//#02

                        System.out.print("Se você deseja continuar inserindo os dados digite '1', caso contrário digite '0': ");//#01
                        opcF = Ler.nextInt();//#02
                            if(opcF == 1){
                                System.out.print("Digite o sexo: (M/F): ");
                                sex[n] = Ler.next();                       

            }

            }

            }

            }
            
            imc[n] = weight[n]/(height[n]*height[n]);//Calculando o IMC//
            
            if(age[n] > c1){//Encontrando o nome a idade e o sexo da pessoa mais velha//
                    pv = name[n];
                    c1 = age[n];
                    sex1 = sex[n];
                }
                if(age[n] >= 18){//Encontrado o número de pessoas maiores de 18 anos obesas//
                   
                    if(imc[n] >= 30){
                        cont = cont + 1;    
                    }
                }
                pf =((cont*100)/ n);//Calculando a porcentagem de pessoas maiores de 18 anos obesas//
                
                //---------------------------------------------------------//
                
                if("F".equals(sex[n]) || "f".equals(sex[n])){ //Encontrado o número de Mulheres maiores de 18 anos obesas entre 25 e 59 anos//
                    if(imc[n] >= 30){
                    if(age[n] > 25 && age[n]< 59){
                        cont2 = cont2 + 1;
                   }
                   }
                }
                pf1 =((cont2*100)/ n); //Calculando a porcentagem de Mulheres maiores de 18 anos obesas entre 25 e 59 anos//
                
                //---------------------------------------------------------//
                
                if("M".equals(sex[n]) || "m".equals(sex[n])){ //Encontrado o número de homens maiores de 18 anos obesos entre 25 e 59 anos//
                    if(imc[n] >= 30){
                    if(age[n] > 25 && age[n]< 59){
                        cont3 = cont3 + 1;
                    }
                    }
                }
                pf2 =((cont3*100)/ n); //Calculando a porcentagem de homens maiores de 18 anos obesos entre 25 e 59 anos//
                
                //---------------------------------------------------------//
                
                if(weight[n] > c2){//Encontrando os dados da pessoa mais pesado cadastrada e os atribuindo em novas variáveis// 
                    c2 = weight[n];
                    pv2 = name[n];
                    id = age[n];
                    x = imc[n];
                    sex2 = sex[n];
                }
                
            System.out.print("Dados preenchidos com sucesso deseja fazer outro cadastro? (1/0): ");//Perguntando ao usuário se ele deseja fazer mais cadastros//
            opcP = Ler.nextInt();
        }
        //Saída de dados//
        System.out.println("A pessoa mais velha se chama: "+pv+" e possui "+c1+" anos e seu sexo é "+sex1+".");
        System.out.println("A porcentagem de pessoas adultas e obesas: "+pf+"%");
        System.out.println("A porcentagem de mulheres obesas entre 29 e 59 anos é de: "+pf1+"%");
        System.out.println("A porcentagem de homens obesos entre 29 e 59 anos é de: "+pf2+"%");
        System.out.println("A pessoa mais pesada se chama "+pv2+" com idade de "+id+" IMC de "+x+" e de sexo "+sex2+".");
    }
}
