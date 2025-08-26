/*4) Criar uma classe ContaBancaria que represente uma conta de banco simples, com métodos para depósito,
saque e consulta de saldo.
Parte 1: Criar a Classe ContaBancaria
 A classe deve ter:
 1. Atributos:
 • numeroConta (String)
 • titular (String)
 • saldo (double)
 2. Métodos:
 • depositar(double valor): aumenta o saldo.
 • sacar(double valor): diminui o saldo (se houver saldo suficiente).
 • consultarSaldo(): exibe o saldo atual.
 Parte 2: Classe Principal para Testar
 Crie uma classe Main com um método main para:
 1. Instanciar dois objetos da classe ContaBancaria (ex: conta1 e conta2).
 2	Realizar operações de depósito, saque e consulta em cada conta.
* */
public class contadebanco {
    public static void main(String[] args) {
    ContaBancaria conta1 = new ContaBancaria();
    ContaBancaria conta2 = new ContaBancaria();

    conta1.numeroConta = "12345";
    conta1.Titular = "Samara";
    conta1.saldo = 100;

    conta2.numeroConta = "54321";
    conta2.Titular = "Ruan";
    conta2.saldo = 100;

    conta1.depositar(500);
    conta2.depositar(300);

    conta1.sacar(100);
    conta2.sacar(200);

    conta1.consultarSaldo();
    conta2.consultarSaldo();
    }

}