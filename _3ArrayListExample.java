package Collection;

import java.util.ArrayList;

public class _3ArrayListExample 
{
 public static void main(String []args)
 {
    ArrayList<String> al=new ArrayList<>();
    al.add("java");
    al.add("c++");
    al.add("python");
    al.add("ruby");
    al.set(0,"golang");//To set a new value in available value
    al.add(2,"c");//To add the String/ element
    //al.remove(0); //To remove the element
    //al.contains("c++");
   // System.out.println(al.get(2));//To get  element 
  // al.clear(); to remove all elements
 //  System.out.println(al.isEmpty());
 //for(int i=0;i<((CharSequence) al).length();i++)
   System.out.println(al);
   System.out.println(al.contains("java"));

 }   
}
