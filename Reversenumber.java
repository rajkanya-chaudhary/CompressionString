public class Reversenumber {
    public static void main(String[] args) {
        int a[] = {2,4,6,8,12,15};
        int first = 0;
        int last =  a.length-1;
        while (first < last) {
            int temp = a[first];
            a[first] =  a[last];
            a[last] = temp;
            first++;
            last--;
        }
        for(int i = 0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
