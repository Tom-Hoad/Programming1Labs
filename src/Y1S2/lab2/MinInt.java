package Y1S2.lab2;

import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.recursion.MinimumInArray;

public class MinInt implements MinimumInArray{

    public static void main(String[] numbers){
        int[] arr = {24,52,74,9,34,23,64,34};
        MinInt minInt = new MinInt();
        System.out.println("Minimum is: " + minInt.findMin(arr));
    }

    public int findMin(int[] array){
        if (array.length == 2) {
            return findMinAux(array);
        } else {
            // Reduces the size of the array.
            int[] shortArray = new int[array.length - 1];
            System.arraycopy(array, 0, shortArray, 0, shortArray.length);

            // Finds the min from the last value in array and the smallest from the rest of the array.
            return findMinAux(new int[]{array[array.length - 1], findMin(shortArray)});
        }
    }

    // Finds the min value in an array of size two.
    public int findMinAux(int[] minArray) {
        return Math.min(minArray[0], minArray[1]);
    }
}
