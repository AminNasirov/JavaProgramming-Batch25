package day53_FunctionalInterface;

public class LambdaExpressions {
    public static void main(String[] args) {

        MyThirdFunctionalInterface<String> stringReverse;

        stringReverse = n -> {
            String reverse = new StringBuilder(n).reverse().toString();
            return reverse;
        };

        System.out.println(stringReverse.method("Wooden Spoon"));



        MyThirdFunctionalInterface<Integer>cube;

        cube = n->{
            Integer cubeNumber = n*n*n;
            return cubeNumber;
        };

        System.out.println(cube.method(5));


    }
}
