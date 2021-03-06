package Thread;
interface Lambda {
	public void print ();
	
}
interface SumInterface {
	public void sum(int a, int b);
	
}

public class MyLamda {
	public static void main(String[] args) {
		int x=10;
		Lambda res = () ->
		System.out.println("Hello Java Lambda");
		res.print();
		
		SumInterface ref = (int a,int b)->{
			int c = a+b;
			System.out.println(c);
		};
		ref.sum(10, 10);
		
	}
public static void print() {
	System.out.println("Hello Java");
}
public static void addingNumber(int a,int b) {
	int c = a + b;
	System.out.println(c);
}
}
