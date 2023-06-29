import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mercado {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        List<String> carrinhoDeCompra = new ArrayList<>() {{
            System.out.println("Insira 5 frutas: ");
            for (int i = 0; i < 5; i++) {
                String fruta = leitura.nextLine();
                add(fruta);
            }
        }};

        System.out.println("As frutas selecionadas foram: ");
        for (String frutas : carrinhoDeCompra) {
            System.out.print(frutas + " ");
        }
    }
}
