public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        Collections.sort(A);
         Collections.sort(B, Collections.reverseOrder()); 
        int n = A.size();
        String verdict = "";
        for (int i = 0; i < n; i++){
            if (A.get(i)+B.get(i) < k ){
                verdict = "NO";
                break;
            }else{
                verdict = "YES";
            }
        }
        return verdict;
    }