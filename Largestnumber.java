public class Largestnumber {
    public static void main(String[] args) {
        int a[] = {12,45,67,99,44,33};
        int largest = a[0];
        for(int i = 0;i<a.length;i++)
        {
            if(a[i] > largest)
            {
                largest = a[i];
            }
        }
        System.out.println(largest);
    }
}
