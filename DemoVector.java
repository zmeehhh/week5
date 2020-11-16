import java.util.Vector;

public class DemoVector
{
	public static void main(String args[]) 
	{
		Vector<String> fruits = new Vector<String>();
		
		fruits.add("rambutan"); // 0
		fruits.add("jackfruit"); // 1
		fruits.add("mangoesteen"); // 2 changed to 1 after jackfruit removed
		System.out.println(fruits);

		fruits.remove("jackfruit"); // removed
		fruits.add("mango"); // 2
		System.out.println(fruits);

		System.out.println("mangoesteen is exist? " +
		fruits.contains("mangoesteen"));

		System.out.println("durian is exist? " +
		fruits.contains("durian"));

		System.out.println("position: " + fruits.get(1));

		// fruits.set(2,"durian");
		fruits.add(2,"durian");
		System.out.println(fruits);
		System.out.println("Size: " + fruits.size());
		
	}
}
