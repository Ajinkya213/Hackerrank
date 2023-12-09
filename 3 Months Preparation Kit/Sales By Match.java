public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
    int pair =0;
        Collections.sort(ar);
        for (int i = 1 ; i < ar.size();){
            if(ar.get(i-1) == ar.get(i)){
                pair++;
                i+=2;
            }
            if(i >= ar.size())
            {
                break;
            }
            if (ar.get(i-1) != ar.get(i)){
                i++;
            }
        }
        return pair;
    }
