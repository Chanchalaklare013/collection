import java.util.*;
public class Collection3 
{
    public static void main(String []args)
    {
        ArrayList<String> country=new ArrayList<>(Arrays.asList("India","Bhutan","Nepal","US"));
        System.out.println(country);
        country.addFirst("Japan");
        System.out.println(country);
        country.addLast("Canada");
        System.out.println(country);
        Collections.reverse(country);
        System.out.println(country);

    }
    
}
