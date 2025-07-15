class ValidWord {
    public boolean isValid(String word) {
        String vowels = "AEIOU";
        String vowels_lower = vowels.toLowerCase();
        String consonants = "BCDFGHJKLMNPQRSTVWXYZ";
        String consonants_lower = consonants.toLowerCase();
        String numbers = "0123456789";
        int v = 0;
        int c = 0;
        if(word.length() >= 3){
            for(int i=0;i<word.length();i++){
                if(vowels.indexOf(word.charAt(i)) == -1 && vowels_lower.indexOf(word.charAt(i)) == -1){
                    if(consonants.indexOf(word.charAt(i)) == -1 && consonants_lower.indexOf(word.charAt(i)) == -1){
                        if(numbers.indexOf(word.charAt(i)) == -1){
                            System.out.println(word.charAt(i)+" - "+vowels.indexOf(word.charAt(i)));
                            return false;
                        }
                    }else{
                        c += 1;
                    }
                }else{
                    v += 1;
                }
            }
        }
        if(c >= 1 && v >= 1)
            return true;
        return false;
    }
// || 
}