package week2.task2;
public class Task1 {
	
    public static int gcd(int a, int b) {
		
		if(a<0) a=-a;
		if(b<0) b=-b;
	if (a == 0 && b != 0)
	{
		return b;
	}
	else if (a != 0 && b == 0)
	{
		return a;
	}
	while (a != b)
	{
		if (a > b)
		{
			a -= b;
		}
		else
		{
			b -= a;
		}
	}
	return a;

        // TODO: Tính ước chung lớn nhất của 2 số a, b
      
    }
	
    public static int fibonacci(int n) {
		int s1=0, s2 = 1;
	 int s=n;
	 if(n==0)
	 { }
 
	 else{
		 for(int i =1;i<s;i++)
		 {
		  n=s1+s2;
			s1=s2;
			s2=n;
		 }
	 }
	
	 
      //   TODO: Tìm số fibonacci ở vị trí n
       return n;
    }
	
	public static void main(String ard[])
	{
	//	System.out.println(gcd(-15,9));
	//	System.out.println(fibonacci(3));
	}
	
}
