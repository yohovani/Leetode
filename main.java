public class main {
    
    public static void main(String args[]){
        String s = "){";
        ValidParentheses v =  new ValidParentheses();
        if(v.isValid(s))
            System.out.println("True");
        else
        
            System.out.println("False");
    }
}
