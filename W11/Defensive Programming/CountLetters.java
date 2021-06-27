package W11;

import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        //get word from user
        System.out.print("Enter a single word only please : ");
        String word = scan.nextLine();

        //convert word to uppercase
        word = word.toUpperCase();

        //count frequency of each letter in string
        for(int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException ie) {
                System.out.println(word.charAt(i) + " is not a letter");
            }
        }

        //print frequency
        for(int i = 0; i < counts.length; i++) {
            if(counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]) ;
            }
        }
	}
}
