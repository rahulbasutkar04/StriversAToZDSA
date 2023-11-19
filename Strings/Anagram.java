package strings;

public class Anagram {
    public static boolean anagram(String s1,String s2){
        StringBuffer sb=new StringBuffer(s2);
        for(int i=0;i<s1.length();i++)
        {
            int index=sb.indexOf(String.valueOf(s1.charAt(i)));
            if(index!=-1){
                sb.deleteCharAt(index);
            }

            else {
                return false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        String s1="CAT";
        String s2="ACl";
        System.out.println(anagram(s1,s2));
    }
}
