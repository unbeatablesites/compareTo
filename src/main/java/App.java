public class App {

    public static void main(String[] args) {
        example1();
        example4();
        System.out.println("^========Matching numbers that equal 0 ========^");
        example2();
        example5();
        System.out.println("^========Non matching numbers that equal less than 0 (minus number) ========^");
        example3();

    }


    public static void example1(){


        String a = "apple";
        String b = "apple";

       int ans = a.compareTo(b);

        System.out.println("This returns 0 because comparing object string ==> "+ans);

    }
    public static void example2(){

        String a = "apple";
        String b = "appletree";

        int ans = a.compareTo(b);

        System.out.println("This will compare if the two strings are equal. If equal will return int 0 else positive or negative number ==> "+ans);

    }
    public static void example3(){

        String a = "apple";
        String b = "";

        int ans = a.compareTo(b);

        System.out.println("This is another way to get the length of thr first string. By comparing to an empty string ==> "+ans);

    }

    public static void example5(){

        String a = "";
        String b = "HowMany";

        int ans = a.compareTo(b);

        System.out.println("This will return a negative number because we are comparing and empty string to an actual string. this is another way to check the length of a string ==> "+ans);

    }

    public static void example4(){

        String a = "apple";
        String b = "apple";

        int ans = a.compareTo("apple");

        System.out.println("This returns 0 because comparing literal string same as object ==> "+ans);

    }
}
