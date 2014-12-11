// class to represent an emplayee - inherits Person
public class Employee extends Person
{
  private double hourlyWage;
  private int hoursWorked;
  private String jobTitle;
  private Manager manager;
  public double getWage()
  {
    retrurn hourlyWage;
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
    return lastName", "+firstName+": "+jobTitle"@"+hourlyWage;
  }
  public setWage(double newWage)
  {
    hourlyWage=newWage;
  }
  public setHours(newHours)
  {
    hoursWorked=newHours;
  }
  public setTitle(newTitle)
  {
    jobTitle=newTitle;
  }
  public getRaise()
  {
    hourlyWage++;
  }
  public setManager(Manager newManager)
  {
    manager=newManager;
  }
}
