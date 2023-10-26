import java.util.Scanner;

public class Menu {
    private Scanner entrada;
    private Agenda agenda = new Agenda();

    public Menu(){
        entrada = new Scanner(System.in);
    }

    public void executar(){
        int op;
        do{
            exibirOpcoes();
            op = Integer.parseInt(entrada.nextLine());
            executarOpcao(op);
        }while(op != 5);
    }

    private void exibirOpcoes() {
        System.out.println("=======Menu de Opções=======");
        System.out.println("1 - Cadastrar uma pessoa física");
        System.out.println("2 - Cadastrar uma pessoa jurídica");
        System.out.println("3 - Remover um contato");
        System.out.println("4 - Imprimir dados da agenda");
        System.out.println("5 - Sair");
    }

    private void executarOpcao(int op) {
        switch (op){
            case 1:
                System.out.print("Nome: ");
                String nome = entrada.nextLine();
                System.out.print("Endereço: ");
                String endereco = entrada.nextLine();
                System.out.print("E-mail: ");
                String email = entrada.nextLine();
                System.out.print("CPF: ");
                String cpf = entrada.nextLine();
                System.out.print("Estado Civil: ");
                String estadoCivil = entrada.nextLine();
                agenda.adicionarPessoaFisica(nome, endereco, email, cpf, estadoCivil);
                break;
            case 2:
                System.out.print("Nome: ");
                String nome2 = entrada.nextLine();
                System.out.print("Endereço: ");
                String endereco2 = entrada.nextLine();
                System.out.print("E-mail: ");
                String email2 = entrada.nextLine();
                System.out.print("CPF: ");
                String cnpj = entrada.nextLine();
                System.out.print("Estado Civil: ");
                int inscricaoEstadual = entrada.nextInt();
                agenda.adicionarPessoaJuridica(nome2, endereco2, email2, cnpj, inscricaoEstadual);
                break;
            case 3:

                agenda.removerContato(pessoa);
                break;
            case 4:
                visualizarContatos()
                break;
            case 5:
                break;
            default:
                System.out.println("Escolha uma opcao entre 1 e 5!");
        }
    }
}
