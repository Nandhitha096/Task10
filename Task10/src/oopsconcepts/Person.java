package oopsconcepts;


public class Person {
	
	private int age;
	String name;
	
	Person()
	{
		System.out.println("Below is the Name & age of a person");
	}
	
			
		public String getName()
		{
			return name;
		}
		
		public int getAge()
		{
			return age;
		}
		
		public void setName(String n)
		{
			name= n;
		}
		public void setAge(int a)
		{
			age=a;
		}

	
	public static void main(String[] args) {
		
		Person p1=new Person();
		p1.setName("Nandhitha");
		p1.setAge(27);
		//p1.setName("Ananya");
		//p1.setAge(40);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
		
	}

}
