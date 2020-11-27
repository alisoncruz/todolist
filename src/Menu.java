import java.util.Scanner;

public class Menu {

    public static void imprimeMenu() {
        System.out.println();
        System.out.println("Bem vindo ao sistema de TodoList");
        System.out.println("Digite o número do que deseja fazer:");
        System.out.println("1) Adicionar Categoria");
        System.out.println("2) Listar todas as categorias");
        System.out.println("3) Remover uma categoria");
        System.out.println("0) Sair do programa");
    }

    public String decisaoUsuario() {
        Scanner decisaoUsuario = new Scanner(System.in);
        String valorDecisao = decisaoUsuario.next();
        return valorDecisao;
    }
}
