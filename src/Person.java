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
  public Person(int newAge, String first, String last)
  {
    age=newAge;
    firstName=first;
    lastName=last;
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
  public boolean equals(Object a)
  {
    if(o instanceof Manager)
    {
      Manager other = (Manager) ;
      return getFirstName()== other.getFirstName() && getLastName()==other.getLastName() && getAge()==other.getAge() &&getWage()==other.getWage() && getHours() == other.getHours() && getJobTitle()==other.getJobTitle()&& getManager()==other.getManager()&& department==other.getDepartment();
    }
    else
    {
      return false;
    }
  }
}
