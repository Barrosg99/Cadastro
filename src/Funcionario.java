public class Funcionario extends Pessoa {
    private float salario;

    public Funcionario(String name, String cpf, int age, float salario) {
        super(name, cpf, age);
        this.salario = salario;
    }
    
    public void printFuncionario() {
        this.printPessoa();
        System.out.println("Salário: "+ salario);
        System.out.println("=====================");
    }
}
