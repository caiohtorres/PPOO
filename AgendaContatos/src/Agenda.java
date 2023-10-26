import java.util.ArrayList;

public class Agenda{

    
    private ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();

    public void adicionarPessoaFisica(String nome, String endereco, String email, String cpf, String estadoCivil){
        PessoaFisica pessoaFisica = new PessoaFisica(nome, endereco, email, cpf, estadoCivil);
        pessoa.add(pessoaFisica);
        System.out.println("Pessoa Física adicionada com sucesso!");
    }

    public void adicionarPessoaJuridica(String nome, String endereco, String email, String CNPJ, int inscricaoEstadual){
        PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, endereco, email, CNPJ, inscricaoEstadual);
        pessoa.add(pessoaJuridica);
        System.out.println("Pessoa Jurídica adicionada com sucesso!");
    }

    public void removerContato (Pessoa p){

    }


    public void visualizarContatos(){
        for (Pessoa p : pessoa){
            if(p instanceof PessoaFisica){
                PessoaFisica pessoaFisica = (PessoaFisica) p;
                System.out.println("Nome: " + pessoaFisica.getNome());
                System.out.println("CPF: " + pessoaFisica.getCpf());
                System.out.println("Estado Civil: " + pessoaFisica.getEstadoCivil());
            } else if (p instanceof PessoaJuridica){
                PessoaJuridica pessoaJuridica = (PessoaJuridica) p;
                System.out.println("Nome: " + pessoaJuridica.getNome());
                System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
                System.out.println("Inscrição Estadual: " + pessoaJuridica.getInscricaoEstadual());
            } 
            System.out.println("Endereço: " + p.getEndereco());
            System.out.println("E-mail: " + p.getEmail());
            System.out.println();
        }
    }
}