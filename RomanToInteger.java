/*
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
 * 
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)) {
                case 'I':{
                    if(i < s.length()-1){
                        if(s.charAt(i+1) == 'V'){
                            result += 4;
                            i += 1;
                        }else{
                            if(s.charAt(i+1) == 'X'){
                                result += 9;
                                i += 1;
                            }else{
                                result += 1;
                            }
                        }
                    }else{
                        result += 1;
                    }
                    break;
                }
                case 'V':{
                    result += 5;
                    break;
                }
                case 'X':{
                    if(i < s.length()-1){
                        if(s.charAt(i+1) == 'L'){
                            result += 40;
                            i += 1;
                        }else{
                            if(s.charAt(i+1) == 'C'){
                                result += 90;
                                i += 1;
                            }else{
                                result += 10;
                            }
                        }
                    }else{
                        result += 10;
                    }
                    break;
                }
                case 'L':{
                    result += 50;
                    break;
                }
                case 'C':{
                    if(i < s.length()-1){
                        if(s.charAt(i+1) == 'D'){
                            result += 400;
                            i += 1;
                        }else{
                            if(s.charAt(i+1) == 'M'){
                                result += 900;
                                i += 1;
                            }else{
                                result += 100;
                            }
                        }
                    }else{
                        result += 100;
                    }
                    break;
                }
                case 'D':{
                    result += 500;
                    break;
                }
                case 'M':{
                    result += 1000;
                    break;
                }
            }
        }
        return result;
    }
}
