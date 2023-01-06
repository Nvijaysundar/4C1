package p1;
class Address {
	String hno,stname,city;
	int pincode;
	Address(String hno,String stname,String city,
							int pincode)
	{
		this.hno = hno;
		this.stname = stname;
		this.city = city;
		this.pincode = pincode;
	}
	void getData()
	{
		System.out.println("Hno: "+hno);
		System.out.println("Stname: "+stname);
		System.out.println("city: "+city);
		System.out.println("Pincode: "+pincode);
	}
}
