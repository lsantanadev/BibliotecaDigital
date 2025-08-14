package BibliotecaDigital;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<ItemAcervo> acervo;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void cadastrarItem(ItemAcervo item){
        acervo.add(item);
    }

    public void cadastrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void listarAcervo(){
        System.out.println("#### Acervo completo ####");
        if(acervo.isEmpty()){
            System.out.println("Nenhum item cadastrado...");
            return;
        }
        for (ItemAcervo i : acervo){
            System.out.println(i.gerarFicha());
        }
    }

    public void emprestarItem(int usuarioEmprestimo, String tituloItem) throws EmprestimoException {
        if(acervo.isEmpty()){
            System.out.println("Nenhum item cadastrado...");
            return;
        }
        if (usuarios.isEmpty()){
            System.out.println("Nenhum usuario cadastrado...");
            return;
        }

        Usuario usuarioEncontrado = null;
        for (Usuario u : usuarios){
            if(u.getIdUsuario() == usuarioEmprestimo){
                usuarioEncontrado = u;
                break;
            }
        }
        if(usuarioEncontrado == null){
            throw new EmprestimoException("Usuario não encontrado");
        }

        ItemAcervo itemEncontrado = null;
        for (ItemAcervo i : acervo){
            if(i.getTitulo().equalsIgnoreCase(tituloItem)){
                itemEncontrado = i;
                break;
            }
        }
        if (itemEncontrado == null){
            throw new EmprestimoException("Item não encontrado no acervo");
        }
        if(itemEncontrado.getStatus() == StatusItem.EMPRESTADO){
            throw new EmprestimoException("Item ja está emprestado.");
        } else {
            usuarioEncontrado.emprestarItem(itemEncontrado);
            itemEncontrado.setStatus(StatusItem.EMPRESTADO);
            System.out.println("Parabens, o item "+itemEncontrado.getTitulo()+" foi emprestado com sucesso...");

        }
    }
    // TODO: ADICIONAR AO MENU MAIS OPÇÃO DE DEVOLVER ITEM
    public void devolverItem(int usuarioEmprestimo, String tituloItem) throws EmprestimoException{
        if(usuarios.isEmpty()){
            System.out.println("Não existe usuarios para devolver");
            return;
        }

        Usuario usuarioDevolve = null;
        for (Usuario u : usuarios){
            if(u.getIdUsuario() == usuarioEmprestimo){
                usuarioDevolve = u;
                break;
            }
        }
        if (usuarioDevolve == null){
            throw new EmprestimoException("Usuario não encontrado");
        }

        ItemAcervo itemDevolve = null;
        for (ItemAcervo i : acervo){
            if(i.getTitulo().equalsIgnoreCase(tituloItem)){
                itemDevolve = i;
                break;
            }
        }
        if (itemDevolve == null){
            throw new EmprestimoException("Item não faz parte do acervo");
        } else{
            usuarioDevolve.devolverItem(itemDevolve);
            itemDevolve.setStatus(StatusItem.DISPONIVEL);
            System.out.println("Item: "+itemDevolve.getTitulo()+" devolvido para o acervo pelo o usuario: "+usuarioDevolve.getNome());
        }
    }

    public ArrayList<ItemAcervo> getAcervo() {
        return acervo;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}
