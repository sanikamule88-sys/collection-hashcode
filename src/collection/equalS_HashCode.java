package collection;

public class equalS_HashCode {
	
	public static void main(String[] args) 
	{
		
		 employee e1=new employee("sanika ", "pune");
		 employee e2=new employee("sanika", "pune");
		 System.out.println(e1.equals(e2));
	}

}
class employee
{
	 
	private String name;
	private String Address;
	
	 
	@Override
	public boolean equals(Object o) 
	{
		// TODO Auto-generated method stub
		if(o instanceof employee)
		{
			employee e= employee(o);
			if(name==e.name || Address==e.Address)
				return true;
		}
		return false;
	}
	
	private employee employee(Object o) {
		return null;
	}

	public employee(String Name , String Address)
	
	{
		this.name=name;
		this.Address=Address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
}
