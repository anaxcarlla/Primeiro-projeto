import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeContatos gerenciador = new GerenciadorDeContatos();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Adicionar contato");
            System.out.println("2. Listar contatos");
            System.out.println("3. Buscar contato");
            System.out.println("4. Editar contato");
            System.out.println("5. Remover contato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    gerenciador.adicionarContato();
                    break;
                case 2:
                    gerenciador.listarContatos();
                    break;
                case 3:
                    gerenciador.buscarContato();
                    break;
                case 4:
                    gerenciador.editarContato();
                    break;
                case 5:
                    gerenciador.removerContato();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
        } while (opcao != 0);

        scanner.close();
    }
}