package Collection;
import java.util.ArrayList;
public class _4Practice 
{
 public static void main(String []args)
 {
    ArrayList<String> al=new ArrayList<>();
    al.add("java");
    al.add("c++");
    al.add("ruby");
    al.add("python");
  /*  for(int i=0;i<al.size();i++)//.size() to get size of array list
    {
      System.out.println(al.get(i));
    }*/
    //System.out.println(al.indexOf("c++"));
    for (String s : al) //for each loop
    {
     System.out.println(s);   
    }
 }   
}
