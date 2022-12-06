package p1;
public class Address {
	String hno,stname,city;
	int pincode;
	public void setData(String hno,String stname,
							String city, int pincode)
	{
		this.hno =hno;
		this.stname = stname;
		this.city = city;
		this.pincode = pincode;
	}
	public void getdata()
	{
		System.out.println("Address: "+hno+"\t"+stname+"\t"
								+city+"\t"+pincode);
	}}
