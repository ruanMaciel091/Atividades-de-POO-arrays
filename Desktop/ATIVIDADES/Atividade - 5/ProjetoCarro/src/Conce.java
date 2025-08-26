/*5) Crie um projeto chamado ProjetoCarro e construa nele a classe Carro, contendo os atributos:
• marca (String)
 • modelo (String)
 • ano (int)
 A classe deve ter métodos para:
 • Mostrar as informações do carro.
 • Ligar o carro (exibir uma mensagem na tela).
 Em seguida :
 1. Crie dois objetos da classe Carro.
 2. Altere os atributos de um dos objetos.
 3. Mostre os valores modificados na tela.
 4. Chame os métodos da classe usando o objeto.*/
public class Conce {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Ferrari";
        carro1.ano = 2026;
        carro1.modelo = "P1";

        carro2.marca = "Ford";
        carro2.ano = 2007;
        carro2.modelo = "Mustang";

        carro1.info();
        carro2.info();

        carro1.ligar();
        carro2.ligar();
    }
}