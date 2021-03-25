import java.util.ArrayList;
import java.util.List;

/**
 * @author Silence 000996
 * @data 2021-03-25
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        String str = "";
        generate(0, 0, n, str, result);
        return result;
    }

    public void generate(int left, int right, int n, String str, List<String> result) {
        // terminator
        if (left == n && right == n) {
            result.add(str);
            return;
        }
        // process current logic 

        // drill down 
        if (left < n) {
            generate(left + 1, right, n, str + "(", result);
        }
        if (right < left) {
            generate(left, right + 1, n, str + ")", result);
        }
        // restore current status 
    }
}
