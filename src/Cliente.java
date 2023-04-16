public class Cliente extends Pessoa {
    private float conta;

    public Cliente(String name, String cpf, int age, float conta) {
        super(name, cpf, age);
        this.conta = conta;
    }

    public void printCliente() {
        this.printPessoa();
        System.out.println("Conta à pagar: "+ conta);
        System.out.println("=====================");
    }
    
}
