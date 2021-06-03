import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Gabriel Octa Mahardika 1972037
 */
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("## Proses input angka ##");
        for(int i=0; i<5;i+=1){
            System.out.print("Input array ke-"+(i+1)+": " );
            numbers[i] = scanner.nextInt();
        }
        System.out.println("## Angka Hasil Input ##");
        for(int i=0; i<5;i+=1){
            System.out.println(numbers[i]);
        }
        System.out.println("## Array setelah diurutkan ##");
        Arrays.sort(numbers);
        for(int i=0; i<5;i+=1){
            System.out.println(numbers[i]);
        }
    }
}
