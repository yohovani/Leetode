import java.util.ArrayList;
import java.util.Collections;

public class ReconstructOriginalDigits {
        public String remove_character(String str, int index){
            if(index == 0){
                str = str.substring(1);
            }else{
                String part1 = str.substring(0, index);
                String part2 = str.substring(index + 1);
                str = part1+part2;
            }
            return str;
        }

        public String constructNumber(String number, String stri){
            String aux = stri;
            for(int j = 0;j<number.length();j++){
                int search = stri.indexOf(number.charAt(j));
                if(search != -1){
                    stri = remove_character(stri, search);
                }
            }
            if(stri.length() + number.length() == aux.length()){
                return stri;
            }else{
                return aux;
            }
        }

        public int foundOccurrence(String str, char c){
            int occurrences = 0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i) == c){
                    occurrences += 1;
                }
            }
            return occurrences;
        }

        public String originalDigits(String s) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        //Z -> Search Zero
        //W -> Search Two
        //X -> Search Six
        //F -> Search Five or Four
        //S -> Search Seven
        //G -> Search Eight
        //T -> Search Eight
        //O -> Search One
        //N -> Search Nine
        String letter_filter = "zowtufxsgn";//"zwxufsgton";
        String result = "";

        for(int i=0;i<letter_filter.length();i++){
            int search = s.indexOf(letter_filter.charAt(i));
            if(search != -1){
                switch(letter_filter.charAt(i)){
                    case 'z':{
                        numbers.set(0, foundOccurrence(s,'z'));
                        break;
                    }
                    case 'o':{
                        numbers.set(1, foundOccurrence(s,'o'));
                        break;
                    }
                    case 'w':{
                        numbers.set(2, foundOccurrence(s,'w'));
                        break;
                    }
                    case 't':{
                        numbers.set(3, foundOccurrence(s,'t'));
                        break;
                    }
                    case 'u':{
                        numbers.set(4, foundOccurrence(s,'u'));
                        break;
                    }
                    case 'f':{
                        numbers.set(5, foundOccurrence(s,'f'));
                        break;
                    }
                    case 'x':{
                        numbers.set(6, foundOccurrence(s,'x'));
                        break;
                    }
                    case 's':{
                        numbers.set(7, foundOccurrence(s,'s'));
                        break;
                    }
                    case 'g':{
                        numbers.set(8, foundOccurrence(s,'g'));
                        break;
                    }
                    case 'n':{
                        numbers.set(9, foundOccurrence(s,'n'));
                        break;
                    }
                }
                
            }
        }

        //Correccion del conteo
        //1  
        numbers.set(1, numbers.get(1) - (numbers.get(2)+numbers.get(4)+numbers.get(0)));
        //3 
        numbers.set(3,numbers.get(3) - (numbers.get(2) + numbers.get(8)));
        //5
        numbers.set(5,numbers.get(5) - numbers.get(4));
        //7
        numbers.set(7,numbers.get(7) - numbers.get(6));
        //9
        numbers.set(9,(numbers.get(9) - (numbers.get(1) + numbers.get(7)))/2);


        for(int i=0;i<numbers.size();i++){
            for(int j=0;j<numbers.get(i);j++){
                result += i;    
            }
        }
        return result;
    }
}
