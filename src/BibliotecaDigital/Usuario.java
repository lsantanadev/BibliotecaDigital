package BibliotecaDigital;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int idUsuario;
    private ArrayList<ItemAcervo> itensEmprestados;

    public Usuario(String nome, int idUsuario) {
        this.nome = nome;
        this.idUsuario = idUsuario;
        this.itensEmprestados = new ArrayList<>();
    }

    public void emprestarItem(ItemAcervo item){
        itensEmprestados.add(item);
    }

    public void devolverItem(ItemAcervo item){
        itensEmprestados.remove(item);
    }

    @Override
    public String toString() {
        return "Nome: "+this.nome + "("+this.idUsuario+")";
    }

    public String getNome() {
        return nome;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
}
