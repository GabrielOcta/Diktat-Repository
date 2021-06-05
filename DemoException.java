
import java.util.Scanner;

/**
 * @Author 1972037 Gabriel Octa Mahardika
 **/
public class DemoException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukan angka 1: ");
            int number1 = Integer.parseInt(scanner.next());
            System.out.print("Masukan angka 2: ");
            int number2 = Integer.parseInt(scanner.next());
            System.out.println("Hasil angka 1 + angka 2 = " + (number1 + number2));
            System.out.println("Hasil angka 1 - angka 2 = " + (number1 - number2));
            System.out.println("Hasil angka 1 * angka 2 = " + (number1 * number2));
            System.out.println("Hasil angka 1 / angka 2 = " + (number1 / number2));
        }catch (NumberFormatException e){
            System.out.println("Pastikan input merupakan bilangan bulat");
        }catch (ArithmeticException e){
            System.out.println("Angka kedua tidak boleh 0 ");
        }
    }
}
