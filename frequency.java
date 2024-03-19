public class frequency {
    public static void main(String[] args) {
        int a[] ={2,2,2,3,4,3,6,6,7,9,9};
        int n = a.length;
        for(int i = 0;i<n;i++)
        {
            int flag = 0;
            int count  = 0;
            for(int j = i+1;j<n;j++)
            {
                if(a[i] == a[j])
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
            {
                continue;
            }
            for(int j = 0;j<=i;j++)
            {
                if(a[i] ==  a[j])
                {
                    count++;
                }
            }
            System.out.println(a[i] + " : " + count);

        }
    }
}
