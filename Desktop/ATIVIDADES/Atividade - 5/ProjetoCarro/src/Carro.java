public class Carro {
    String modelo;
    String marca;
    int ano;

    void info(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
    void ligar(){
        System.out.println(modelo + " Lidado");
        System.out.println("Asas batendo, marcha de decolagem, turbinas e já!");

    }
}
