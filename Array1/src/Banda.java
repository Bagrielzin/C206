public class Banda {

    String nome;
    String genero;
    Empresario empresario = new Empresario();
    Membro[] membros = new Membro[3];
    Musica[] musicas = new Musica[3];
    int i;

    void mostraInfo(){
        System.out.println("Nome da banda: " + this.nome);
        System.out.println("Genero da banda: " + this.genero);
        for(i=0; i< membros.length; i++){
            System.out.println("Membro da banda: " + membros[i].nome);
            System.out.println("Funcao: " + membros[i].funcao);
        }
        for(i=0; i< musicas.length; i++){
            System.out.println("Musica da banda: " + musicas[i].nome);
            System.out.println("Duracao da musica: " + musicas[i].duracao);
        }
    }

    void addMusicaNova(Musica musica){
        for(i=0; i< musicas.length; i++){
            if(musicas[i] == null) {
                musicas[i] = new Musica();
                musicas[i].nome = musica.nome;
                musicas[i].duracao = musica.duracao;
                break;
            }
        }
    }

    void addMembroNovo(Membro membro){
        for(i=0; i< membros.length; i++){
            if(membros[i] == null) {
                membros[i] = new Membro();
                membros[i].nome = membro.nome;
                membros[i].funcao = membro.funcao;
                break;
            }
        }
    }

    void mostraBanda(){
        System.out.println("Nome da banda: " + this.nome);
        System.out.println("Genero da banda: " + this.genero);
    }


}
