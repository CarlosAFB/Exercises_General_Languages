package Java.Exercicio19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Exercicio19 {
    public static void main(String[] args) {
        Integer k = 5;
        List<Integer> listaNumeros = Arrays.asList(10,15,3,7);
        System.out.println(somaNumero(listaNumeros, k));
    }

    private static boolean somaNumero(List<Integer> numeros, Integer k) {
        HashSet<Integer> map = new HashSet<>();
        for (Integer numero : numeros) {
            System.out.println(numero);
            if(map.contains(k - numero)){
                System.out.println("Encontrado");
                return true;
            }
            map.add(numero);
        }
        return false;
    }
}