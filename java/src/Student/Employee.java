package Student;

public class Employee {
 String name;
 double sal;
 public Employee(String name,double sal )
 {
	 super();
	 this.name=name;
	 this.sal=sal;
	 
 }
 
 
 public String toString() {
	 return "Employee[name=" +name +", sal=" +sal +"]";
 }
}
