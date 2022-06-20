package constructor;

public class Student {

	String StudentName;
	int StudentId;
	double StudentPercentage;
	String StudentCourse;
	 
	 public Student(String studentName, int studentId, double studentPercentage, String studentCourse) {
		 
		this.StudentName = studentName;
		this.StudentId = studentId;
		this.StudentPercentage = studentPercentage;
		this.StudentCourse = studentCourse;
		
		
	}
	 public void StudentInfo()
	 {   System.out.println("===============================");
		 System.out.println("Name       : "+this.StudentName);
		 System.out.println("EmpId      : "+this.StudentId);
		 System.out.println("Percentage : "+this.StudentPercentage);
		 System.out.println("Course     : "+this.StudentCourse);
		 
	 }
	 

}
class StudentDetails
{    public static void main(String args[])
	{
	Student s1=new Student("Bhagya",22041,90,"java");
	s1.StudentInfo();
	Student s2=new Student("Pravalika",22042,98,"java");
	s2.StudentInfo();
	
	Student s3=new Student("Ranjith",22043,97,"java");
	s3.StudentInfo();
	
	Student s4=new Student("S..",22044,99,"java");
	s4.StudentInfo();
	
	
	}
	
}
