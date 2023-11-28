

public class Main {
    public static void main(String[] args) {

        System.out.println("Reverse: "+reverse("REVERSE"));
        System.out.println("concatenateStrings: "+concatenateStrings(new String[]{
                "Gulumkan", "Uson", "kyzy"}));
        System.out.println("Palindrame: " +palindrome("Gulumkan"));
        System.out.println("capitalizeWords: "+capitalizeWords("Gulumkan uson kyzy"));
        System.out.println("countWords: "+countWords("Gulumkan Uson kyzy"));
        System.out.println("removeWhitespace: "+removeWhitespace("Gulumkan Uson kyzy"));
        System.out.println("countVowels: "+countVowels("Gulumkan"));
        System.out.println("encodeString: "+encodeString("Gulumkan"));
    }

    public static String reverse(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.toLowerCase());
        stringBuilder.reverse();
        string = stringBuilder.toString();
        stringBuilder.setCharAt(0, string.toUpperCase().charAt(0));
        return stringBuilder.toString();
    }

    public static String concatenateStrings(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strings) {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }
    public  static Boolean palindrome(String word){
        StringBuilder copy  =new StringBuilder( word);
        copy.reverse();
        return copy.toString().equals(word);
    }
     public  static  String capitalizeWords(String sentence) {
         StringBuilder stringBuilder = new StringBuilder();
             for (int i = 0; i < sentence.length(); i++) {
                 stringBuilder.append(sentence.charAt(i));
                 if (sentence.charAt(i) == ' ') {
                     stringBuilder.append(sentence.toUpperCase().charAt(++i ));
                 }
             }
         return stringBuilder.toString();
     }
     public static int countWords(String sentence){
        int count = 0;
         for (int i = 0; i < sentence.length(); i++) {
             if(sentence.charAt(i) == ' '){
                 count++;
             }
         }
        return count;
     }

     public  static int  countVowels(String word){
        int counter = 0;
         for (int i = 0; i < word.length(); i++) {
            if("AEIOUYaeiouy".contains( String.valueOf(word.charAt(i)))){
                counter++;
            }
         }
        return counter;
     }
     public  static String encodeString(String input){
        StringBuilder stringBuilder = new StringBuilder();
         for (int i = 0; i < input.length(); i++) {
             int ascii = input.charAt(i);
             stringBuilder.append(ascii);
         }
        return stringBuilder.toString();
     }
     public  static String removeWhitespace(String sentence){
         StringBuilder stringBuilder = new StringBuilder();
         for (int i = 0; i < sentence.length(); i++) {
             if (sentence.charAt(i) == ' ') {
                 stringBuilder.append(sentence.toUpperCase().charAt(++i ));
             }else stringBuilder.append(sentence.charAt(i));
         }
         return stringBuilder.toString();
     }
}