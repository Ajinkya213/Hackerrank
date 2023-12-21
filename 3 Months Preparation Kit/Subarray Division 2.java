public static int birthday(List<Integer> s, int d, int m) {
    int segmentCount = 0;
    
    for (int i = 0; i <= s.size() - m; i++) {
        int sum = 0;
        
        for (int j = i; j < i + m; j++) {
            sum += s.get(j);
        }
        
        if (sum == d) {
            segmentCount++;
        }
    }
    
    return segmentCount;
    }