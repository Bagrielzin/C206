public class Cantina {

    String nome = "Cantina do Inatel";
    Salgado[] salgados = new Salgado[3];

    void addSalgado(Salgado novoSalgado){
        for(int i=0; i< salgados.length; i++){
            if(salgados[i] == null) {
                salgados[i] = new Salgado();
                salgados[i].nome = novoSalgado.nome;
                break;
            }
        }
    }

    void mostraInfo(){
        for(int i=0; i<salgados.length; i++){
            System.out.println(salgados[i].nome);
        }
    }
}
