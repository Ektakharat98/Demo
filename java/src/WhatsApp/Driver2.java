package WhatsApp;

class WhatsAppVer1 {
	long number;
	String name;
	WhatsAppVer1()
	{
		
	}
	WhatsAppVer1(long number,String name)
	{
		this.number=number;
		this.name=name;
	}
	public void details()
	{
		System.out.println("Name :" +name);
		System.out.println("Number :" +number);
	}
	public void send()
	{
		System.out.println("U can send the images");
		System.out.println("U can send the video");
	}

}
class WhatsAppVer2 extends WhatsAppVer1{
	long number;
	String name;
	WhatsAppVer2()
	{
		
	}
	WhatsAppVer2(long number,String name){
		this.number=number;
		this.name=name;
		}
	public void details()
	{
		System.out.println("Number :" +number);
		System.out.println("Name :" +name);
	}
	public void send()
	{
		super.send();
		System.out.println("U can send the images");
		System.out.println("U can send the video");
		System.out.println("U can send the docs");
		System.out.println("U can send the location");
		System.out.println("U can send the payement");
	}
	public void Vcall()
	{
		System.out.println("Now,U can enjoy video call");
	}
}
public class Driver2{
	public static void main(String[] args) {
		WhatsAppVer1 ref1 = new WhatsAppVer1(1234567890,"ABC");
		ref1.details();
		ref1.send();
		System.out.println("===============================================================");
			WhatsAppVer2 ref2 = new WhatsAppVer2(98765430,"XYZ");
			ref2.details();
			ref2.send();
		WhatsAppVer2 ref = (WhatsAppVer2) ref2;
		ref.Vcall();
	}
	
}