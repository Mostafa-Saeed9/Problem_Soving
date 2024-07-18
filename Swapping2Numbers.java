public class Swapping2Numbers {
    public static void main(String[] args) {


        int a =20;
        int b= 30;
        System.out.println("a & b values before swapping : " + a + " & "+b);
//        first way
//        int s =a;
//        a=b;
//        b=s;
//        second way
        a = a+b;
        b = a-b;
        a= a-b;
        System.out.println("a & b values after swapping : " + a + " & "+b);
    }
}
