// For question 1.2.2

public class SinCos{

    public static void main(String[] args) {
        for ( int i = 0; i <=90; i++ ){
            System.out.println("sin^2(" + i + ") + cos^2(" + i + ") = " +  (Math.pow(Math.sin((Math.PI *i)/180), 2) + Math.pow(Math.cos((Math.PI *i)/180), 2)));

        }
    }
}
