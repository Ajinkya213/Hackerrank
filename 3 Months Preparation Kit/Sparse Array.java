public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
        List <Integer> countStringMatched = new ArrayList <Integer>(queries.size());
        for(int i=0; i < queries.size(); i++){
            int count = 0;
            for(String token : strings){
                if (queries.get(i).equals(token)){
                    count++;
                }
            }
            countStringMatched.add(count);
        } 
        return countStringMatched;
    }