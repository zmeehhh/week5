import java.util.HashSet;

public class DemoSet 
{
	public static void main(String[] args) 
	{
		HashSet<String> setFruits = new HashSet<String>();

		setFruits.add("rambutan");
		setFruits.add("jackfruit");
		setFruits.add("mangoesteen");
		setFruits.add("jackFruit"); // if spelled as jackfruit it will not appear.

		System.out.println(setFruits);
	}
}
