package Codigo;

public abstract class RedeSocial {

    //Atributos da rede
    protected String senha;
    protected int numAmigos;

    //Constructor da rede
    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    //Métodos da rede
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();

    public void curtirPublicacao(){
        System.out.println("Publicação curtida");
    }
}
