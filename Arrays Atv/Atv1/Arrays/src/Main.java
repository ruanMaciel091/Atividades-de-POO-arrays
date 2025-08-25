/*1.Criar um vetor com 10 idades e exibir em tela as idades maiores
que 18 anos*/


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] idades = new int[10];
        System.out.println("Digite 10 idades: ");

        for(int i = 0; i< idades.length; i++){
            System.out.println("Idade " + (i+1) + ":");
            idades [i] = ler.nextInt();
        }

        System.out.println("\n Idades maiores que 18:");
        for (int idade : idades) {
            if (idade > 18){
                System.out.println(idade);
            }
        }
    }
}