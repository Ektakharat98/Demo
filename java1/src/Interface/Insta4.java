package Interface;

public interface Insta4 {
	abstract public void login();
	
}
class Instagram4 implements Insta4
{
	public void login()
	{
		System.out.println("login");

	}
	public void upload()
	{
		System.out.println("upload");
	}
	public void delete()
	{
		System.out.println("delete");
	}
	public class Demo
	{
		public static void main(String[] args) {
			Insta4 ref = new Instagram4();
			ref.login();
		}
	}
}
