import java.util.Arrays;
import java.util.Scanner;
public class CaesarCipher
{
private static int key;
private static char[] b;
private static String a;
private static String u;
private static StringBuilder l;
private static String h;
private static StringBuilder f;
private static char[] w;
private static String[] z;
private static String s;
private static boolean upperCase;
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Give text:"); //Text to cipher
String plainText = sc.next();
System.out.println("Give key:"); //Key to cipher the text
int key = sc.nextInt();
crypt(plainText, key); //Method call
}


private static void crypt(String plainText, int key2)
{
	char[] chars = plainText.toCharArray(); //Initializing a char array
	l = new StringBuilder(); //Initializing StringBuilder l
	f= new StringBuilder(); //Initializing StringBuilder f
	char dc;
		for(int i = 0; i<plainText.length(); i++)
			{
				dc = plainText.charAt(i); //Taking the charAt(i)
				upperCase = checking(dc); //Method call (Return true if it is uppercase, otherwise false)
			}
	if (upperCase && key2 >=0) //if the letter is uppercase and the key2 is >= 0
		{	
			for (char aChar : chars)
			{
					int c = (((int) (aChar-65)));  //Referring to the ASCII table (Google)
					u = deCrypt(c, key2); //Method call (Return the new char value)
					l.append(u); //Appending our StringBuilder
			}
			System.out.println("Ciphered text:" + l); //Informing the ciphered text
			String d = l.toString();
			krypt(d, key2); //Method to decipher the text (Prints in the method the text as deciphered)
		}
	
	else System.exit(0);
}


private static boolean checking(char letter) //Checking if the letter is uppercase
{
	if(Character.isUpperCase(letter))
		{
		return true;
		}
	else return false;
}


private static void krypt(String d, int key2) //Decrypting the ciphered text
{
	char[] ab = d.toCharArray();
	StringBuilder j = new StringBuilder();
	for (char bChar : ab)
	{
		int v = (((int) (bChar-65)));
		s = deCrypt2(v, key2); //Method call for transforming the cipheredletter into deciphered letter
		j.append(s);
	}
	System.out.println("DeCiphered text:" + j);
}


private static String deCrypt2(int v, int key2) //Method for transforming the ciphered letter into deciphered letter
{
	int d = ((v-key2)%26+26)%26;
	String j = String.valueOf((char)(d+65));
	return j;
}


private static String deCrypt(int i, int t) //Method for deciphering
{
	int f = (i + t) % 26;
	String w = String.valueOf((char)(f+65));
	return w;
}

}