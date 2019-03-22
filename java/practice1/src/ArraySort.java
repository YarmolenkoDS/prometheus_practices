public class ArraySort {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        //PUT YOUR CODE HERE
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int bigest = 0;
                if (j != (length - 1)) {
                    if (array[j] > array[j + 1]) {
                        bigest = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = bigest;
                    }
                }
            }
        }
        //PUT YOUR CODE HERE

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
