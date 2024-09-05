package Collection.LinkList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class _1Prectice 
{
 public static void main(String []args)
 {
  LinkedList<String> ll=new LinkedList<>(Arrays.asList("java","c","c++","R"));
  ll.add("PHP");
  System.out.println(ll);
  ll.addFirst("js");
  System.out.println(ll);
  System.out.println(ll.getLast());
  System.out.println(ll.getFirst());
  System.out.println(ll.contains("ruby"));
  System.out.println(ll.clone());
  ll.set(2, "ruby");
  System.out.println(ll);
  Collections.unmodifiableList(ll);
  ll.add("notjs");
  ll.set(1,"css");
  System.out.println(ll);
  System.out.println(ll.isEmpty());
  //System.out.println(ll.remove("R"));
  
  //modifying element
  List<String> l=Collections.unmodifiableList(ll);
  //l.add("HTML");
  System.out.println(l);
  System.out.println(ll.hashCode());
  System.out.println(ll.lastIndexOf("c++"));
  

  





  
 }
}
