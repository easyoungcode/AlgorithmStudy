import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Java10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int tot = 0;
        Stack<Character> s = new Stack<>();

        str = br.readLine();
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='(') {
                s.push(str.charAt(i));
            } else if(str.charAt(i)==')' && str.charAt(i-1)=='(') {
                s.pop();
                tot+=s.size();
            } else {
                s.pop();
                tot++;
            }
        }
        System.out.println(tot);
    }
}
