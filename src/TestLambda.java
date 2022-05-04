public class TestLambda {

    @FunctionalInterface
    interface Print{
        void print(int n);
    }

    @FunctionalInterface
    interface SomethingElse{
        void somethingElse();
    }

    public static void main(String[] args) {
        Print printSomeStuff = (n) -> System.out.println("stuff " + n);
        printSomeStuff.print(1);

        SomethingElse noStuff = () -> System.out.println("noStuff");
        noStuff.somethingElse();
    }
}
