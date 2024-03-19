public class Duplicate {
    public static void main(String[] args) {
        int a[] = {10,20,20,40,30,50,50};
        int n = a.length;
        int f = 0;
        for(int i = 0;i<n;i++)
        {
            f = 0;
            for(int j = i+1;j<n;j++)
            {
                if(a[i] == a[j])
                {
                    f = 1;
                }
            }
            if(f == 1)
            {
                continue;
               
            }
            System.out.println(" " +a[i]);
        }
    }
}
