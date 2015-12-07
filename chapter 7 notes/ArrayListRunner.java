import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       // A
       names.add("Alice");
       names.add("Bob");
       names.add("Connie");
       names.add("David");
       names.add("Edward");
       names.add("Fran");
       names.add("Gomez");
       names.add("Harry");
       
       System.out.println(names);
       
       //B
       String first = names.get(0);
       String last = names.get(7);
       
       System.out.println("The first name is: " + first + ". Whereas the last name is " + last + "." );
       
       //C 
       
       System.out.println("The size of this array is " + names.size());
       
       //D
       
       System.out.println("Using the size method the last name in the list" + names.get(names.size()-1));
       
       //E
       
       names.set(0,"Alice B. Toklas");
       System.out.println("Alice is now Alice B. Toklas: " + names.get(0));
       
       // F
       names.add(4,"Doug");
       System.out.println(names);
       
       // G
       
       for (String element : names)
       {
           System.out.println(element);
       }
       
       // H
       
       ArrayList<String> names2 = new ArrayList<String>(names);
       System.out.println("This is Array 2: " + names2);
       
       // I
       names.remove(0);
       System.out.println("This is Array 1: " + names);
       System.out.println("This is Array 2: " + names2);
       
   }
   
} 