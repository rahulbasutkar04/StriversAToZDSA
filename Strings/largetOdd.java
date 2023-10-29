package strings;
//Largest Odd number in String
//check from the given string that if last element is odd if then whole string is odd ,if not then traverse till to get
//odd then return substring from that index to 0.
public class largetOdd{
    public static String  odd(String s){
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);

            if(c%2==1)//if odd
            {
                return s.substring(0,i+1);
            }
        }

        return "Nope";

    }
    public static  void main(String[] args){
        String s="54";
        System.out.println(odd(s));
    }
}
