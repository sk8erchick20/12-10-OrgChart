// Super Class to represent a person
public class Person
{
  private String firstName;
  private String lastName;
  private int age;
  public Person()
  {
    age=0;
    lastName="";
    firstName="";
  }
  public Person(int a, String f, String l)
  {
    age=a;
    firstName=f;
    lastName=l;
  }
  public String getFirstName()
  {
    return firstName;
  }
  public String getLastName()
  {
    return lastName;
  }
  public int getAge()
  {
    return age;
  }
  public String toString()
  {
    return lastName+", "+firstName;
  }
  public void recordBirthday()
  {
    age++;
  }
}
