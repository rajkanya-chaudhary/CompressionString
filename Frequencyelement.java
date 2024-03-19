import java.util.Arrays;
public class Frequencyelement {
    public static void countFrequency(int a[], int n) {
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && a[i] == a[i + 1]) {
                count++;
                i++;
            }
            System.out.println(a[i] + " : " + count);
        }
    }

    public static void main(String[] args) {
        int a[] = {5, 8, 5, 7, 8, 10};
        int n = a.length;
        countFrequency(a, n);
    }
}
