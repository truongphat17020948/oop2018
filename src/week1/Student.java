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
		
    Student() {
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
    Student(String n , String sid , String em) {
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
    Student(Student s) {
		name = s.getname();
		id = s.getid();
		email= s.getemail();
		group=s.getgroup();
        // TODO:
    }

    String getInfo() {
		System.out.println(name+id+email+group);
        // TODO:
        return null; // xóa dòng này sau khi cài đặt
    }
}
