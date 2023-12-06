public static int marsExploration(String s) {
    // Write your code here
        int corrections = 0;
        String correctBit = "SOS";
        for (int i = 0 ; i < s.length()-2; i+=3){
            String bit = s.substring(i, i+3);
            if (!bit.equals(correctBit)){
                for(int segment = 0 ; segment < correctBit.length(); segment++){
                    if(bit.charAt(segment) != correctBit.charAt(segment)){
                        corrections++;
                    }
                }
            }
        }
        return corrections;
    }