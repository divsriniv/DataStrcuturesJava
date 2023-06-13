/* import java.util.Arrays;

public class ReverseString {

    //function that reverses a string
    public static String reverseString(String input){
        String[] words = input.split("");
        System.out.print(words);
        for (int i = 0; i < words.length; i++){
            words[i] = words[words.length - 1 - i];
        }

        for (int i = 0; i < words.length; i++){
            String word = words[i];
            String newWord[] = word.split("");
            for (int j = 0; j < words.length; j++){
                words[j] = words[words.length - 1 - j];
            }

        }

        return(Arrays.toString(words));

    }

    public static void main(String[] args){
        System.out.print(reverseString("Hi Divya"));
    }
}
 */

import java.util.Arrays;

public class ReverseString {

    //function that reverses a string
    public static String reverseString(String input){
        String result = "";
        
        for (int i = input.length() - 1; i >= 0; i--){
            result += input.charAt(i);
        }
        
        return(result);

        }
        
        public static void main(String[] args){
        System.out.print(reverseString("Hi Divya"));
    }



    }
