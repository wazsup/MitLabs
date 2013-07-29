package lab1;

public class StringCharacters
{
    public static void main(String[] args)
    {

        String text = "To be or not to be, that is the question;"
                +"Whether `tis nobler in the mind to suffer"
                +" the slings and arrows of outrageous fortune,"
                +" or to take arms against a sea of troubles,"
                +" and by opposing end them?";

        int spaces = 0,
            vowels = 0,
            letters = 0;


        //Your code here

        for (char c : text.toCharArray()){
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels++;
                    break;
                case ' ':
                    spaces++;
                    break;
                default:
                    letters++;
            }
        }

        System.out.println("The text contained vowels:    " + vowels + "\n" +
                "consonants " + (letters - vowels) + "\n"+
                "spaces:    " + spaces);
    }
}