import java.util.Map;

public class Main {
    public static void main(String[] args) {

//Задача 1:
        String[] task = {"e", "a", "b", "c", "c", "a", "b"};
        Map<String, Boolean> result = Duplicate.findDuplicate(task);

        System.out.println(result);

//Задача 2:
        String[] input1 = {"code", "bug"};
        String[] input2 = {"man", "moon", "main"};
        String[] input3 = {"man", "moon", "good", "night"};

        System.out.println(Pairs.pairs(input1));
        System.out.println(Pairs.pairs(input2));
        System.out.println(Pairs.pairs(input3));

//Задача*:
        System.out.println(BalancedBrackets.isBalanced("()"));
        System.out.println(BalancedBrackets.isBalanced("[()]"));
        System.out.println(BalancedBrackets.isBalanced("{[()]}"));
        System.out.println(BalancedBrackets.isBalanced("([{{[(())]}}])"));
        System.out.println(BalancedBrackets.isBalanced("{{[]()}}}}"));
        System.out.println(BalancedBrackets.isBalanced("{[(])}"));
    }
}