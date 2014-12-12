// main program to drive org chart
public class OrgChart
{
  public static void main(String[] args)
  {
    Manager m1=new Manager("Luke", "Hemmings", 18, 10000.0, 12, "Guitarist/ Lead Singer", "5 Seconds of Summer");
    Manager m2=new Manager("Calum", "Hood", 18, 9990.0, 9, "Bass Guitarist", "5 Seconds of Summer");
    Employee e1=new Employee("Micheal", "Clifford", 19, 5000.0,8, "Guitarist");
    e1.setManager(m1);
    Employee e2=new Employee("Ashton", "Irwin", 20, 7000.0,9, "Drummer");
    e2.setManager(m1);
    Employee e3=new Employee("One", "Direction", 21, 11000.0,10, "Biggest Boyband in the World");
    e3.setManager(m1);
    e3.setManager(m2);
    System.out.println(m1.toString()+"\n\t"+e1.toString()+"\n\t"+e2.toString());
    System.out.println(m2.toString()+"\n\t"+e3.toString());
  }
}
