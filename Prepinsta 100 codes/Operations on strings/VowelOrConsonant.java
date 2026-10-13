import java.util.*;

public class VowelOrConsonant{

public static void main (String args[] ){

Scanner sc=new Scanner(System.in);
System.out.println("Enter a character");
char A=sc.next().charAt(0);

if(isVowel(A)){
System.out.println("Given Character: " + A+ " is vowel");
}else{
System.out.println("Given Character: " + A+ " is not vowel");
}
}

//method to check if vowel or not

public static boolean isVowel(char A){
return(A=='a'|| A=='e' ||A=='i' ||A=='o' ||A=='u' );
}






}