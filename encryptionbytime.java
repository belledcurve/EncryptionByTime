package AD;

import java.util.Scanner;
import java.util.ArrayList;


public class encryptionbytime {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
Scanner io = new Scanner (System.in);
		
		System.out.println ("");
		
		System.out.print("text to encrypt: ");
		String a = io. next ();
		
		System.out.println ("e.g.) 12:34 is 1234");
		System.out.print("time of encryption: ");
		int b = io. nextInt ();
		
		String time = Integer.toString (b);
		int timei = Integer.parseInt (time.substring (0,1));
		int timeii = Integer.parseInt(time.substring (1,2));
		int timeiii = Integer.parseInt(time.substring (2,3));
		int timeiv = Integer.parseInt(time.substring (3,4));
	//	System.out.println (timei);
	//	System.out.println (timeii);
	//	System.out.println (timeiii);
	//	System.out.println (timeiv);
		
		
	char[] enctext = new char[a.length()];
	ArrayList<Integer> fir = new ArrayList<Integer>();
	
	for (int i = 0; i < a.length(); i++)
{
		enctext[i] = (a.charAt(i));
		int first = 0;
		
		if ( enctext[i] == 'A' || enctext[i] == 'a')
			{first = 1; }
		else if ( enctext[i] == 'B' || enctext [i] == 'b')
			{first = 2; }
		else if ( enctext[i] == 'C' || enctext [i] == 'c')
			{first = 3; }
		else if ( enctext[i] == 'D' || enctext [i] == 'd')
			{first = 4; }
		else if ( enctext[i] == 'E' || enctext [i] == 'e')
			{first = 5; }
		else if ( enctext[i] == 'F' || enctext [i] == 'f')
			{first = 6; }
		else if ( enctext[i] == 'G' || enctext [i] == 'g')
			{first = 7; }
		else if ( enctext[i] == 'H' || enctext [i] == 'h')
			{first = 8; }
		else if ( enctext[i] == 'I' || enctext [i] == 'i')
			{first = 9; }
		else if ( enctext[i] == 'J' || enctext [i] == 'j')
			{first = 10; }
		else if ( enctext[i] == 'K' || enctext [i] == 'k')
			{first = 11; }
		else if ( enctext[i] == 'L' || enctext [i] == 'l')
			{first = 12; }
		else if ( enctext[i] == 'M' || enctext [i] == 'm')
			{first = 13; }
		else if ( enctext[i] == 'N' || enctext [i] == 'n')
			{first = 14; }
		else if ( enctext[i] == 'O' || enctext [i] == 'o')
			{first = 15; }
		else if ( enctext[i] == 'P' || enctext [i] == 'p')
			{first = 16; }
		else if ( enctext[i] == 'Q' || enctext [i] == 'q')
			{first = 17; }
		else if ( enctext[i] == 'R' || enctext [i] == 'r')
			{first = 18; }
		else if ( enctext[i] == 'S' || enctext [i] == 's')
			{first = 19; }
		else if ( enctext[i] == 'T' || enctext [i] == 't')
			{first = 20; }
		else if ( enctext[i] == 'U' || enctext [i] == 'u')
			{first = 21; }
		else if ( enctext[i] == 'V' || enctext [i] == 'v')
			{first = 22; }
		else if ( enctext[i] == 'W' || enctext [i] == 'w')
			{first = 23; }
		else if ( enctext[i] == 'X' || enctext [i] == 'x')
			{first = 24; }
		else if ( enctext[i] == 'Y' || enctext [i] == 'y')
			{first = 25; }
		else if ( enctext[i] == 'Z' || enctext [i] == 'z')
			{first = 26; }
	// assign whitespace to 100.
	//	else if ( enctext[i] == ' ')
	//		{first = 100;}

	fir.add(first);
}
	//for (int l : fir)
	{
	//System.out.print (l + " ");
	}
	
	System.out.println ();
	
	ArrayList<Integer> tex = new ArrayList<Integer>();
	int k=0;
	while ( k < a.length())
	{
		if ((k+1) % 4 == 1)
		{tex.add(fir.get(k) + timei);}
		else if ((k+1) % 4 == 2)
		{tex.add(fir.get(k) + timeii);}
		else if ((k+1) % 4 == 3)
		{tex.add(fir.get(k) + timeiii);}
		else if ((k+1) % 4 == 0)
		{tex.add(fir.get(k) + timeiv);}	
		k++;
	}
	
	//for (int j : tex)
	//	System.out.print (j + " ");		
	
	
	
	
	
	System.out.print("encrypting text " + "'" + a + "'" + "......");
	
	

		
		// hint for encryption method
		System.out.println ();
		System.out.println ();
		System.out.println ();
		int randomness = (int) ((Math.random ())*100);
		if (0 <= randomness && randomness < 20) System.out.println ("what is the time, that is the question - Hamlet");
		else if ( 20 <= randomness && randomness < 40) System.out.println ("...whether our text are made of, yesterday's and today's are different - Wuthering Heights");
		else if ( 40 <= randomness && randomness < 60) System.out.println ("...It matters not what the text is, but what time it is - Harry Potter");
		else if ( 60 <= randomness && randomness < 80) System.out.println ("...Made weak by time and fate, but strong in will to strive, to seek, to find, and not to yield - Ulysses");
		else if ( 80 <= randomness && randomness < 100) System.out.println ("...I hope she'll know the time -- that's the best thing a girl can do in this world, a beautiful timekeepr - The Great Gatsby");
		System.out.println ();
		System.out.println ();
		System.out.println ();
		
			
		char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		System.out.print("encryption: ");
		
		for (int j: tex)
		{
			if (j > 26)
			System.out.print (alphabet[j-1-26]);
			else if (j <= 26)
			System.out.print (alphabet[j-1]);	
			else if (j == 100)
			System.out.print("-");
		}
			
		
			
		
		}
	}


