import java.util.ArrayList;
import java.util.List;
import model.Disponibilidade;
import java.time.LocalDate;
import model.Produto;
import java.util.Scanner;


public class GerenciarProduto {
    public List<Produto> listaProduto = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        //MAIN
        Scanner s1 = new Scanner(System.in);
        GerenciarProduto gerenciar = new GerenciarProduto();

        int opc = 0;

        
        do {
            System.out.println("Digite 1 para cadastrar");
            System.out.println("Digite 2 para Consultar");
            System.out.println("Digite 3 para Consultar po nome");
            System.out.println("Digite 4 para alterar disponibilidade");
            System.out.println("Digite 5 para sair");
            opc = s1.nextInt();
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
        } while(opc != 9);
    }

    public void execCadastrar() {

        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço do produto: ");
        float preco = scanner.nextFloat();
        System.out.println("Digite a disponibilidade do produto: ");
        System.out.println("Digite a data do produto: ");
        String data = scanner.nextLine();
        // List<Produto> = [nome];
    }

    public void execConsultar() {
        // if(listaProduto.isEmpty()) {
        //     System.err.println(produto);
        // }
    }

    public void execConsultarPorNome() {
        System.err.println("Digite o Nome que deseja pesquisar: ");
        String consultar = scanner.nextLine();
        // for (Produto produto : listaProduto) {
        //     if (Produto.getNome().equalsIgnoreCase(nome)) {
                
        //     }
        // }
    }

    public void execAlterarDisponibilidade() {

    }
    
    public void execSair() {

    }
}
