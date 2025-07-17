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

        public String originalDigits(String s) {
        ArrayList<Integer> numbers = new ArrayList<>();
        //Z -> Search Zero
        //W -> Search Two
        //X -> Search Six
        //F -> Search Five or Four
        //S -> Search Seven
        //G -> Search Eight
        //T -> Search Eight
        //O -> Search One
        //N -> Search Nine
        String letter_filter = "zwxfusgton";
        String number = "";
        String result = "";
        while(s.length() > 0){
            for(int i=0;i<letter_filter.length();i++){
                int search = s.indexOf(letter_filter.charAt(i));
                String aux = s;
                if(search != -1){
                    switch(letter_filter.charAt(i)){
                        case 'z':{
                            number = "zero";
                            s = constructNumber(number,s);
                            if(number.length() + s.length() == aux.length()){
                                numbers.add(0);
                            }
                            break;
                        }
                        case 'w':{
                            number = "two";
                            s = constructNumber(number,s);
                            if(number.length() + s.length() == aux.length()){
                                numbers.add(2);
                            }
                            break;
                        }
                        case 'x':{
                            number = "six";
                            s = constructNumber(number,s);
                            if(number.length() + s.length() == aux.length()){
                                numbers.add(6);
                            }
                            break;
                        }
                        case 'f':{
                            number = "five";
                            s = constructNumber(number,s);
                            if(number.length() + s.length() == aux.length()){
                                numbers.add(5);
                            }
                            break;
                        }
                        case 'u':{
                            number = "four";
                            s = constructNumber(number,s);
                            if(number.length() + s.length() == aux.length()){
                                numbers.add(4);
                            }
                            break;
                        }
                        case 's':{
                            number = "seven";
                            s = constructNumber(number,s);
                            if(number.length() + s.length() == aux.length()){
                                numbers.add(7);
                            }
                            break;
                        }
                        case 't':{
                            number = "three";
                            s = constructNumber(number,s);
                            if(number.length() + s.length() == aux.length()){
                                numbers.add(3);
                            }
                            break;
                        }
                        case 'g':{
                            number = "eight";
                            s = constructNumber(number,s);
                            if(number.length() + s.length() == aux.length()){
                                numbers.add(8);
                            }
                            break;
                        }
                        case 'o':{
                            number = "one";
                            s = constructNumber(number,s);
                            if(number.length() + s.length() == aux.length()){
                                numbers.add(1);
                            }
                            break;
                        }
                        default:{
                            number = "nine";
                            s = constructNumber(number,s);
                            if(number.length() + s.length() == aux.length()){
                                numbers.add(9);
                            }
                            break;
                        }
                    }
                }
                
            }

        }

        Collections.sort(numbers);
        System.out.println("s = "+s);
        for(int i=0;i<numbers.size();i++){
            result += numbers.get(i);
        }

        return result;
    }
}
