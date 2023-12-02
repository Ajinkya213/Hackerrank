public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long minSum = 0, maxSum = 0;
        Collections.sort(arr);
        
        for(int i = 0; i < 4 ;i++){
            minSum += arr.get(i);
        }
        
        for(int i = 1; i < 5 ;i++){
            maxSum += arr.get(i);
        }
        
        System.out.println(minSum + " " + maxSum);
    }