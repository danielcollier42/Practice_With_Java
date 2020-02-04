public class Runner {
    public static void main(String[] args) {
        int[] nums = {1, 2 ,3, 4, 5};
        System.out.println(hasTeen(1, 22, 15));
        System.out.println(stringSplosion("Hello"));
        System.out.println(theEnd("Good bye", true));
        System.out.println(makeEnds(nums));
        System.out.println(answerCell(false, true, true));
        System.out.println(noTeenSum(5, 7, 17));
        System.out.println(catDog("Cadododogcatyesnopossiblycatdog"));
        System.out.println(equalIsNot("This is not a knot"));
        System.out.println(either24(nums));
        System.out.println(squareUp(5));
    }

    //your codingbat method here - must match
    // the method name from codingbat
    public static boolean hasTeen(int a, int b, int c) {
        boolean isTeen = false;
        for (int i = 13; i < 20; i++) {
            if (i == a || i == b || i == c) {
                isTeen = true;
            }
        }
        return isTeen;
    }

    public static String stringSplosion(String str) {
        boolean hasLetters = true;
        int length = str.length();
        String answer = "";
        if (length == 0) {
            answer = "Please input a real string to be stringsplosed";
        } else {
            for (int i = 0; i <= str.length(); i++) {
                answer += str.substring(0, i);
            }
        }
        return answer;
    }

    public static String theEnd(String str, boolean front) {
        String answer = "";
        if (str.length() > 0) {
            if (front == true) {
                answer += str.substring(0, 1);
            } else if (front == false) {
                answer += str.charAt(str.length() - 1);
            }
        }
        return answer;
    }

    public static int[] makeEnds(int[] nums) {
        int a = nums[0];
        int b = nums[nums.length - 1];
        int[] endsArr = {a, b};
        return endsArr;
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        boolean pickUp = true;
        if (isAsleep == true) {
            pickUp = false;
        } else if (isMom == true) {
            pickUp = true;
        } else if (isMorning) {
            pickUp = false;
        }
        return pickUp;
    }


    public static int noTeenSum(int a, int b, int c) {
        int A = fixTeen(a);
        int B = fixTeen(b);
        int C = fixTeen(c);
        int ans = A + B + C;
        return ans;
    }
    public static int fixTeen(int n) {
        int N = n;
        for (int i = 13; i < 20; i++) {
            if (n == i && n != 15 && n != 16) {
                N = 0;
            }
        }
        return N;
    }

    public static boolean catDog(String str) {
        int dogCount = 0;
        int catCount = 0;
        for (int i = 0; i < str.length() - 2; i++){
            if(str.substring(i, i + 3).equals("dog")){
                dogCount ++;
            }
            if(str.substring(i, i + 3).equals("cat")){
                catCount ++;
            }
        }
        return(catCount == dogCount);
    }

    public static boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount = 0;
        for(int i = 0; i < str.length() - 1; i ++){
            if(str.substring(i, i + 2).equals("is")){
                isCount++;
            }
        }
        for(int i = 0; i < str.length() - 2; i ++){
            if(str.substring(i, i + 3).equals("not")){
                notCount++;
            }
        }
        return(isCount  == notCount);
    }

    public static boolean either24(int[] nums) {
        int ansNum = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 2 && nums[i + 1] == 2){
                ansNum ++;
            } else if(nums[i] == 4 && nums[i + 1] == 4){
                ansNum ++;
            }
        }
        if(ansNum == 1){
            return true;
        } else {
            return false;
        }
    }

    public int[] squareUp(int n) {
        int[] ans = new int[n * n];
        int groups = n;
        for(int i = 0; i < n; i ++){

        }
        return ans;
    }// NOT DONE

}

