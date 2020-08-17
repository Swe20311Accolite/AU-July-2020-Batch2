public class Pg1 {

public static boolean prime(int a)
{
    if(a%2==0)
        return false;
    for(int i=3;i<=Math.sqrt(a);i=i+2)
        if(a%i==0)
            return false;
        return true;
}
public static void main(String[] args)
{
    int n=100;
    int count=0;int i=1;
    while(i<=n)
        try {
            if(!prime(i) && i!=2) {
                count++;i++;
            }
            else {
                i++;
                throw new Exception();
            }
        }
        catch (Exception e)
        {
            System.out.println("exception has come as the input is prime");
            System.out.println("count is:"+count);

        }
}
}
