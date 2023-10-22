package core.generic;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSortNumbers<Integer> intBub = new BubbleSortNumbers<>();
        BubbleSortNumbers<Double> dubBub = new BubbleSortNumbers<>();
        BubbleSortNumbers<Long> lngBub = new BubbleSortNumbers<>();
        BubbleSortNumbers<Float> fltBub = new BubbleSortNumbers<>();

        Integer[] intArray = intBub.sortArray(new Integer[]{3, 1, 2});
        Double[]  dubArray = dubBub.sortArray(new Double[]{3.0d, 2.0d, 1.0d});
        Long[]    lngArray = lngBub.sortArray(new Long[]{3L, 2L, 1L});
        Float[]   fltArray = fltBub.sortArray(new Float[]{3f, 2f, 1f});

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(dubArray));
        System.out.println(Arrays.toString(lngArray));
        System.out.println(Arrays.toString(fltArray));
    }
}
