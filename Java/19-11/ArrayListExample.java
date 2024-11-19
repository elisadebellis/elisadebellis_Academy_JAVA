import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args){
        //ArrayList
        // utilizzato per aggregazione dinamiche dell'array
        ArrayList<String> cars = new ArrayList<String>();

        //aggiunge alla fine dell'array
        cars.add("Volvo");
        cars.add("BMW");
        //scegli l'indice dove inserirlo e lo sostituisce
        cars.set(0,"Opel");
        System.out.println(cars);
        // ritorna la size dell'array
        System.out.println(cars.size());
        //remove toglie l'elemento in quella posizione
        cars.remove(0);
        System.out.println(cars);
        //clear() rimuove tutti gli elementi 
        cars.clear();


        //come convertire un array in un array list
        Integer[] myArr = {1,2,3,4,5,6};
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(myArr));
        arrayList.add(7);
        System.out.println(arrayList);


    }
}
