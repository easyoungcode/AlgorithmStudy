import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Java17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int cnt = 1;

        for (int i = 0; i < N; i++) {
            stack.add(Integer.parseInt(br.readLine()));
        }

        int stckTop = stack.pop();

        int cmp;

        while (!stack.isEmpty()) {
            cmp = stack.pop();

            if(cmp > stckTop) {
                stckTop = cmp;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
