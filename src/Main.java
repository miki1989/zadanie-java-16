import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Random random = new Random();
        int [] tablica = new int[10];
        String [] tab;
        int x = 9;
        String arr;

        for (int i = 0; i < tablica.length; i++) {
                tablica[i] = random.nextInt(100);
                System.out.print(tablica[i] + " ");
        }


        int[] tab2 = tablica.clone();

        while (x < tab2.length && x >=0 ){
            System.out.print(tab2[x] + " ");
            x--;
        }
        //int[] tab2 = IntStream.rangeClosed(1, tablica.length).map(i -> tablica[tablica.length-i]).toArray();
        //while (x < 10){
        //    System.out.print(tab2[x]+ " ");
        //    x++;
        //}
    }
}
