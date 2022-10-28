import java.util.Scanner;

public class First{
	public static void main(String args[]){
		int numChar=0, numWord=0, numLine=0, numVow=0, l;
		String s, t;
		s="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string(2 times escape makes it submit):/n");
		while(true){
			t = sc.nextLine();
			if (t.length()==0)
				break;
		

			s = s.concat("\n");
			s = s.concat(t);
			
		}
		l = s.length();
		for (int i=0;i<s.length();i++){
			char c = s.charAt(i);
			switch(c){
				case (' '):
					numWord+=1;
					break;
				case ('\n'):
					numLine+=1;
					break;
				case ('a'):
				case ('e'):
				case ('i'):
				case ('o'):
				case ('u'): numVow+=1;
				default:
				numChar+=1;
			}
		}
		System.out.println("\nCharacters: "+numChar+"\nWords: "+numWord+"\nLines: "+numLine+"\nVowels: "+numVow);
	}
}
