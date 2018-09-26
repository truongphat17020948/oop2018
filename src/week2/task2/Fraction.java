

public class Fraction {

    // TODO: khai báo các thuộc tính
int numerator ;
int denominator;
public void SetNumerator(int a) 
{
	numerator=a;
}
public int GetNumerator() {return numerator;}
public void SetDemominator(int b) 
{
	denominator=b;
}
public int GetDemominator(){ return denominator;}


    public Fraction(int numerator, int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
        // TODO: khởi tạo giá trị cho các thuộc tính numerator (tử số), denominator (mẫu số)
    }

    public Fraction add(Fraction other) {
		Fraction sothe= new Fraction(0,0);
		sothe.numerator=((other.numerator*denominator)+(other.denominator*numerator));
			sothe.denominator=(other.denominator*denominator);
System.out.println(sothe.numerator + "/" + sothe.denominator);
        // TODO: Phương thức cộng hai phân số (this và other), trả  đối tượng Fraction mới
        return sothe;
    }

    public Fraction subtract(Fraction other) {
		Fraction sothe= new Fraction(0,0);
		sothe.numerator=((other.numerator*denominator)-(other.denominator*numerator));
			sothe.denominator=(other.denominator*denominator);
        // TODO: Phương thức trừ hai phân số (this và other), trả đối tượng Fraction mới
    System.out.println(sothe.numerator + "/" + sothe.denominator);
        return sothe;
    }

    public Fraction multiply(Fraction other) {
	Fraction sothe= new Fraction(0,0);
		sothe.numerator=(other.numerator*numerator);
		sothe.denominator=(other.denominator*denominator);
		System.out.println(sothe.numerator + "/" + sothe.denominator);
        // TODO: Phương thức nhân hai phân số (this và other), trả đối tượng Fraction mới
        return sothe;
    }

    public Fraction divide(Fraction other) {
		Fraction sothe= new Fraction(0,0);
			sothe.numerator=(other.numerator*denominator);
			sothe.denominator=(other.denominator*numerator);
		 System.out.println(sothe.numerator + "/" + sothe.denominator);
        // TODO: Phương thức chia hai phân số (this và other), trả ve đối tượng Fraction mới
        return sothe;
    }
 
 public boolean equals(Object obj)
 {
	 Fraction a = (Fraction) obj;
    return (numerator*a.denominator == a.numerator*denominator);
 }

	public static void main(String ard[])
	{
		Fraction c = new Fraction(10,3);
		Fraction d = new Fraction(5,3);
		Fraction f= new Fraction(1,1);
		f=c.multiply(d);
		if(d.equals(c)) System.out.println("true");
		else System.out.println("false");
		//System.out.println(f.denominator);	
		//System.out.println(gcd(-15,9));
		//System.out.println(fibonacci(0));
	}
	}
