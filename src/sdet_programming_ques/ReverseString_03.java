package sdet_programming_ques;

public class ReverseString_03 {

    public static void main(String[] args) {

        String str = "ABCD";
        String rev = "";

        /*//Logic 1 - Using "+" (String Concatenation) Operator
        int len = str.length();  //4

        for(int i = len-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }*/

        //Logic 2 - Using Character Array
        /*char a[] = str.toCharArray();
        int len = a.length;

        for(int i = len-1; i>=0; i--){
            rev = rev + a[i];
        }*/

        //Logic 3 - Using StringBuffer Class
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        //Logic 4 - Using StringBuilder Class
        StringBuilder sbl = new StringBuilder();
        sbl.append(str);
        System.out.println(sbl.reverse());

        System.out.println("Reversed string is : " + rev);
    }
}
