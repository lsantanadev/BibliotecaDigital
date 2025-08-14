package BibliotecaDigital;

public class Autor {
    private String nome;
    private String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Nome: "+this.nome+ "  " +"Nacionalidade: "+this.nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
}
