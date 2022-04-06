package Interface;

public class Insta {

 public void login();
	

	}
	class Instagram2 implements Insta2
	{
		public void login()
		{
			System.out.println("Body/Implementation");
		}
	}
	 class Driver1
	{
		public static void main(String[] args) {
			Insta2 ref = new Instagram2();
			ref.login();
			
		}
	}
