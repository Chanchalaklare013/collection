import java.util.*;
public class Collection1 
{
    public static void main(String []args)
    {
        ArrayList<String> city=new ArrayList<>(Arrays.asList("Pune","Indore","Delhi","Kota","Alahabad"));
        Collections.sort(city);
        System.out.println("Sorted Cities are "+city);
    }
    
}
