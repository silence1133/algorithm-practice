import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * title:20. 有效的括号
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 * <p>
 * 输入：s = "(]"
 * 输出：false
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Silence 000996
 * @data 2021-03-10
 */
public class BracketsIsValid {
    public boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        }
        //作为字典存下来，key为右括号，是为了方便可以用key拿到左括号
        Map<Character, Character> dic = new HashMap();
        dic.put(')', '(');
        dic.put('}', '{');
        dic.put(']', '[');
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //左括号，push到栈
            if (dic.containsValue(c)) {
                stack.push(c);
                continue;
            }
            //右括号
            if (dic.containsKey(c)) {
                //有可能第一个字符就是右括号，这种情况stack会没有值，这种单独判断
                if (stack.size() == 0) {
                    return false;
                }
                char expected = dic.get(c);
                char actual = stack.pop();
                if (expected == actual) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        //最后如果栈没有值了，满足条件
        return stack.size() == 0;
    }
}
