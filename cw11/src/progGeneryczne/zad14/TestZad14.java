package progGeneryczne.zad14;

public class TestZad14 {
    public static void main(String[] args) {
        Integer[] tab = {2, 7, 2, 8, 9, 11, 1};
        System.out.println(minValue(tab));
    }
    public static <T extends Comparable<T>> T minValue(T[] arr){
        T min = arr[0];
        for (T elem : arr){
            if(min.compareTo(elem) > 0){
                min = elem;
            }
        }
        return min;
    }
}
