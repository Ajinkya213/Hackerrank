  public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
    int pairCount = 0;
        for(int i = 0; i < n-1 ; i++){
            for(int j = i+1; j < n; j++ ){
                if ((ar.get(i)+ar.get(j)) % k == 0){
                    pairCount++;
                }
            }
        }
        return pairCount;
    }