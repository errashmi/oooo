package java_Prog;

public class Palindrome {
  public void palin() {
	  String str;
	  str="Rashmi";
	  String reverse=null;
	for(int i=str.length()-1;i>0;i--)
		  reverse=reverse+str.charAt(i);
	if(str.equals(reverse))
		System.out.println("Given string is palindromic");
	else
		System.out.println("Given string is not palindromic");
  }
}
