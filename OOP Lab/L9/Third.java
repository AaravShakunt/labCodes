import java.util.Scanner;
import java.util.Arrays;


public class Third{
	static boolean palindrome(String s, int l){
		String fh, lh;
		fh=lh="";
		for (int i=l-1;i>l/2;i--){
			lh = lh +s.charAt(i);
		}
		for (int i=0;i<l/2;i++){
			fh = fh +s.charAt(i);
		}
		if (fh.equals(lh))
			return true;
		return false;
	}
	
	static String reverse(String s, int l){
		String fh, lh;
		fh=lh="";
		for (int i=l-1;i>=0;i--){
			lh = lh +s.charAt(i);
		}
		return lh;
	}
	
	
	
	static String sort(String s, int l){
		String fh, lh;
		char[] ch;
		fh=lh="";
		ch = s.toCharArray();
		Arrays.sort(ch);
		String a = new String(ch);
		return a;
		
	}
	
	static String addRev(String s, int l){
		String fh, lh, rs;
		fh=lh="";
		rs = reverse(s,l);
		s=s.concat(rs);
		return s;
	}

	public static void main(String args[]){
		String s = "aarav", ns="";
		int l = s.length();
		char c=' ';
		int flag = 0;
		System.out.println(palindrome(s, l));
		System.out.println(reverse(s,l));
		System.out.println(sort(s,l));
		System.out.println(addRev(s,l));

	}
}
