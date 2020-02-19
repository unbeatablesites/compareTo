public class App {

    public static void main(String[] args) {
        example1();
    }


    public static void example1(){


        String a = "apple";
        String b = "apple";

       int ans = a.compareTo("apple");

        System.out.println("This will compare if the two strings are equal. If equal will return int 0 else positive or negative number ==> "+ans);

    }

}
