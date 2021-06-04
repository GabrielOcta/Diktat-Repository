import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @Author 1972037 Gabriel Octa Mahardika
 **/
public class TestCollection {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(2_000);
        numbers.add(-10_000);
        numbers.add(1_000_000);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(numbers);
        numbers2.add(1);

        System.out.println("Collection 1: " + numbers);
        System.out.println("Collection 2: " + numbers2);
        System.out.println("Collection 2 terdapat angka 1: " + numbers2.contains(1));

        numbers2.set(3, 50_000);
        System.out.println("Perubahan nilai untuk collection 2:" + numbers2);

        numbers2.remove(3);
        System.out.println("Collection 2 setelah ada element yang dihapus: "+ numbers2);

        Collections.sort(numbers2);
        System.out.println("Collection 2 setelah di sorting: "+numbers2);

        System.out.println("Nilai maksimum Collection 2: "+Collections.max(numbers2));
    }
}
