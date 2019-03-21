package day04;

public class ExceptionTest {
    //Runtime
    public static void main(String[] args) {
        System.out.println("hello".charAt(5));

        try{
            System.out.println("hello".charAt(5));
        }catch(ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("always print ....");
        }
        System.out.println("done.");

    }
}
