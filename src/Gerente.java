public class Gerente extends Pessoa {
    private String department;

    public Gerente(String name, String cpf, int age, String department) {
        super(name, cpf, age);
        this.department = department;
    }

    public void printGerente() {
        this.printPessoa();
        System.out.println("Departamento: "+department);
        System.out.println("=====================");
    }
}
