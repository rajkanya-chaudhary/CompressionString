public class Palindrome {
    public static void main(String[] args) {
        int n = 1211;
        int sum = 0,rev,c;
        c = n;
        while (n>0) {
            rev = n % 10;
            sum = (sum * 10) + rev;
            n = n/10;
        }
        if(c==sum)
        {
          System.out.println("Palindrome number");
        }
        else{
            System.out.println("not palindrome number");
        }
    }
}
