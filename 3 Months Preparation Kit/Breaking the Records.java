public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        List <Integer> count = new ArrayList <Integer> ();
        //set countMax : count.at(0)
        //set countMin : count at(1)
        
        int min = 0, max = 0, score = 0, countMax = 0, countMin = 0;
        
        while(score < scores.size()){
            if (score == 0){
                min = scores.get(0);
                max = scores.get(0);
                
            }else if(scores.get(score) < min){
                min = scores.get(score);
                countMin++;
                
            }else if(scores.get(score) > max){
                max = scores.get(score);
                countMax++;
            }
            score++;
        }
        count.add(countMax); count.add(countMin);
        return count;
        
    }