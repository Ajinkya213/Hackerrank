   public static long flippingBits(long n) {
long [] bit32 = new long [32];
       
       //convert to 32 bit long arr with each indiviual bits
       long remainder = 0;
       for (int i = bit32.length-1 ; i >= 0; i--){
           remainder = n % 2;
           bit32[i] = remainder;
           n = n / 2; 
       }
       //reverse
       for(int i =0 ; i < bit32.length; i++){
           if (bit32[i] == 0){
               bit32[i] = 1; 
           }else{
               bit32[i] = 0;
           }
       }
       int count = 0;
       for(int i =0 ; i < bit32.length; i++){
           System.out.print(bit32[i]+" ");
           count ++;
       }
        System.out.println(count);
       
       
       
      //re combine the flipped bits to decimal.
      long result = 0;
      for (int i = bit32.length-1 ; i >= 0; i--){
           result += (long) Math.pow(2, bit32.length - i-1) * bit32[i];

       }
        
        return result;
    }