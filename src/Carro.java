public class Carro {
    String modelo;
    int ano;
    String cor;
    int anoAtual = 2023;

    void exibeFichaTecnica(){
        System.out.println("Modelo do carro: "+modelo);
        System.out.println("Ano do carro: "+ ano);
        System.out.println("Cor do carro: "+ cor);
    }
    double idadeCarro(){
        return anoAtual - ano;

    }

}
