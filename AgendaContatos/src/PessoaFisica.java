public class PessoaFisica extends Pessoa{
    private String cpf, estadoCivil;

    public PessoaFisica(String nome, String endereco, String email, String cpf, String estadoCivil){
        super(nome, endereco, email);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }
}