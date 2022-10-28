import java.util.Scanner;

interface area{
	Scanner sc = new Scanner(System.in);
	void calc();
	void display();
}

class rectangle implements area{
	double area;
	int l,b;
	
	rectangle(){
		l = sc.nextInt();
		b = sc.nextInt();
	}
	
	public void calc(){
		area = l*b;
	}
	public void display(){
		System.out.println(area);
	}
};

class circle implements area{
	double area;
	int r;
	
	circle(){
		r = sc.nextInt();
	}
	
	public void calc(){
		area = 3.14*r*r;
	}
	public void display(){
		System.out.println(area);
	}
};
class Third{
	public static void main(String args[]){
		rectangle r = new rectangle();
		r.calc();
		r.display();
		circle c = new circle();
		c.calc();
		c.display();
	}
}
