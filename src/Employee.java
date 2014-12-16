// class to represent an emplayee - inherits Person
public class Employee extends Person
{
  private double hourlyWage;
  private int hoursWorked;
  private String jobTitle;
  private Manager manager;
  public Employee(String first, String last, int newAge, double wage, int hours, String title)
  {
    super(newAge, first, last);
    hourlyWage=wage;
    hoursWorked=hours;
    jobTitle=title;
  }
  public double getWage()
  {
    return hourlyWage;
  }
  public int getHours()
  {
    return hoursWorked;
  }
  public double getWeeklyWage()
  {
    return hoursWorked*hourlyWage*7;
  }
  public double getYearlySalary()
  {
    return getWeeklyWage()*52;
  }
  public String getJobTitle()
  {
    return jobTitle;
  }
  public String toString()
  {
    return super.toString()+" :"+jobTitle+"@ "+getYearlySalary();
  }
  public void setWage(double newWage)
  {
    hourlyWage=newWage;
  }
  public void setHours(int newHours)
  {
    hoursWorked=newHours;
  }
  public void setTitle(String newTitle)
  {
    jobTitle=newTitle;
  }
  public void getRaise()
  {
    hourlyWage++;
  }
  public void setManager(Manager newManager)
  {
    manager=newManager;
  }
  public boolean equals(Object o)
  {
    if(o instanceof Employee)
    {
      Employee other = (Employee) o;
      return getFirstName()== other.getFirstName() && getLastName()==other.getLastName() && getAge()==other.getAge() && getWage()== other.getWage() && getHours() == other.getHours() && getJobTitle()==other.getJobTitle()&& getManager()==other.getManager();
    }
    else
    {
      return false;
    }
  }
}
