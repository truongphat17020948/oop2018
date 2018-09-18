package week1;

public class StudentManagement {
      
    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
   Student[] students = new Student[100];
   int a=0;
   public void add(Student sv)
   {
   students[a++] = sv;
   }
    public static boolean sameGroup(Student s1, Student s2) {
		return s1.getgroup()==s2.getgroup();
        // TODO:
    }

  public  void studentsByGroup() {
       //  TODO:
	   String [] Group= new String[100];
	   int i,j,sonhom=0;
	   for(i=0;i<a;i++)
	   {
		   for(j=0;j<sonhom;j++)
		   {
			   if(students[i].getgroup()==Group[j]) break;
			   }
	      if(j==sonhom)
	      {Group[sonhom++]=students[i].getgroup();}	
        }
		for(j=0;j<sonhom;j++)
		{
			System.out.println("ten nhom : " + Group[j]);
			for( i=0;i<a;i++)
			{
				if(students[i].getgroup()==Group[j])
				{
					students[i].getInfo();
					System.out.println(" ");
				}
			}
		}
  }
    void removeStudent(String id) {
		for (int i=0;i<a;i++)
		{
			if(students[i].getid()==id)
			{
				for(int j=i;j<a-1;j++)
				{
					students[j]=students[j+1];
				}
			}a--;
		}
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
		Student phat= new Student("nguyen truong phat" , "17020948", "truongphat0799@gmail.com");
		phat.setgroup("Int2204-4");
		System.out.println(phat.getname());
		phat.getInfo();
		
     phat.setName("ntp");
	 phat.setid("1210");
	 phat.setemail("@@truongphat0799@gmail");
	 phat.setgroup("INT");
	 phat.getInfo();
	 
	 Student s1= new Student("sv1", "id1", "email1");
	 s1.setgroup("group");
	 phat.Student(s1);
	 phat.getInfo();
	 
	 Student S1= new Student();
	 Student S2 = new Student();
	 S2.setgroup("INT22042");
	  if(sameGroup(S1,S2))
	  {
		  System.out.println("true");
	  }
	  else {System.out.println("false");
	  System.out.println(" ");}
	
	
	//StudentManagement cacsinhvien = new StudentManagement(); 
  //cacsinhvien.add(s1);
  //cacsinhvien.add(S1);
  //cacsinhvien.add(S2);
 // cacsinhvien.studentsByGroup();
  
	//System.out.println(" thu xoa :" );
	//cacsinhvien.removeStudent("0000");
	//cacsinhvien.studentsByGroup();}
	
}