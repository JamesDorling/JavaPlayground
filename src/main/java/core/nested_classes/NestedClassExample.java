package core.nested_classes;

public class NestedClassExample {
    //This is the outer class

    private int num = 4;

    private static int staticNum = 4;

    private static final int FINALNUM = 2;

    protected int protInt = 1;


    public static void main(String[] args) {
        NestedClassExample nestClass = new NestedClassExample();
        //nestClass.InnerClass.funFunctionEyoo();

    }

    public class InnerClass {
        private void funFunctionEyoo() {
            num = 3;
        }
    }
}
