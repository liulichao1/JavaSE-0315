package day01.day03;

public class StringBufferTest {
    public static void main(String[] args) {

        String s = "hello ";

        String s1 = "hi";

        StringBuffer stringBuffer = new StringBuffer(s );

        String string = stringBuffer.toString();

        //String 不可变的，降低运行速度
        //StringBuffer 可变的
        //append    delete   insert    reverse    setCharAt

        char[] chars = new char[26];
        int x = 0;
        for (int i = 65; i < 65+26 ; i++) {
            chars[x] = (char)i;
            x++;
        }
        String alphabet = new String (chars);
        long start = System .currentTimeMillis();
        StringBuffer stringBuffer1 = new StringBuffer();
        for (int i = 0; i < 100000 ; i++) {
            stringBuffer.append(alphabet);
        }
        System.out.println(stringBuffer.length ());
        System.out.println("total time:" +(System.currentTimeMillis() - start) + "ms.");

    }
}
