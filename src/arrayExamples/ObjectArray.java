package arrayExamples;

class Student{
	String name;
	int roll_no;
	int marks;
	
	Student(){
		name=null;
		roll_no=0;
		marks=0;
				
	}
	Student(String name, int roll_no, int marks){
		this.name  = name;
		this.roll_no = roll_no;
		this.marks = marks;
	}
}

public class ObjectArray {

	public static void main(String[] args) {
		
		Student s1 = new Student("farhan",101,401);
		Student s2 = new Student("mirza", 101, 455);
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		Student studentData[] = {s1 ,s2 , s3 , s4 , s5};
		for(int i=0; i<5;i++)
		System.out.println(studentData[i].name+" "+ studentData[i].roll_no+" "+ studentData[i].marks);		
		
	}

}
