import java.util.Scanner;

interface inter{
	void display();
}

class hardware implements inter{
	static int hsale = 0;
	hardware(){
		hsale++;
	}
	public void display(){
		System.out.println(hsale);
	}
};


class software implements inter{
	static int ssale = 0;
	software(){
		ssale++;
	}
	public void display(){
		System.out.println(hsale);
	}
};

class counter{
	static int ctr;
	
	counter(){
		ctr++;
	}
};

class First{
	public static void main(String args[]){
		inter h = new hardware();
		inter s = new software();
		s.display();
	}
}
