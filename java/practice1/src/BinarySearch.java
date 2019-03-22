public class BinarySearch {
    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

        // PUT YOUR CODE HERE
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                int bigest = 0;
                if (j != (data.length - 1)) {
                    if (data[j] > data[j + 1]) {
                        bigest = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = bigest;
                    }
                }
            }
        }

        int last = data.length - 1;
        int first = 0;
        int mid = (last + 1) / 2;
        while (data[mid] != numberToFind && last != mid && first != mid) {
            if (data[mid] < numberToFind) {
                first = mid;
                mid = (last + first) / 2;
            } else {
                last = mid;
                mid = (last + first) / 2;
            }
        }
        if (data[last] == numberToFind)
            mid = last;
        if (data[first] == numberToFind)
            mid = first;
        System.out.print(data[mid] == numberToFind ? mid : -1);
        // PUT YOUR CODE HERE
    }
}
