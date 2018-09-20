package week1;

public class Student {
 private String name, id, email, group;
	 
    // TODO: khai báo các thuộc tính cho Student

    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
	public void setName(String n){	name=n;}
	public String getname()    {return name;}
	
	public void setid(String n) {id = n;}
	public String  getid() { return id;}
	
	public void setemail(String m) {email = m;}
	public String getemail() {return email;}
	
	public void setgroup(String k){ group=k;}
	public String getgroup() {return group;}
		
    public Student() {
		name = "student";
		id= "0000";
		email= "uet@vnu.edu.vn";
		group = "INT22041";
        // TODO:
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    public Student(String n , String sid , String em) {
		name=n;
		id=sid;
		email=em;
		group="INT22041";
        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    public Student(Student s) {
		name = s.getname();
		id = s.getid();
		email= s.getemail();
		group=s.getgroup();
        // TODO:
    }

    public void getInfo() {
		System.out.println("Ten: "+name );
			
			System.out.println("Id: "+id );
			
			System.out.println("Lop: "+group );
			
			System.out.println("Email:" +email);
			System.out.println(" ");
        // TODO:
		
         // xóa dòng này sau khi cài đặt
    }
	
}
