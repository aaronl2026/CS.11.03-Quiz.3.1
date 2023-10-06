public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade){
        if (grade <= 49) return 'F';
        else if (grade <= 59) return 'E';
        else if (grade <= 69) return 'D';
        else if (grade <= 79) return 'C';
        else if (grade <= 89) return 'B';
        return 'A';
    }
    // Question 2 - fizzBuzz
    public static String fizzBuzz(int number){
        int div3 = number % 3;
        int div5 = number % 5;
        if (div3 == 0 && div5 == 0) return "fizzbuzz";
        else if (div3 == 0) return "fizz";
        else if (div5 == 0) return "buzz";
        return "unlucky";
    }
    // Question 3 - frontBack
    public static String frontBack(String original){
        if (original.length() < 2) return original;
        String originalsub = original.substring(0, 2);
        return originalsub+original+originalsub;
    }
    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        if (a+b==c) return true;
        else if (a+c==b) return true;
        else if (b+c==a) return true;
        return false;
    }
    // Question 5 - endUp
    public static String endUp(String original){
        if (original.length() < 3) return original.toUpperCase();
        int lastthirdindex = original.length()-3;
        return original.substring(0, lastthirdindex) + original.substring(lastthirdindex).toUpperCase();
    }
}
