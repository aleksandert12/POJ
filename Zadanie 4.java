// ************************************************ *******************
//
// Aleksander Tyñski 
// Klaudia Klebba
// Zadanie 4 szyfr cezara 
// ************************************************ *******************
import java.util.Scanner;

package cezar;

public class cezar {

    static String cezar (String value, int change) {
        char [] buffer = value.toCharArray ();


        for (int i = 0; i <buffer.length; i ++) {

            char letter = buffer [i];
            letter = (char) (letter + change);
            if (letter> 'z') {
                letter = (char) (letter - 26);
            } else if (letter <'a') {
                letter = (char) (letter + 26);
            }
            buffer [i] = letter;
        }
        return new String (buffer);
    }

    public static void main (String [] args) {
      
      	System.out.println ("Aleksander”);
      	System.out.println ("Tynski”);
		String a = cezar ("Aleksander”, 4);
        String b = cezar ("Tynski”, 4);
      	System.out.println (a);
		System.out.println (b);
      	System.out.println ("Klaudia”);
      	System.out.println ("Klebba”);
		String d = cezar ("Klaudia”, 4);
        String e = cezar ("Klebba”, 4);
      	System.out.println (d);
        System.out.println (e);
    }
}
