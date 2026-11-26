package collection;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1
{

	
	public static void main(String[] args)
	{
	 Student1 S1=new Student1("sanika");
	 Student1 s2= new Student1("sanika");
	 
	 
	List l= new ArrayList();
	l.add(1);
	l.add(1);
	l.add(2);
	l.add(3);
	
	Set ss= new HashSet<>();
	ss.addAll(l);
	System.out.println(ss);
	
	
	
	}
}

class Student1
{
	private String name;
	
	
	@Override
	public boolean equals(Object obj) 
	{
	 if (this==obj )
		 return true;
		
		if( obj instanceof Student1) {
		// TODO Auto-generated method stub
		 Student1 S2 =(Student1) obj;
		  if(name== S2.getName());
		   return true;
		}
	
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void Student(String name)
	{
		this.name=name;
		
		
	}

	public Student1(String name) {
		
		this.name = name;
	}
	
	
}
