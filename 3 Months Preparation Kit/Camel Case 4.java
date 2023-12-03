public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //S : Split || C: Combine
        // C: Class || M: Method || V: Variable
        
        //Reader
        Scanner scan = new Scanner(System.in);
        List <String> list = new ArrayList<String>();
        String []token = new String[2];
        //reading and saving it in a string
        
         while (scan.hasNext()) {            
            list.add(scan.nextLine());
        }
        
        for(String s : list){
            token = s.split(";");
        
        if(token[0].equals("S")){
            
            String build = "";
            
            for(int i = 0 ; i < token[2].length(); i++){
                
                if(token[2].charAt(i) == '('){
                    break;
                }         
                if( Character.isUpperCase(token[2].charAt(i))){
                    if(i == 0){
                      build+=Character.toLowerCase(token[2].charAt(i));  
                    }else{    
                    build+=" ";
                    build+=Character.toLowerCase(token[2].charAt(i));
                    }
                }else{
                    build += token[2].charAt(i);
                }
            }
            System.out.println(build);
        }
        
        if(token[0].equals("C")){
            String build = "";
            
            if(token[1].equals("C")){
                build += Character.toUpperCase(token[2].charAt(0));
                for (int i = 1; i < token[2].length(); i++) {
                    if(Character.isWhitespace(token[2].charAt(i))){
                        build += Character.toUpperCase(token[2].charAt(i+1));
                        i++;
                    }else{
                        build += token[2].charAt(i);
                    }
                }
                
                build.replaceAll(" ", "");
                System.out.println(build);
            }
            
            
            if(token[1].equals("V")){
                for (int i = 0; i < token[2].length(); i++) {
                    if(Character.isWhitespace(token[2].charAt(i))){
                        build += Character.toUpperCase(token[2].charAt(i+1));
                        i++;
                    }else{
                        build += token[2].charAt(i);
                    }
                }
                build.replaceAll(" ", "");
                System.out.println(build);
            }
            
            
            if(token[1].equals("M")){
                for (int i = 0; i < token[2].length(); i++) {
                    if(Character.isWhitespace(token[2].charAt(i))){
                        build += Character.toUpperCase(token[2].charAt(i+1));
                        i++;
                    }else{
                        build += token[2].charAt(i);
                    }
                }
                build.replaceAll(" ", "");
                System.out.println(build+"()");
            }
         }   
        }
        
    }