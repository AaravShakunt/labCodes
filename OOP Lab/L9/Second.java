import java.util.Scanner;

public class Second{
	public static void main(String args[]){
		String s = "hello", ns="";
		int l = s.length();
		char c=' ';
		int flag = 0;
		for (int i=0; i<l;i++){
			c=s.charAt(i);
			if (s.lastIndexOf(c)!=i){
				flag=1;
				break;
			}
		}
		if (flag==1){
			for (int i=0; i<l;i++){
				ns = ns+(c);
			}
		}
		System.out.println(ns);
		
	}
}
