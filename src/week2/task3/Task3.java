
class hinhhop {
    int chieudai;
	int chieurong;
	int chieucao;
	// khai bao thong tin  hinh hop
  public void SetChieudai(int chieudai)
  {
	  this.chieudai=chieudai;
  }
  public int GetChieudai()
  {
	  return chieudai;
  }
  public void SetChieurong(int chieurong)
  {
	  this.chieurong=chieurong;
  }
  public int GetChieurong()
  {
	  return chieurong;
  }
  public void SetChieucao(int chieucao)
  {
	  this.chieucao=chieucao;
  }
  public int GetChieucao()
  {
	  return chieucao;
  }
  
  public int chuvi1mat()
  {
	  int s = (chieudai+chieurong)*2;
	  return s;
  }
  //tinh chu vi
  public int dientich1mat()
  {
	  return chieudai*chieurong;
  }
  //tinh dien tich
  public int thetich()
  {
	  return chieudai*chieurong*chieucao;
  }
  //tinh the tich

public static void main(String ard[])
{
   hinhhop a = new hinhhop();
	a.SetChieudai(4);
	a.SetChieucao(5);
	a.SetChieurong(1);
	System.out.println(a.thetich());
}}
// lop xet BMI
class BMI{
	int cannang;
	int cao;
	int nhietdo;
	//khai bao chiso nguoi
  public void SetCannang(int cannang)
  {
	  this.cannang=cannang;
  }
  public int GetCanang() 
  {
	  return cannang;
  }
  public void SetCao(int cao)
  {
	  this.cao=cao;
  }
  public int GetCao() 
  {
	  return cao;
  }
   public void SetNhietdo(int nhietdo)
  {
	  this.nhietdo=nhietdo;
  }
  public int GetNhietdo() 
  {
	  return nhietdo;
  }
  public void danhgiacan()
  {
	  if(cannang<50) { System.out.println(" gay ");}
	  else if(cannang>70) {System.out.println(" beo ");}
	  else {System.out.println(" binh thuong ");}
  }
  // danh gia can nang
  public void danhgiacao()
  {
	  if(cao<140){System.out.println(" thap ");}
	  else if(cao>190){System.out.println(" cao qua ");}
	  else {System.out.println(" binh thong ");}
  }
  //danh gia chieu cao
   public void xetnhietdo()
   {
	  if(nhietdo>37.5&&nhietdo<38){System.out.println(" sot nhe ");}
	  else if(nhietdo>38&&nhietdo<40){System.out.println(" sot cao");}
	  else {System.out.println(" nen nhap vien ");} 
   }
   //danh gia nhiet do
   public static void main (String a[])
   {
	   BMI b = new BMI();
	   b.SetNhietdo(10);
	   b.xetnhietdo();
   }  
}

class thoitiet
{
	int nhietdo;
	int doam;
	String sucgio;
	  public void SetDoam(int doam)
  {
	  this.doam=doam;
  }
  public int GetDoam() 
  {
	  return doam;
  }
  public void SetSucgio(String sucgio)
  {
	  this.sucgio=sucgio;
  }
  public String GetSucgio() 
  {
	  return sucgio;
  }
   public void SetNhietdo(int nhietdo)
  {
	  this.nhietdo=nhietdo;
  }
  public int GetNhietdo() 
  {
	  return nhietdo;
  }
  public void xemnhietdo()
  {
	  if(nhietdo>27) {System.out.println(" troi nong ");}
	  else if(nhietdo<17) {System.out.println(" troi lanh");}
	  else {System.out.println(" troi dep");}
  }
  // am giac nhietdo
  public void xemdoam()
  {
	  if(doam>50&&doam<80) {System.out.println(" tot ");}
	  else {System.out.println(" khong tot ");}
  }
  // xet do am
  public void xembao ()
  {
	  if(doam>80&&sucgio=="rat manh") {System.out.println(" bao ");}
	  else{System.out.println(" khong co bao ");}
  }
  // tinh bao
  public static void main(String [] abc)
  {
	  thoitiet a = new thoitiet();
	  a.SetDoam(90);
	  a.SetSucgio("rat manh");
	  a.xembao();
  }
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
