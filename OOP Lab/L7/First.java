import java.util.Scanner;

class Student_detail{
	int id;
	String name;
	String college_name;
	
	Student_detail(int i, String n){
		this.id = i;
		this.name = n;
		this.college_name = "MIT";
	}
};

class First{
	public static void main(String args[]){
		Student_detail s[] = new Student_detail[10];
		int id;
		String n;
		Scanner scan = new Scanner(System.in);
		
		for (int i=0;i<2;i++){
			id = scan.nextInt();
			n = scan.next();
			s[i]= new Student_detail(id, n);
		}
		for (int i=0;i<2;i++){
			System.out.println(s[i].id + " " + s[i].name + " " + s[i].college_name + "\n");
		}
	}
}
