// class to represent a manager - inherits Emplyee
import java.util.*;
public class Manager extends Employee
{
  private ArrayList<Employee> directReports=new ArrayList<Employee>();
  private String department;
  public Manager(String first, String last, int newAge, double wage, int hours, String job, String dept)
  {
    super(first, last, newAge, wage, hours, job);
    department=dept;
  }
  public String getDepartment()
  {
    return department;
  }
  public ArrayList<Employee> getDirectReports()
  {
    return directReports;
  }
  public String toString()
  {
    return "Manager: "+super.toString();
  }
  public void addDirectReport(Employee employee)
  {
    directReports.add(employee);
  }
  public void removeDirectReport(Employee employee)
  {
    directReports.remove(employee);
  }
  public void setDepartment(String dept)
  {
    department=dept;
  }
  public boolean equals(Object a)
  {
    if(o instanceof Manager)
    {
      Manager other = (Manager) a;
      return getFirstName()== other.getFirstName() && getLastName()==other.getLastName() && getAge()==other.getAge() &&getWage()==other.getWage() && getHours() == other.getHours() && getJobTitle()==other.getJobTitle()&& getManager()==other.getManager()&& department==other.getDepartment();
    }
    else
    {
      return false;
    }
  }
}
