import java.util.ArrayList;
import java.util.List;
import model.Produto;
import java.util.Scanner;


public class GerenciarProduto {
    private List<Produto> listaProduto;
    Scanner s1 = new Scanner(System.in);
    public static void main(String[] args){
        //MAIN
        
        GerenciarProduto gerenciar = new GerenciarProduto();

        int opc = 0;

        System.out.println("Digite 1 para cadastrar");
        System.out.println("Digite 2 para Consultar");
        System.out.println("Digite 3 para Consultar po nome");
        System.out.println("Digite 4 para alterar disponibilidade");
        System.out.println("Digite 5 para sair");
        do {
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
    
        System.out.println("Digite o preço do produto: ");
        System.out.println("Digite a disponibilidade do produto: ");
        System.out.println("Digite a data do produto: ");
    }

    public void execConsultar() {

    }

    public void execConsultarPorNome() {

    }

    public void execAlterarDisponibilidade() {

    }
    
    public void execSair() {

    }
}
