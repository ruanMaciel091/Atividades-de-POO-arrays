public class Aluno {
    String nome;
    int matricula;
    double notaAv1;
    double notaAv2;

    void DadosAluno(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Matricula do aluno: " + matricula);
        System.out.println("Nota do aluno: " + notaAv1);
        System.out.println("Nota do aluno: " + notaAv2);
    }
    void calcularMedia() {
        double media = notaAv1 + notaAv2 /2;
        if (media >= 7){
            System.out.println("Aprovado");
        }
        else if (media >= 4){
            System.out.println("Prova Final");
        }
        else{
            System.out.println("Reprovado");
        }
    }


}
