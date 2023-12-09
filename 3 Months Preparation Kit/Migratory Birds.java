public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
        int list [] = new int [5]; int maxIndex = 0;
        for (int i = 0 ; i <arr.size(); i++){
            
            // System.out.println(arr.get(i));
             switch (arr.get(i)){
                 case 1: list[arr.get(i)-1]++; 
                 break; 
                 case 2: list[arr.get(i)-1]++; 
                 break;
                 case 3: list[arr.get(i)-1]++; 
                 break;
                 case 4: list[arr.get(i)-1]++; 
                 break;
                 case 5: list[arr.get(i)-1]++; 
                 break;
             }
        }
        
        for (int i = 1 ; i < list.length; i++){
            //System.out.print(list[i] + " ");
            if (list[i] > list[maxIndex]){
                maxIndex = i;
                
            }
        }

        
        return maxIndex+1;
    }