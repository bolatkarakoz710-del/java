import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String vowels = "aeiouAEIOUаәеёиоуыіүұө";
        int vowel = 0, consonant = 0;

        for(char ch : input.toCharArray()) {
            if(Character.isLetter(ch)) {
                if(vowels.indexOf(ch) != -1) vowel++;
                else consonant++;
            }
        }

        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonants: " + consonant);
    }
}
