class Solution {

    public List<String> generateParenthesis(int n) {
        recursion2(0, 0, n, "");
        return result;
    }

    private List<String> result = new ArrayList<>();
    private void recursion2(int left, int right, int n, String s) {
        // terminator
        if (left==n && right==n) {
            System.out.println(s);
            result.add(s);
            return;
        }

        // process current logic: left right
        // 剪枝
        // 左括号不超过3个可以加左括号
        if (left < n) {
           String s1 = s + "(";
            recursion2(left+1, right, n, s1);
        }
        // 当左括号数 > 右括号数时才可以添加右括号
        if (left > right) {
           String s2 = s + ")";
            recursion2(left, right+1, n, s2);
        }

        // drill down

        // revers state
    }
    
}