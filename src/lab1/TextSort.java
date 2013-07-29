package lab1;


public class TextSort {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                +" Whether `tis nobler in the mind to suffer"
                +" the slings and arrows of outrageous fortune,"
                +" or to take arms against a sea of troubles,"
                +" and by opposing end them?";

        int spaces = 0;
        int i = 0;
        for (char c : text.toCharArray()) {
            i++;
            if (c == ' '){
                spaces++;
            }
        }

        String[] words = new String[spaces + 1];
        words[0] = "";
        i = 0;
        int wordCount = 0;
        for (char c : text.toCharArray()){
            i++;
            if (c == ' ') {
                i = 0;
                wordCount++;
                words[wordCount] = "";
                continue;
            } else {
                switch (c) {
                    case ',':
                    case ';':
                    case '?':
                    case '.': break;
                    default: words[wordCount] += c;
                }
            }
        }


        for (i = 0; i < words.length; i++){
            for (int j = i+1; j < words.length; j++){
                if (( (int) Character.toLowerCase(words[i].charAt(0))) > ((int) Character.toLowerCase(words[j].charAt(0)))) {
                    String a = words[i];
                    words[i] = words[j];
                    words[j] = a;
                }
            }
        }



        for (String s : words) {
            System.out.println(s);
        }
    }
}
