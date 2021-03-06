package day04;

public class ConcatTest<T> {
    private void concat(T t1,T t2){
        System.out.println(String.valueOf(t1) + String.valueOf(t2));
    }

    public static void main(String[] args) {
        String s1 = "Tom";
        String s2 = "Jerry";
        ConcatTest<String> c1 = new ConcatTest<>();
        c1.concat(s1,s2);

        int i1 = 1;
        int i2= 2;
        ConcatTest<Integer> c2 = new ConcatTest<>();
        c2.concat(i1,i2);


        boolean b1 = true;
        boolean b2 = false;
        ConcatTest<Boolean> c3 = new ConcatTest<>();
        c3.concat(b1,b2);
    }

}
