package strings;
import java.util.*;
public class isomorphic {
    public static boolean help(String s1,String s2)
    {
        if(s1.length()!=s2.length()) return false;
        Map<Character,Character>  hm=new HashMap<>();

        for(int i=0;i<s1.length();i++)
        {
            char original=s1.charAt(i);
            char replace=s2.charAt(i);
            if(!hm.containsKey(original))
            {
                if(!hm.containsValue(replace))
                {
                    hm.put(original,replace);
                }
                else{
                    return false;
                }
            }

            else
            {
                char mapped=hm.get(original);
                if(mapped!=replace)
                {
                    return false;
                }
            }
        }

        return true;

    }
    public static void main(String[] args) {
        String s1="Rahul";
        String s2="Codes";

        System.out.println(help(s1,s2));
    }
}
