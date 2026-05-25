
class Solution {
    
    public boolean isValid(String s) {
        Stack<Character> pilha = new Stack<>();
        for( int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                pilha.push(s.charAt(i));
            }
            else{
                if (pilha.isEmpty()){
                    return false;
                }
                char c = s.charAt(i);
                char top = pilha.pop();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false; // Mismatch between brackets
                }
            }

        }
        return pilha.isEmpty();
    }
}
