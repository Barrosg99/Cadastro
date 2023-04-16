import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void  signUpPessoa(int option, ArrayList<Pessoa> pessoas, String name, String cpf, int age) {
        switch(option) {
            case 1:
            System.out.println("Informe o valor da sua conta: ");
            float conta = scanner.nextFloat();
            scanner.nextLine();
            pessoas.add(new Cliente(name,cpf,age,conta));
            break;
            case 2:
            System.out.println("Informe o valor da seu salario: ");
            float salario = scanner.nextFloat();
            scanner.nextLine();
            pessoas.add(new Funcionario(name, cpf, age, salario));
            break;
            case 3:
            System.out.println("Informe o seu departamento: ");
            String department = scanner.nextLine();
            pessoas.add(new Gerente(name, cpf, age, department));
        }
    }
    
    public static void listPessoa(ArrayList<Pessoa> pessoas) {
        for( Pessoa pessoa:pessoas) {
            if(pessoa instanceof Cliente) {
                Cliente cliente = (Cliente) pessoa;
                cliente.printCliente();
            } else if (pessoa instanceof Funcionario) {
                Funcionario funcionario = (Funcionario) pessoa;
                funcionario.printFuncionario();
            } else if (pessoa instanceof Gerente) {
                Gerente gerente = (Gerente) pessoa;
                gerente.printGerente();
            }
        }
    }

    public static void listPessoaTipo(int tipo, ArrayList<Pessoa> pessoas) {
        ArrayList<Pessoa> clientes = new ArrayList<>();
        ArrayList<Pessoa> funcionarios = new ArrayList<>();
        ArrayList<Pessoa> gerentes = new ArrayList<>();
        for( Pessoa pessoa:pessoas) {
            if(pessoa instanceof Cliente) {
                clientes.add(pessoa);
            } else if (pessoa instanceof Funcionario) {
                funcionarios.add(pessoa);
            } else if (pessoa instanceof Gerente) {
                gerentes.add(pessoa);
            }
        }
        switch(tipo) {
            case 1:
            listPessoa(clientes);
            break;
            case 2:
            listPessoa(funcionarios);
            break;
            case 3:
            listPessoa(gerentes);
        }
    }
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        
        int option;
        String menu = "1 - Cadastrar pessoa\n2 - Listar pessoas\n3 - Buscar pessoa por tipo\n0 - Sair";
        String menuPessoa = "1 - Cliente\n2 - Funcionario\n3 - Gerente";
        do {
            System.out.println(menu);
            option = scanner.nextInt();
            scanner.nextLine();
            switch(option) {
                case 1:
                System.out.println("Informe seu nome: ");
                String name = scanner.nextLine();
                System.out.println("Informe sua idade: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Informe seu CPF: ");
                String cpf = scanner.nextLine();
                System.out.println("Informe o seu papel: ");
                System.out.println(menuPessoa);
                int pessoaOption = scanner.nextInt();
                scanner.nextLine();
                signUpPessoa(pessoaOption, pessoas, name, cpf, age);
                break;
                case 2:
                listPessoa(pessoas);
                break;
                case 3:
                System.out.println("Escolha o tipo: ");
                System.out.println(menuPessoa);
                int pessoaOptio = scanner.nextInt();
                listPessoaTipo(pessoaOptio, pessoas);
            }
        } while (option != 0);
    }
}