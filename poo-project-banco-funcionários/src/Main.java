import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FuncionarioTechNova[] funcionarios = new FuncionarioTechNova[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Funcionário " + (i + 1));

            System.out.print("Digite o nome do funcionário: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            System.out.print("Digite o cargo: ");
            String cargo = scanner.nextLine();

            System.out.print("Digite o setor: ");
            String setor = scanner.nextLine();

            funcionarios[i] = new FuncionarioTechNova(nome, idade, cargo, setor);

            System.out.println(); // Linha em branco para separar as informações dos funcionários
        }

        // Exibindo as informações dos funcionários e o nome da empresa fictícia
        System.out.println("Banco de Dados da Empresa TechNova");
        for (int i = 0; i < 3; i++) {
            System.out.println("Funcionário " + (i + 1));
            funcionarios[i].exibirInformacoes();
            System.out.println(); // Linha em branco para separar as informações dos funcionários
        }

        scanner.close();
    }
}
