public static int lonelyinteger(List<Integer> a) {
    // Write your code here
    // XOR the whole array to find the unique as two pair of non unique numbers will 0 each other.
        int result = a.get(0);
         for (int i = 1; i < a.size(); i++){
             result = result ^ a.get(i);     
         }
         return result;
    }