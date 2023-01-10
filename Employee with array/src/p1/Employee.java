package p1;
class Employee {
	String Name,Desg;
	float bsal;
	Employee(String Name,String Desg,float bsal)
	{
		this.Name = Name;
		this.Desg = Desg;
		this.bsal = bsal;
	}
	void getData()
	{
		System.out.print(Name+"\t"+Desg+"\t"+bsal);
	}
}
