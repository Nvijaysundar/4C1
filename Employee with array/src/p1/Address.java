package p1;
class Address {
	String hno,stname,city;
	int pincode;
	Address(String hno,String stname,
							String city, int pincode)
	{
		this.hno =hno;
		this.stname = stname;
		this.city = city;
		this.pincode = pincode;
	}
	void getdata()
	{
		System.out.println("\t"+hno+"\t"+stname+"\t"
								+city+"\t"+pincode);
	}}
