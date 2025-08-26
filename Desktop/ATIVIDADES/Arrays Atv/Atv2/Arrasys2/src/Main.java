/*2.Criar um vetor com 4 notas e exibir em tela a média aritmética
das notas
*/

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;

        System.out.println("\nDigite 4 notas:");
        for(int i = 0; i < notas.length; i++){
            System.out.println("nota" + (i+1) + ":");
            notas[i] = ler.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("\nMedia das notas = " + media);

        ler.close();
    }
}