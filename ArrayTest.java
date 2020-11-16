public class ArrayTest
{
	public static void passByReference(String a[])
	{
		a[0] = "Changed";
	}
	public static String passByValue(String a)
	{
		return a = "Changed Again";
	}
	public static String [] getArray()
	{
		String a[] = {"Satu" , "Dua" ,"Tiga", "Empat"};
		return a;
	}
	public static void main(String args[])
	{

		// String []b={"Apple","Mango","Orange"};
		// System.out.println("Before Function Call "+b[0]);
		// for (String v: b)
		// 	System.out.println(v);
		// ArrayTest.passByReference(b);
		// System.out.println("After Function Call "+b[0]);
		// for (String v: b)
		// 	System.out.println(v);
//-----------------------------------------------------------------------------------------
		// System.out.println("The return value: " + ArrayTest.passByValue(b[0]));
		// System.out.println("the array : ");
		// for (String v: b)
		// System.out.println(v);
//-----------------------------------------------------------------------------------------
		String []b; //size x ditentukan lagi
		b = getArray();
		for (String v: b)
			System.out.println(v);
		System.out.println(b.length);

		//size ditentukan oleh user input melalui scanner class
	}
}
