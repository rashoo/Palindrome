import java.util.LinkedList;

/*Using a stack to determine if a string
is a palindrome. Cases and punctuation are ignored
ex: racecar
    I did did I?
**/
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("abccba"));
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        System.out.println(isPalindrome("Don't nod"));
    }

    public static boolean isPalindrome(String string){
        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder stringNoPunc = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for(int i=0; i<lowerCase.length(); i++){
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z'){
                stringNoPunc.append(c);
                stack.push(c);
            }
        }
        StringBuilder reversedString = new StringBuilder(stack.size());
        while (!stack.isEmpty()){
            reversedString.append(stack.pop());
        }
        return reversedString.toString().equals(stringNoPunc.toString());
    }

}
