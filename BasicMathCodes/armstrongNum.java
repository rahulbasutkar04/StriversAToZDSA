class armstrongNum {
    public static void main(String[] args) {
        int a=135;
        int dup=a;
        int sum=0;
        while(a>0)
        {
            
           int d=a%10;
           sum=sum+(d*d*d);
           a=a/10;
        }
        
        if(dup==sum)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}


//armstrong num
a=123
  if sum=(1*1*1)+(2*2*2)+(3*3*3)==a  then yes
  else no
