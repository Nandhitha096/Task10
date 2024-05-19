package oopsconcepts;

public class Tea {
	
	String basictea;
	String milktea;
	String sugartea;
	
	public String prepareTea()
	{
	    basictea="Basic Tea - Hot water and Tea leaves";
		System.out.println("Prepared basic tea with hot water and tea leaves");
		return basictea;
	}
	public String addMilk()
	{
		
		    basictea= "+milk";
			System.out.println("Added milk to the Tea");
		    return milktea;
	}
	public String addSugar()
	{
		    basictea="+sugar";
			System.out.println("Added sugar to the Tea successfully");	
		    return sugartea;
	}

	public static void main(String[] args) {
		
		Tea t=new Tea();
		System.out.println(t.prepareTea());

		System.out.println();
		System.out.println(t.addMilk());
		System.out.println();
		System.out.println(t.addSugar());

	}

}
