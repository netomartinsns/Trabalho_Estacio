import java.util.ArrayList;

class Escola<Endereco, Departamento, Aluno> {
    //Atributos
    @SuppressWarnings("unused")
    private String nome, CNPJ;   
    @SuppressWarnings("unused")
    private Endereco endereco;
    private ArrayList<Departamento> departamentos;
    private ArrayList<Aluno> discentes;
    @SuppressWarnings("unused")
    private int nr_discentes , nr_departamentos;
 
    //Métodos
    public Escola ( String nome , String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new ArrayList<Departamento>(10);
        this.discentes = new ArrayList<Aluno>(1000);
        this.nr_departamentos = 0;
        this.nr_discentes = 0;
    }
    public void criarDepartamento(Departamento departamento){
        if(nr_departamentos <= 10)
        {
            departamentos.add(departamento);                
            nr_departamentos++;
        } else {
            System.out.println ( "Nao e possivel criar outro Departamento." );
        }
    }
    public void matricularAluno ( Aluno novoAluno ) {
       discentes.add(novoAluno);
    }

    // Método main
    public static void main(String[] args) {
        Escola<String, String, String> escola = new Escola<>("Escola Geni Gomes", "27.488.001/0002-22");
        System.out.println("Escola criada: " + escola.nome);
    }
}