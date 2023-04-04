// Second app for lab week 4
// 17/2/23
// Adam Plesca author

//4/4/23 origanlly got 0/5 on this graded lab so went back today and finished the program(s) properly.
public class StudentUnion{
	//declare data members
	private double numC, numH, numT, totalCost;
	//construtor - same name as class
	public StudentUnion(){
		numT = 0;
		numH = 0;
		numC = 0;
	}
	//setters - one for every input variable
	public void setNumT(double numT){
		this.numT = numT;
	}
	public void setNumH(double numH){
		this.numH = numH;
	}
	public void setNumC(double numC){
		this.numC = numC;
	}
	//compute method(s)
	public void compute(){
		totalCost = ((numT*10) + (numH*20) + (numC*5));
	}
	//getters - one for every output variable
	public double getTotal(){
		return totalCost;
	}
}