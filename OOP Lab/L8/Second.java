import java.util.Scanner;

abstract class area{
	Scanner sc = new Scanner(System.in);
	double area;
	abstract void calc();
	void display(){
		System.out.println(area);
	}
}

class rectangle extends area{
	int l,b;
	
	rectangle(){
		l = sc.nextInt();
		b = sc.nextInt();
	}
	
	void calc(){
		area = l*b;
	}
};

class circle extends area{
	int r;
	
	circle(){
		r = sc.nextInt();
	}
	
	void calc(){
		area = 3.14*r*r;
	}
};
class Second{
	public static void main(String args[]){
		rectangle r = new rectangle();
		r.calc();
		r.display();
		circle c = new circle();
		c.calc();
		c.display();
	}
}
