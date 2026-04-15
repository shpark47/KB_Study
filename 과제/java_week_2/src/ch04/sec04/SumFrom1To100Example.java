package ch04.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result += i+1;
        }
        System.out.println("1~100 합 : " + result);
    }
}
