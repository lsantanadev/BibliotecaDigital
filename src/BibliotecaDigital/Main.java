package BibliotecaDigital;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Autor autor1 = new Autor("Jorge Amado", "Brasileiro");
        Autor autor2 = new Autor("Deitel", "Americano");

        Usuario usuario1 = new Usuario("Leonardo", 123);
        Usuario usuario2 = new Usuario("Daniela", 569);

        Livro livro1 = new Livro("Java: Como programar",2008, autor2);
        Livro livro2 = new Livro("Capitaes de areia", 1990, autor1);

        MidiaDigital midia1 = new MidiaDigital("Livro digital", 2012, "Ebook");

        biblioteca.cadastrarUsuario(usuario1);
        biblioteca.cadastrarUsuario(usuario2);
        biblioteca.cadastrarItem(livro1);
        biblioteca.cadastrarItem(livro2);
        biblioteca.cadastrarItem(midia1);

        System.out.println("=============================");
        Scanner scanner = new Scanner(System.in);
        boolean valor = true;
        do{
            try{
                System.out.println("----------------Bem-vindo a biblioteca digital------------");
                System.out.println(" Escolher um livro (1)\n" +
                                    "Listar todo o acervo (2)\n" +
                                    "Sair do programa (3)\n" +
                                    "Escolha uma opção: ");
                int v = scanner.nextInt();
                switch (v){
                    case 1 :
                        System.out.println("Digite seu id: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Digite o nome do livro escolhido: ");
                        String nomeTitulo = scanner.nextLine();
                        biblioteca.emprestarItem(id, nomeTitulo);
                        break;
                    case 2:
                        biblioteca.listarAcervo();
                        break;
                    case 3:
                        System.out.println("Saindo...");
                        valor = false;
                        break;
                    default:
                        System.out.println("Digite um numero valido...");
                        break;
                }
            } catch (EmprestimoException e){
                System.err.println("ERRO: "+ e.getMessage());
            }
        }while(valor);
    }
}
