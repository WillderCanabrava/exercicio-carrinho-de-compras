import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MercadoPromocao {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        String[] promocao = {"banana", "maçã", "abacaxi", "melão", "mamão" };

        System.out.println("A lista de frutas em promoção é: " + Arrays.toString(promocao));

        System.out.println("Qual fruta deseja comprar  hoje?");
        String fruta = leitura.nextLine();

        List<String> lista = Arrays.asList(promocao);

        if (lista.contains(fruta)) {
            System.out.println("Parabéns! Você escolheu uma fruta em promoção!");
        } else
            System.out.println("Esta fruta não está em promoção");

        }
}
