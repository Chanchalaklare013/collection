import java.util.*;
public class Collection4 
{
    public static void main(String []args)
    {
        LinkedList<Integer> num=new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println( num);
        int sum=0;
        for(int i:num)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
    
}
