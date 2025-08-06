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

public class IntegerToRoman {
    public String intToRoman(int num) {
        String result = "";
        if(num / 1000 > 0){
            int aux = num / 1000;
            for(int i=0;i<aux;i++){
                result += "M";
            }
            num -= aux * 1000;
        }
        if(num / 900 > 0){
            int aux = num / 900;
            result += "CM";
            num -= aux * 900;
        }
        if(num / 500 > 0){
            int aux = num / 500;
            result += "D";
            num -= aux * 500;
        }
        if(num / 400 > 0){
            int aux = num / 400;
            result += "CD";
            num -= aux * 400;
        }
        if(num / 100 > 0){
            int aux = num / 100;
            for(int i=0;i<aux;i++){
                result += "C";
            }
            num -= aux * 100;
        }
        if(num / 90 > 0){
            int aux = num / 90;
            result += "XC";
            num -= aux * 90;
        }
        if(num / 50 > 0){
            int aux = num / 50;
            result += "L";
            num -= aux * 50;
        }
        if(num / 40 > 0){
            int aux = num / 40;
            result += "XL";
            num -= aux * 40;
        }
        if(num / 10 > 0){
            int aux = num / 10;
            for(int i=0;i<aux;i++){
                result += "X";
            }
            num -= aux * 10;
        }
        switch (num) {
            case 1:{
                result += "I";
                break;
            }
            case 2:{
                result += "II";
                break;
            }
            case 3:{
                result += "III";
                break;
            }
            case 4:{
                result += "IV";
                break;
            }
            case 5:{
                result += "V";
                break;
            }
            case 6:{
                result += "VI";
                break;
            }
            case 7:{
                result += "VII";
                break;
            }
            case 8:{
                result += "VIII";
                break;
            }
            case 9:{
                result += "IX";
                break;
            }
            default:
                break;
        }


        return result;
    }
}
