//Mock Test 1
static int findTheMedian(List <Integer> arr){
    Collections.sort(arr);
    return arr.get(arr.size()/2);
}