import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputs = new Scanner(System.in).useLocale(Locale.US);
        int productsNumber, index, minProduct, maxProduct;

        try {

          System.out.println("Please type de number of productos to save");
          productsNumber = inputs.nextInt();

          int[] productsCodes = new int[productsNumber];
          int[] productsQuantity = new int[productsNumber];
          int[] productsMinimunRequired = new int[productsNumber];

          System.out.println("Now, please type each element in the lists");

          for (index = 0; index < productsNumber; index ++) {
            System.out.print("Please type the code of the product number " + (index + 1) + " : ");
            productsCodes[index] = inputs.nextInt();

            System.out.print("Please type quantity in the warehouse of the product number " + (index + 1) + " : ");
            productsQuantity[index] = inputs.nextInt();

            System.out.print("Please type minimum required quantity of the product number " + (index + 1) + " : ");
            productsMinimunRequired[index] = inputs.nextInt();
          }

          minProduct = productsQuantity[0];
          maxProduct = productsQuantity[0];
          
          System.out.println("Product codes that need to be ordered: ");
          for (index = 0; index < productsNumber; index++) {
            if (productsQuantity[index] < productsMinimunRequired[index]) {
              System.out.println(productsCodes[index]);
            }

            maxProduct = Math.max(maxProduct, productsQuantity[index]);
            minProduct = Math.min(minProduct, productsQuantity[index]);
          }

          //Corregir con el indice del arreglo de codigos

          System.out.println("Product code with the highest number of units: " + maxProduct);
          System.out.println("Product code with the least number of units:: " + minProduct);

        } catch (Exception ex) {
          System.out.println("An error has ocurred" + ex.getMessage());
        } finally {
          inputs.close();
        }
    }
}
