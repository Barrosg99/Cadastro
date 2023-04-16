public class Pessoa {
    private String name;
    private String cpf;
    private int age;

    public Pessoa(String name,String cpf,int age) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
    }

    public void printPessoa() {
        String person = "Nome: " + name + "\nCPF: " + cpf + "\nIdade: " + age ;
        System.out.println("=====================");
        System.out.println(person);
    }
}
