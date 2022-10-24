public class InsertionSort {
    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int aI = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > aI) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = aI;
            System.out.print("\n" + i + ": ");
            for (int k : a) {
                System.out.print(k + "\t");
            }
        }
    }

    public static void main(String[] args) {
        int[] n = {5, 4, 3, 2, 7, 1, 0};
        insertionSort(n);
    }

}
