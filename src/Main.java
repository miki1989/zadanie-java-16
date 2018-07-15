import java.util.*;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {



        Random random = new Random();
        int [] tablica = new int[10];
        // Sposob drugi to klonowanie z uzyciem petli while , sa to fragmenty zakomentowane int x = 9;


        for (int i = 0; i < tablica.length; i++) {
                tablica[i] = random.nextInt(100);
                //System.out.print(tablica[i] + " ");
        }
        for(int j = 0; j < tablica.length*2; j++){
            if(j < tablica.length){
                System.out.print(tablica[j] + " ");
            }
            else{
                System.out.print(tablica[(2*tablica.length - 1)-j] +" ");
            }
        }


        /*int[] tab2 = tablica.clone();

        while (x < tab2.length && x >=0 ){
            System.out.print(tab2[x] + " ");
            x--;
        }
        //int[] tab2 = IntStream.rangeClosed(1, tablica.length).map(i -> tablica[tablica.length-i]).toArray();
        //while (x < 10){
        //    System.out.print(tab2[x]+ " ");
        //    x++;
        //}
        */
    }
}
