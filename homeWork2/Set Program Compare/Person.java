
public class Person implements Comparable<Person>
{
  private String name;
  
  public Person(String name)
  {
    this.name = name;
  }
  
  public String getName() {
	  return name;
  }
  
  public String toString() {
	  return name;
  }
  
  public boolean equals(Object obj)
  {
    if (obj == null) return false;
    if (getClass() == obj.getClass())
    {
      Person pers = (Person)obj;
      return name.equals(pers.name) && name.equals(pers.name);
    }
    return false;
  }
  
  public int hashCode()
  {
    return name.hashCode();
  }
  
  
  public int compareTo(Person pers) {
	  return this.name.compareTo(pers.name);
  } 
}