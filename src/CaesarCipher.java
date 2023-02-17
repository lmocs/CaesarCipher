import java.util.Scanner;
class CaesarCipher {
    protected char[] encrypt(String word, int shift) {
        char[] wordArr = word.toCharArray();
        int adjust;
        for (int i = 0; i < wordArr.length; i++) {
            if (wordArr[i] == ' ')
                continue;
            adjust = (int) wordArr[i] + shift;
            wordArr[i] = (char) adjust;
        }
        return wordArr;
    }

    public static void main(String[] args) {
        CaesarCipher encryptedWord = new CaesarCipher();
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a word or sentence: ");
        String word = scnr.nextLine();

        System.out.println("Enter the shift value: ");
        int shift = scnr.nextInt();

        System.out.println("Encrypting...");
        System.out.println(encryptedWord.encrypt(word, shift));
    }
}