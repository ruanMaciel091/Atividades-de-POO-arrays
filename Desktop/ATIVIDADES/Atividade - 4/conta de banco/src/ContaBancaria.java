public class ContaBancaria {
    String numeroConta;
    String Titular;
    double saldo;


    void depositar(double valor){
        saldo = saldo + valor;
        System.out.println(valor + " Depositado com sucesso! ");
    }
    void sacar(double valor){
        saldo = saldo - valor;
        System.out.println(valor + " Sacado com sucesso! ");
    }
    void consultarSaldo(){
        saldo = saldo;
        System.out.println(Titular + " Saldo atual: " + saldo);
    }
}
