import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int[] list, int n) {
        if (n < 2) {
            return;
        }

        int middle = n / 2;

        int[] left = Arrays.copyOfRange(list, 0, middle);
        int[] right = Arrays.copyOfRange(list, middle, n);

        mergeSort(left, left.length);
        mergeSort(right, right.length);
        merge(list, left, right);
    }

    private void merge(int[] list, int[] left, int[] right) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                list[k] = left[i];
                i++;
                k++;
            } else {
                list[k] = right[j];
                k++;
                j++;
            }
        }

        while (i < left.length) {
            list[k] = left[i];
            k++;
            i++;
        }

        while (j < right.length) {
            list[k] = right[j];
            k++;
            j++;
        }
    }
}
