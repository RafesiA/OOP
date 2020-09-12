
import java.util.*;

public class TreeProgram 
{
  private static void print(Collection<?> collection)
  {
    boolean first = true;
    for (Object obj : collection)
    {
      if (!first) System.out.print(", ");
      System.out.print(obj);
      first = false;
    }
    System.out.println();
  }
  
  private static Set<Person> createTreeSet(List<Person> list)
  {
    Set<Person> set = new TreeSet();
    for (Person pers : list) set.add(pers);
    return set;
  }
  
  private static Set<Person> createHashSet(List<Person> list)
  {
    Set<Person> set = new HashSet();
    for (Person pers : list) set.add(pers);
    return set;
  }
  
  private static List<Person> createList()
  {
    ArrayList<Person> list = new ArrayList();
    list.add(new Person("이순신")); 
    list.add(new Person("김소연")); 
    list.add(new Person("박사천"));
    list.add(new Person("김소연")); // 중복
    list.add(new Person("타잔"));
    list.add(new Person("홍길동"));
    list.add(new Person("박사천"));
    list.add(new Person("김소연"));
    return list;
  }
  public static void main(String[] args) 
  {
    List<Person> list = createList();
    System.out.println("Output by Arraylist");
    print(list);
    Set<Person> set1 = createHashSet(list);
    System.out.println("Output by HashSet");
    print(set1);
    Set<Person> set2 = createTreeSet(list);
    System.out.println("Output by TreeSet");
    print(set2);
  }
  
}
