public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
         int [] sortedArray = new int[100];
         
        for (int index : arr){
            
            int count = sortedArray[index];
            count++;
            sortedArray[index] = count;
        }
        List <Integer> sortedList = new ArrayList<>();
        for (int i =0 ; i < sortedArray.length; i++){
            sortedList.add(sortedArray[i]);
        }
     return sortedList;
    }
