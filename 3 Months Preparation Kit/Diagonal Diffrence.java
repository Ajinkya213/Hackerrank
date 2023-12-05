 public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int leftDig = 0, rightDig = 0;
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.get(0).size(); j++){
                if( i == j ){
                    leftDig += arr.get(i).get(j);
                }
                if (i+j == arr.size()-1){
                    rightDig += arr.get(i).get(arr.size()-1-i);
                }
            }
        }
        
        return Math.abs(leftDig - rightDig);
    }