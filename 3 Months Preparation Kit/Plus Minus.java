public static void plusMinus(List<Integer> arr) {
        int positives = 0, negetives = 0, zeros = 0;
        for(int i : arr){
            if(i == 0){
                zeros++;
            }
            if(i > 0){
                positives++;
            }
            if (i < 0){
                negetives++;
            }
        }
        double results;
        results = (double) positives/arr.size();
        System.out.println(String.format("%.6f",results));
        results = (double) negetives/arr.size();
        System.out.println(String.format("%.6f",results));
        results = (double) zeros/arr.size();
        System.out.println(String.format("%.6f",results));
    }