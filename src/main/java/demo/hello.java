package demo;

public class hello {
    public static void main(String[] args) {
        System.out.println("Hello,JavaSE!");
int i = 0;
long l = 123L;
float f = 1.2f;
int y = 0b101010;
int m = 07654321;
int n = 0xabcdef;

char c = '\u9fbb';
char b = '\u4e00';

        System.out.println(c);
        System.out.println(b);
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println((int) '一');
    }
}
