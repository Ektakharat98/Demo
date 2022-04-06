package Exception;

public class MyTryCatch {
public static void main(String[] args) {
	try {
		int a = 10;
		int b = 0;
		if(b>0) {
			System.out.println(a/b);
			
		}
	}
	catch(ArithmeticException  arithmethicException) {
		System.out.println("res as" + 0);
		
	}
	finally {
		System.out.println("i am final block");
	}
}
}
