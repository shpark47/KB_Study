package ch04.sec04;

public class SumFrom1To100Example2 {
    public static void main(String[] args) {
        int result = 0;
        int i = 0;
        while (i <= 100){
            result += i;
            i++;
        }
        System.out.println("1~100 합 : " + result);
    }
}
