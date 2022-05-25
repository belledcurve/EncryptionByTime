
import java.util.Scanner;
import java.util.ArrayList;


public class EBT {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner io = new Scanner (System.in);

        System.out.println ("");
        System.out.println ("cf.) whitespace notation is available");
        System.out.println ("cf.) usable ASCII codes are: !, ?, ~, =, <, >, @, ,(comma), .(period).  ");

        System.out.print("text to encrypt: ");
        String a = io. nextLine ();

        System.out.println ("e.g.) 5:34 pm is 1734");
        System.out.print ("time of encryption: ");
        int b = io. nextInt ();

        String time = Integer.toString (b);

        int timei = 0;
        int timeii = 0;
        int timeiii = 0;
        int timeiv = 0;

        if (b >= 1000)
        {
            timei = Integer.parseInt(time.substring (0,1));
            timeii = Integer.parseInt(time.substring (1,2));
            timeiii = Integer.parseInt(time.substring (2,3));
            timeiv = Integer.parseInt(time.substring (3,4));
        }
        else if (b < 10)
        {
            timei = 0;
            timeii = 0;
            timeiii = 0;
            timeiv = b;
        }
        else if (b < 100)
        {
            timei = 0;
            timeii = 0;
            timeiii = Integer.parseInt(time.substring (0,1));
            timeiv = Integer.parseInt(time.substring (1,2));
        }
        else if (b <1000)
        {
            timei = 0;
            timeii = Integer.parseInt(time.substring (0,1));
            timeiii = Integer.parseInt(time.substring (1,2));
            timeiv = Integer.parseInt(time.substring (2,3));
        }



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
            // special characters
            else if (enctext[i] == ' ' )
            {first = 100; }
            else if (enctext[i] == '!')
            {first = 110; }
            else if (enctext[i] == '?')
            {first = 120; }
            else if (enctext[i] == '~')
            {first = 130; }
            else if (enctext[i] == '=')
            {first = 140; }
            else if (enctext[i] == '<')
            {first = 150; }
            else if (enctext[i] == '>')
            {first = 160; }
            else if (enctext[i] == '@')
            {first = 170; }
            else if (enctext[i] == ',')
            {first = 180; }
            else if (enctext[i] == '.')
            {first = 190; }


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




        // quotes on time
        System.out.println ();
        int quotesontime = (int) ((Math.random ())*100);
        if (0 <= quotesontime && quotesontime < 10) System.out.println ("... what is the time, that is the question - Hamlet ...");
        else if ( 10 <= quotesontime && quotesontime < 20) System.out.println ("... with whether our text are made of, yesterday's and today's are different - Wuthering Heights ...");
        else if ( 20 <= quotesontime && quotesontime < 30) System.out.println ("... It matters not what the text is, but what time it is - Harry Potter ...");
        else if ( 30 <= quotesontime && quotesontime < 40) System.out.println ("... Made weak by time and fate, but strong in will to strive, to seek, to find, and not to yield - Ulysses ...");
        else if ( 40 <= quotesontime && quotesontime < 50) System.out.println ("... I hope she'll know the time - that's the best thing a girl can do in this world, a beautiful timekeeper - The Great Gatsby ...");
        else if ( 50 <= quotesontime && quotesontime < 60) System.out.println ("... Who controls the past, controls the future: who controls the present controls the past - George Orwell ...");
        else if ( 60 <= quotesontime && quotesontime < 70) System.out.println ("... it has been said, 'time heals all wounds.' I do not agree. The wounds remain. In time, the mind, protecting its sanity, covers them with scar tissue and the pain lessens. But it is never gone ...");
        else if ( 70 <= quotesontime && quotesontime < 80) System.out.println ("... time you enjoy wasting is not wasted time - Phrynette Married ...");
        else if ( 70 <= quotesontime && quotesontime < 80) System.out.println ("... It is the time you have wasted for your rose that makes your rose so important - The Little Prince ...");
        else if ( 80 <= quotesontime && quotesontime < 90) System.out.println ("... how did it get so late so soon? ...");
        else if ( 90 <= quotesontime && quotesontime < 100) System.out.println ("... time is free, but it's priceless. You can't own it, but you can use it. You can't keep it, but you can spend it. Once you've lost it you can never get it back...");
        System.out.println ();


        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        System.out.print("encryption: ");

        for (int j: tex)
        {
            if (j > 26 && j <50)
                System.out.print (alphabet[j-1-26]);
            else if (j <= 26)
                System.out.print (alphabet[j-1]);
                // special characters
            else if (j >= 100 && j < 110)
                System.out.print(' ');
            else if (j >= 110 && j < 120)
                System.out.print('!');
            else if (j >= 120 && j < 130)
                System.out.print('?');
            else if (j >= 130 && j < 140)
                System.out.print('~');
            else if (j >= 140 && j < 150)
                System.out.print('=');
            else if (j >= 150 && j < 160)
                System.out.print('<');
            else if (j >= 160 && j < 170)
                System.out.print('>');
            else if (j >= 170 && j < 180)
                System.out.print('@');
            else if (j >= 180 && j < 190)
                System.out.print(',');
            else if (j >= 190 && j < 200)
                System.out.print('.');

        }

        System.out.println();
        if (b <= 1200)
        {
            System.out.print ("encrypted at: " );
            System.out.print(timei); System.out.print(timeii); System.out.print(":"); System.out.print (timeiii); System.out.print(timeiv); System.out.print(" A.M");
        }
        else if (b >= 1200 && b < 1300)
        {
            System.out.print ("encrypted at: " );
            System.out.print(timei); System.out.print(timeii); System.out.print(":"); System.out.print (timeiii); System.out.print(timeiv); System.out.print(" P.M");
        }
        else if (b >= 1300 && b < 2200)
        {
            String tima = Integer.toString (b-1200);
            int timev = 0;
            int timevi = Integer.parseInt(tima.substring (0,1));
            int timevii = Integer.parseInt(tima.substring (1,2));
            int timeix = Integer.parseInt(tima.substring (2,3));
            System.out.print ("encrypted at: " );
            System.out.print(timev); System.out.print(timevi); System.out.print(":"); System.out.print (timevii); System.out.print(timeix); System.out.print(" P.M");
        }
        else if (b >= 2200)
        {
            String tima = Integer.toString (b-1200);
            int timev = Integer.parseInt(tima.substring (0,1));
            int timevi = Integer.parseInt(tima.substring (1,2));
            int timevii = Integer.parseInt(tima.substring (2,3));
            int timeix = Integer.parseInt(tima.substring (3,4));
            System.out.print ("encrypted at: " );
            System.out.print(timev); System.out.print(timevi); System.out.print(":"); System.out.print (timevii); System.out.print(timeix); System.out.print(" P.M");
        }


        System.out.println ();
        System.out.println ();

        System.out.println ("========================  Access Denied  ========================");
    }
}
