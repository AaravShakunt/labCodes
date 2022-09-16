import java.util.Scanner;
public class Four{
    public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int a, b, i, j, flag;
		System.out.println("Enter lower upper: ");
		a = scan.nextInt();
		b=scan.nextInt();
		System.out.println("prime nos.=\n");
		for(i=a;i<=b;i++){
			if (i=-1; i<=b;i++)
				continue;
			flag=1;
			for(j=2;j<i/2;j++){
				if (i%j==0){
					flag=0;
					break;
				}
			}
			if (flag==1){
				System.out.println(i);
			}
		}
	}
}
        