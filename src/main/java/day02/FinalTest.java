package day02;

public class FinalTest {
    public static void main(String[] args) {

    }
}

/**
 * final:class  field  method
 */

class FinalClass {

    private final int anInt;

    public FinalClass() {
        anInt = 1;
    }

    public FinalClass(int anInt) {
        this.anInt = anInt;
    }

    public final void method() {
    }
}
class SubTest extends FinalClass{

}