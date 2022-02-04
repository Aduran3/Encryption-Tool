// Encryption tool

import java.util.Scanner;

class EncryptionTool {
    public static String Encrypting(String sentence) {
        String Change = sentence.replaceAll("[02468]", "*"); // Feel free to change the characters to anything
        Change = Change.replaceAll("[Aa]", "@");
        Change = Change.replaceAll("[WwEeRr]", "#");
        Change = Change.replaceAll("[BbHh]", "-");
        return Change;
    }

    public static int CharacterCount(String sentence) {
        int temp = 0;
        for (int i = 0; i < sentence.length(); i++){
            char c = Character.toUpperCase(sentence.charAt(i));
            if(c =='A' || c =='W' || c =='B' || c =='E' || c =='R' || c =='H')
                temp++;
            if(Character.isDigit(c)){
                int k = c;
                if(k%2 == 0)
                    temp++;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner typed = new Scanner(System.in);
        System.out.println("Enter Message: ");
        String sentence = typed.nextLine();
        System.out.println("Encrypted Message: " + Encrypting(sentence));
        System.out.println("Total Encrypted Character(s): " + CharacterCount(sentence));
    }
    }