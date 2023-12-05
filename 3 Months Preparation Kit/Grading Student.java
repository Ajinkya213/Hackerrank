public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List <Integer> roundedUpGrades = new ArrayList<Integer>();
        for(int grade : grades){
            if(grade >= 0 && grade < 38){
                roundedUpGrades.add(grade);
            }
            else if (grade >= 38 && grade <=100){
                if (grade % 5 >= 3){
                    roundedUpGrades.add(grade+(5 - grade%5));
                }else{
                roundedUpGrades.add(grade);
                }
            }
        }
        return roundedUpGrades;
    }