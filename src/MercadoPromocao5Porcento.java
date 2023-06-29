import java.util.Arrays;
import java.util.Scanner;

public class MercadoPromocao5Porcento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] frutasDoDiaEmPromocao = {"banana", "maçã", "abacaxi", "melão", "mamão" };

        String[] frutasEmPromocao = concedeDesconto(frutasDoDiaEmPromocao, scanner);

        System.out.println("Você comprou as seguintes frutas em promoção: " + Arrays.toString(frutasEmPromocao));
        System.out.println("Portanto, receberá um desconto de " + frutasEmPromocao.length * 5 + "%.");

    }


        private static String[] concedeDesconto (String[]frutasDoDiaEmPromocao, Scanner scanner){
            System.out.println("Informe sua lista de compras separando por vírgulas. Exemplo: banana,uva.");
            String compra = scanner.nextLine();
            String[] listaDeCompras = compra.split(",");
            String[] frutasEmPromocao = new String[listaDeCompras.length];
            int cont = 0;
            for (String fruta : listaDeCompras) {
                for (String promoFruta : frutasDoDiaEmPromocao) {
                    if (promoFruta.equalsIgnoreCase(fruta)) {
                        frutasEmPromocao[cont++] = fruta;
                        break;
                    }
                }
            }

            return frutasEmPromocao;

        }
    }
