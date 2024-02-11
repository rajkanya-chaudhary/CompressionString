package StingQuestion;

/*public class Compression {
    public static void main(String[] args) {
        String str = "aaabbcdd";
        String newstr = " ";
        for(int i = 0;i<str.length();i++)
        {
            int count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+i)) {
                count++;
                i++;
            }
            newstr = newstr + str.charAt(i);
            if(count > 1)
            {
                newstr += Integer.toString(count);

            }
        }
        System.out.println(newstr);
        
    }
}
*/
public class Compression {
    public static void main(String[] args) {
        String str = "aaabbcdd";
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr = newstr + str.charAt(i);
            if (count > 1) {
                newstr += Integer.toString(count);
            }
        }
        System.out.println(newstr);
    }
}

