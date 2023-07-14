class Funcionario {
    protected String nome;
    protected int idade;
    protected String cargo;
    protected String setor;

    public Funcionario(String nome, int idade, String cargo, String setor) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.setor = setor;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
        System.out.println("Setor: " + setor);
    }
}

class FuncionarioTechNova extends Funcionario {
    public FuncionarioTechNova(String nome, int idade, String cargo, String setor) {
        super(nome, idade, cargo, setor);
    }
}
