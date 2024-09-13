import java.util.ArrayList;
import java.util.List;
import model.Disponibilidade;
import java.time.LocalDate;
import model.Produto;
import java.util.Scanner;


public class GerenciarProduto {
    public List<Produto> listaProduto = new ArrayList<>();
    

    public static void main(String[] args){
        //MAIN
        Scanner scanner = new Scanner(System.in);
        GerenciarProduto gerenciar = new GerenciarProduto();

        int opc = 0;

        
        do {
            System.out.println("Digite 1 para cadastrar");
            System.out.println("Digite 2 para Consultar");
            System.out.println("Digite 3 para Consultar po nome");
            System.out.println("Digite 4 para alterar disponibilidade");
            System.out.println("Digite 5 para sair");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    gerenciar.execCadastrar();
                break;
                case 2:
                    gerenciar.execConsultar();
                break;
                case 3:
                    gerenciar.execConsultarPorNome();
                break;
                case 4:
                    gerenciar.execAlterarDisponibilidade();
                break;
                case 5:
                    gerenciar.execSair();
                break;
                
                default:
                    break;
            }
        } while(opc != 5);
    }

    public void execCadastrar() {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = s1.nextLine();
        System.out.println("Digite o preço do produto: ");
        float preco = s1.nextFloat();
        s1.nextLine();
        System.out.println("Digite a disponibilidade do produto: 1 PARA DISPONIVEL 2 PARA INDISPONIVEL");
        int disponibilidadeOpcao = s1.nextInt();
        Disponibilidade disponibilidade = (disponibilidadeOpcao == 1) ? Disponibilidade.disponivel : Disponibilidade.indisponivel;
        LocalDate dataCadastro = LocalDate.now();

        Produto produto = new Produto(nome, preco, disponibilidade, dataCadastro);
        listaProduto.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    public void execConsultar() {
        if (listaProduto.isEmpty()) { //lista vazia
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : listaProduto) {
                System.out.println(produto);
            }
        }
    }

    public void execConsultarPorNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto que deseja consultar: ");
        String nome = scanner.nextLine();

        boolean encontrado = false;
        for (Produto produto : listaProduto) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.println(produto);
                encontrado = true;
            }
        }
    }

    public void execAlterarDisponibilidade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto para alterar a disponibilidade: ");
        String nome = scanner.nextLine();

        boolean encontrado = false;
        for (Produto produto : listaProduto) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Produto encontrado: " + produto);
                System.out.print("Nova disponibilidade (1 para DISPONÍVEL, 2 para INDISPONÍVEL): ");
                int novaDisponibilidade = scanner.nextInt();
                produto.setDisponibilidade(novaDisponibilidade == 1 ? Disponibilidade.disponivel : Disponibilidade.indisponivel);
                System.out.println("Disponibilidade alterada com sucesso!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }
    
    public void execSair() {
        System.out.println("Encerrando o sistema...");
    }
}
