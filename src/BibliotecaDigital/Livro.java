package BibliotecaDigital;

public class Livro extends ItemAcervo{
    private Autor autor;

    public Livro(String titulo, int anoPublicacao, Autor autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    @Override
    public String gerarFicha() {
        return "Livro: " +super.getTitulo()+ "  Autor: "+ this.autor +"  Ano: " +super.getAnoPublicacao()+ "  Status: "+super.getStatus();
    }

    public Autor getAutor() {
        return autor;
    }
}
