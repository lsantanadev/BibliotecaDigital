package BibliotecaDigital;

public abstract class ItemAcervo implements Imprimivel{
    private String titulo;
    private int anoPublicacao;
    private StatusItem status;

    public ItemAcervo(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.status = StatusItem.DISPONIVEL;
    }

    @Override
    public String toString() {
        return "Titulo: "+this.titulo+ "Ano: "+this.anoPublicacao+"   ("+this.status+")";
    }

    public void setStatus(StatusItem status) {
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public StatusItem getStatus() {
        return status;
    }
}
