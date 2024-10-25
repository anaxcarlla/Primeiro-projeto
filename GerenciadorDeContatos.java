import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeContatos {
    private ArrayList<Contato> contatos;
    private Scanner scanner;

    public GerenciadorDeContatos() {
        contatos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void adicionarContato() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        Contato contato = new Contato(nome, telefone, email);
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!\n");
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.\n");
        } else {
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
            System.out.println();
        }
    }

    public void buscarContato() {
        System.out.print("Digite o nome do contato que deseja buscar: ");
        String nome = scanner.nextLine();
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println(contato + "\n");
                return;
            }
        }
        System.out.println("Contato não encontrado.\n");
    }

    public void editarContato() {
        System.out.print("Digite o nome do contato que deseja editar: ");
        String nome = scanner.nextLine();
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.print("Novo telefone: ");
                contato.setTelefone(scanner.nextLine());
                System.out.print("Novo e-mail: ");
                contato.setEmail(scanner.nextLine());
                System.out.println("Contato atualizado!\n");
                return;
            }
        }
        System.out.println("Contato não encontrado.\n");
    }

    public void removerContato() {
        System.out.print("Digite o nome do contato que deseja remover: ");
        String nome = scanner.nextLine();
        contatos.removeIf(contato -> contato.getNome().equalsIgnoreCase(nome));
        System.out.println("Contato removido!\n");
    }
}
