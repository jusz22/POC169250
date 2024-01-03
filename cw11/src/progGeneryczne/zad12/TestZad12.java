package progGeneryczne.zad12;

import java.util.Arrays;

public class TestZad12 {
    public static void main(String[] args) {
        String words[] = {"wad", "dsad", "sadasd"};
        swap(words, 0, 2);
        System.out.println(Arrays.toString(words));

    }
    public static <T> void swap(T[] arr, int index1, int index2){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Tablica jest null lub pusta");
        }
        if(index1 < 0 || index1 >= arr.length || index2 < 0 || index2 >= arr.length){
            throw new IllegalArgumentException();
        }
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
