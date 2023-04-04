//  Week 4 lab (app that incorperates an instantiable class) Student deposit thingy
// 17/2/23
// Adam Plesca author

//4/4/23 origanlly got 0/5 on this graded lab so went back today and finished the program(s) properly.
import javax.swing.JOptionPane;
public class MoneyApp{
	public static void main(String args[]){

		double cash, revolut, pounds, total, euro;

		Money Money = new Money();

		cash = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter amount paid in cash "));
		Money.setCash(cash);

		revolut = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter amount paid in revolut"));
		Money.setRev(revolut);

		Money.computeTotal();
		Money.computePounds();

		total = Money.getEuro();
		pounds = Money.getPounds();

		JOptionPane.showMessageDialog(null,"You paid: " + total + "\n And in pounds that is: " + pounds);
	}
}