public class App {

    public static void main(String[] args) {
        example1();
        example4();
        System.out.println("^===================================================Matching numbers that equal 0 ==================================================^");
        example2();
        example5();
        example6();
        example7();
        example8();
        System.out.println("^==================================================Non matching numbers that equal less than 0 (minus number) ==================================================^");
        example3();
        example9();
        example10();

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

    public static void example5(){

        String a = "";
        String b = "HowMany";

        int ans = a.compareTo(b);

        System.out.println("This will return a negative number because we are comparing and empty string to an actual string. this is another way to check the length of a string ==> "+ans);

    }

    public static void example6(){

        String a = "ok";
        String b = "ok1111";

        int ans = a.compareTo(b);

        System.out.println("This gives a negative number after the initial match and returns the number of strings after the match in minus numbers ==> "+ans);

    }

    public static void example7(){

        String a = "ok";
        String b = "ok1111";

        int ans = a.compareTo("okokokok");

        System.out.println("This gives a negative number after the initial match and returns the number of strings after the match in minus numbers ==> "+ans);

    }

    public static void example8(){

        String a = "ok";
        String b = "111177ok";

        int ans = a.compareTo("okokokok");

        System.out.println("This gives a negative number after the initial match and returns the number of strings after the match in minus numbers ==> "+ans);

    }


    public static void example4(){

        String a = "apple";
        String b = "apple";

        int ans = a.compareTo("apple");

        System.out.println("This returns 0 because comparing literal string same as object ==> "+ans);

    }

    public static void example3(){

        String a = "apple";
        String b = "";

        int ans = a.compareTo(b);

        System.out.println("This is another way to get the length of thr first string. By comparing to an empty string ==> "+ans);

    }

    public static void example9(){

        String s1="hello";
        String s5="flag";

        int ans =s1.compareTo(s5);

        System.out.println("2 because \"h\" is 2 times greater than \"f\" ==> "+ans);

    }

    public static void example10(){

        String s1="Air";
        String s5="flag";

        int ans =s5.compareTo("Air");

        System.out.println("2 because \"h\" is 2 times greater than \"f\" ==> "+ans);

    }

}
