public static String timeConversion(String s) {
    // Write your code here
        String state = s.substring(s.length()-2, s.length());
        String hour = s.substring(0,2);
        String minSec = s.substring(2,s.length()-2);
        
        if(state.equals("PM")){
            if (Integer.parseInt(hour) == 12){
                return hour+minSec;
            }
            if(Integer.parseInt(hour) > 0 && Integer.parseInt(hour) < 12){
                int n = Integer.parseInt(hour) + 12;
                hour = Integer.toString(n);
                return hour+minSec;
            }
        }
        if (state.equals("AM")){
            if(Integer.parseInt(hour) == 12 || Integer.parseInt(hour) == 0){
                return "00"+minSec;
            }
        }
        return hour+minSec;
    }