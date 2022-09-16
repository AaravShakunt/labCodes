import java.util.Scanner;

class Box{
	double w,h,d,v;
	Box(double wid, double height, double depth){
		w=wid;
		h=height;
		d=depth;
	}
	double volume(){
			v=w*h*d;
			return v;
	}
}

public class First{
	public static void main(String args[]){
		Scanner scan= new Scanner(System.in);
		Box b1=new Box(10, 2, 6);
		double v = b1.volume();
		System.out.println(v);
	}
}