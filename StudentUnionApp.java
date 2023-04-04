// Second app for lab week 4
// 17/2/23
// Adam Plesca author

//4/4/23 origanlly got 0/5 on this graded lab so went back today and finished the program(s) properly.
import javax.swing.JOptionPane;
public class StudentUnionApp{
	public static void main(String args[]){
		//declare variable
		double numC, numH, numT, totalCost;
		//declare + create objects
		StudentUnion StudentUnion = new StudentUnion();
		//input
		numT = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter how many T-shirts you bought"));
		StudentUnion.setNumT(numT);
		numH = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter how many Hoodies you bought"));
		StudentUnion.setNumH(numH);
		numC = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter how many Caps you bought"));
		StudentUnion.setNumC(numC);
		//process
		StudentUnion.compute();
		//output
		totalCost = StudentUnion.getTotal();
		JOptionPane.showMessageDialog(null, "Your total for everything you purchased is; " + totalCost);
	}
}