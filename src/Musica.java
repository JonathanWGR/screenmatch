public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double nota;
    int numAvaliacoes;
    double somaDasAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Titulo: "+ titulo);
        System.out.println("Artista: "+ artista);
        System.out.println("Ano de Lançamento: "+ anoLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }
    double pegaMedia(){
        return somaDasAvaliacoes / numAvaliacoes;
    }


}
