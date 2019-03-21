package day03;
//随机生成[1， 20]数10000次，使用两种方法实现（java.lang.Math，java.util.Random），并判断两种方法的效率和分布。
public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i <= 10000 ; i++) {
            for (int j = 0; j <= 20; j++) {
                System.out.println(Math.random());
            }
        }
    }

}
