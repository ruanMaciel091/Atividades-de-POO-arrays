/*1) Utilizando o ProjetoLivraria. Faça:
• Instanciação de dois objetos da classe;
• Alteração dos atributos através do objeto da classe;
• Impressão dos atributos na tela;
• Invocação dos métodos da classe.

2) Analise novamente a imagem da
livraria e extraia deste contexto mais uma
classe. Além disso, defina para ela:
• três atributos,
• dois métodos.
Depois crie a classe definida no projeto
Java.
(Não peguei nada do ChatGepeto , coloquei a idade como 20 pq parace)
*/
import java.util.Scanner;
public class Livraria {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);

        Livro lv1 = new Livro();
        lv1.titulo = "Harry poter";
        lv1.numeroPaginas = 304;
        lv1.anoPublicacao = 1997;

        Fucionario fucionario1 = new Fucionario();
        fucionario1.nomef = "Samara";
        fucionario1.idade = 20;
        fucionario1.cargo = "Gerente";

        Emprestimo emprestimo1 = new Emprestimo();
        emprestimo1.DataDeEmprestimo ="09/08/2025";
        emprestimo1.DataDeDevoluacao = "09/09/2025";

        System.out.println(lv1.titulo + " " + lv1.numeroPaginas + " " + lv1.anoPublicacao);
        System.out.println(fucionario1.nomef + " " + fucionario1.idade  + " " + fucionario1.cargo);
        System.out.println(emprestimo1.DataDeEmprestimo + " " + emprestimo1.DataDeDevoluacao);
    }
}