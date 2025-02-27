class Aluno {
    //Atributos
    private String nome;
    @SuppressWarnings("unused")
    private int idade;
    //Metodos
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void definirNome (String nome ) {
        this.nome = nome;
    }
    public void definirIdade (int idade ) {
        this.idade = idade;
    }
    public String recuperarNome () {
        return this.nome;
    }
}

class Referencia {
    private Aluno a1 , a2;
    public Referencia () {
        a1 = new Aluno ("Calos", 20);
        a2 = new Aluno ("Ana", 23);
        System.out.println("Nome do aluno 1: " + a1.recuperarNome());
        System.out.println("Nome do aluno 2: " + a2.recuperarNome());
        a2 = a1;
        a2.definirNome("Flavia");
        System.out.println("Nome do aluno 1: " + a1.recuperarNome());
        mainipularAluno(a1);
        System.out.println("Nome do aluno 1: " + a1.recuperarNome());
    }
    public void mainipularAluno(Aluno aluno) {
        aluno.definirNome("Marcia");
    }
    public static void main(String args[]) {}
}