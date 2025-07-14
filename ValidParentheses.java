import java.util.ArrayList;

class ValidParentheses {
    public boolean isValid(String s) {

        if(s.length() < 2){
            return false;
        }
        ArrayList<Character> pila = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                pila.add(s.charAt(i));
            }else{
                if(pila.size() > 0){
                    if((s.charAt(i) == ')' && pila.get(pila.size()-1) == '(') || (s.charAt(i) == ']' && pila.get(pila.size()-1) == '[') || (s.charAt(i) == '}' && pila.get(pila.size()-1) == '{')){
                        pila.remove(pila.size()-1);
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        if(pila.size() == 0){
            return true;
        }else{
            return false;
        }
        

    }

}