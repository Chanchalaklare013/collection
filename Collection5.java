import java.util.*;
public class Collection5 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> num=new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        int k=4;
        if(num.contains(k))
        {
            System.out.println("yes found");
        }
        else
        {
            System.out.println("not found");
        }
        
    }
    
}
