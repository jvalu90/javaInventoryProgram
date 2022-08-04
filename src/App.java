import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputs = new Scanner(System.in).useLocale(Locale.US);
        int productsNumber, index;

        try {

          System.out.println("Please type de number of productos to save");
          productsNumber = inputs.nextInt();

          float[] productsCodes = new float[productsNumber];
          float[] productsQuantity = new float[productsNumber];
          float[] productsMinimunRequired = new float[productsNumber];

          System.out.println("Now, please type each element in the lists");

          for (index = 0; index < productsNumber; index ++) {
            System.out.print("Please type the code of the product number " + (index + 1) + " : ");
            productsCodes[index] = inputs.nextFloat();

            System.out.print("Please type quantity in the warehouse of the product number " + (index + 1) + " : ");
            productsQuantity[index] = inputs.nextFloat();

            System.out.print("Please type minimum required quantity of the product number " + (index + 1) + " : ");
            productsMinimunRequired[index] = inputs.nextFloat();
          }

        } catch (Exception ex) {
          System.out.println("An error has ocurred" + ex.getMessage());
        } finally {
          inputs.close();
        }
    }
}
