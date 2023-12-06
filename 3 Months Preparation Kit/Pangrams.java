 public static String pangrams(String s) {
    // Write your code here
           int[] alphabetIndex = new int [26];
        
        //First we need to remove all the whitespaces and all the character to lowercase.
        s = s.replace(" ", "");
        s = s.toLowerCase();
        
        int i =0;
        while (i < s.length()){
            int value = Character.getNumericValue(s.charAt(i));
            if (value >= 10 && value <= 35){
                value -= 10;
                alphabetIndex[value] = 1;
            }
            i++;
        }
        
        i = 0; int count = 0;
        while (i < alphabetIndex.length){
            count += alphabetIndex[i];
            i++;
        }
        
        if(count != 26){
            return "not pangram" ;
        }else{
            return "pangram";
        }
         
    }