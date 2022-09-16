import java.util.Scanner;
public class Two{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
        int length,breadth;
		length = sc.nextInt();
		breadth=sc.nectInt();
        int area=length*breadth;
        int peri=2*(length+breadth);
        System.out.println("Area of the rectangle ="+area);
        System.out.println("Perimeter of the rectangle ="+peri);
    }
}'