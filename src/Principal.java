import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Menu menu = new Menu();
        List<String> categorias = new ArrayList<String>();
        boolean continua = true;


        while (continua) {

            menu.imprimeMenu();

            String valorDecisao = menu.decisaoUsuario();

            System.out.println("Decisao do usuário " + valorDecisao);

            switch (valorDecisao) {
                case "1": {
                    System.out.println("Digite o nome da categoria");
                    Scanner scanNomeCategoria = new Scanner(System.in);
                    String nomeCategoria = scanNomeCategoria.next();
                    categorias.add(nomeCategoria);
                    break;
                }

                case "2": {
                    System.out.println("========================");
                    for (String categoria : categorias)
                        System.out.println((categorias.indexOf(categoria) + 1) + " - " + categoria);
                    System.out.println("========================");
                    break;
                }

                case "3": {
                    System.out.println("Digite o número da categoria a ser removida");
                    Scanner scanCategoriaRemovida = new Scanner(System.in);
                    Integer numeroCategoriaRemovida = scanCategoriaRemovida.nextInt();
                    String categoriaARemover = categorias.get(numeroCategoriaRemovida - 1);
                    categorias.remove(categoriaARemover);
                    System.out.println("Categoria " + categoriaARemover + " removida com sucesso");
                    break;
                }

                case "0":
                    System.exit(0);

                default:
                    System.out.println("Opção inválida");
            }


        }

    }
}
