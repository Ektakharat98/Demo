package Student;
import java.util.HashMap;
public class MyEmployee {
	public static void main(String[] args) {
		HashMap<Integer,Employee>e1=new HashMap<Integer,Employee>();
		e1.put(101, new Employee("abc",10.000));
		e1.put(102, new Employee("xyz",20.000));
		System.out.println(e1);
		for(Integer v1:e1.keySet()) {
			System.out.println(v1);
		}
	}
	

}
