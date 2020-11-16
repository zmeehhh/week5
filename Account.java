//bila xde keyword public before keyword class
//naming the file can be either Account.java
//ObjectArray.java or any other name

class Account
{
	int a, b;
	public void setData(int c,int d)
	{
		a=c; 
		b=d;
	}
	public void showData()
	{
		System.out.println("Value of a = "+ a);
		System.out.println("Value of b = "+ b);
	}
}

class ObjectArray
{
	public static void main(String args[])
	{
		Account obj[] = new Account[2] ;
		obj[0] = new Account();
		obj[1] = new Account();

		obj[0].setData(1,2);
		obj[1].setData(3,4);
		
		System.out.println("For Array Element 0");
		obj[0].showData();
		System.out.println("For Array Element 1");
		obj[1].showData();
	}
}

