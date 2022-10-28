import java.util.Scanner;

class counter{
	static int ctr;
	
	counter(){
		ctr++;
	}
};

class Second{
	public static void main(String args[]){
		counter c[] = new counter[10];
		for (int i=0;i<10;i++)
			c[i] = new counter();
		System.out.println(c[0].ctr);
	}
}
