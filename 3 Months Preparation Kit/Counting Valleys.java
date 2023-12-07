public static int countingValleys(int steps, String path) {
    // Write your code here
        int valleys = 0;
        int elevation = 0;
        for (char step : path.toCharArray()) {
            boolean wasBelowSeaLevel = elevation < 0;
            if (step == 'D') {
                elevation--;
            } else {
                elevation++;
            }
            
            if (elevation == 0 && wasBelowSeaLevel) {
                valleys++;
            }
        }
        
        return valleys;
    }