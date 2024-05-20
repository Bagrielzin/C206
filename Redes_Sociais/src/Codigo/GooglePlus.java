package Codigo;

public class GooglePlus extends RedeSocial implements Compartilhamento,VideoConferencia{

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Google plus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Google plus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Google plus");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Google plus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou algo no Google plus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma vídeo conferência no Google plus");
    }

}
