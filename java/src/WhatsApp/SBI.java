package WhatsApp;
class Atm
{
	private double money = 80.000;
	public double getMoney()
	{
		return money;
		
	}
	public void setMoney(double money) {
		this.money=money;
	
	}
	public void withdraw() {
		System.out.println("u can withdraw money");
	}
}


public class SBI {
	public static void main(String[] args) {
		Atm a = new Atm();
		a.setMoney(75.000);
		System.out.println("Total amount : " +a.getMoney());
		a.withdraw();
		
	}

}
