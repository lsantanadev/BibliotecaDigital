package BibliotecaDigital;

public class MidiaDigital extends ItemAcervo{
    private String tipo;

    public MidiaDigital(String titulo, int anoPublicacao, String tipo) {
        super(titulo, anoPublicacao);
        this.tipo = tipo;
    }

    @Override
    public String gerarFicha() {
        return "Midia Digital: " +super.getTitulo()+ "  Tipo: "+ this.tipo +"  Ano: " +super.getAnoPublicacao()+ "  Status: "+super.getStatus();
    }

    public String getTipo() {
        return tipo;
    }
}
