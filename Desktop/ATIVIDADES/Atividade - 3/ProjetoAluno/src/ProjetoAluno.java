//3) Crie um projeto chamado ProjetoAluno e construa nele a classe Aluno,
//contendo os atributos:
//• nome (String)
//• matricula (int)
//• notaAv1 (double)
//• notaAv2 (double)
//A classe deve ter métodos para:
//• Mostrar os dados do aluno.
//• Calcular a média
//• Verificar aprovação, de acordo com as regras da UNAMA.
//Em seguida:
//1. Crie dois objetos da classe Aluno.
//2. Atualize a nota de um aluno.
//3. Mostre os dados atualizados.
//4. Chame o método para verificar se está aprovado.
//5. Utilize a função calcular média dentro de verificar aprovação para saber se o aluno passou.
public class ProjetoAluno {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "samara";
        aluno1.matricula = 99999;
        aluno1.notaAv1 = 10;
        aluno1.notaAv2 = 10;

        aluno1.DadosAluno();
        aluno1.calcularMedia();

    }
}