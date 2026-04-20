package main.java.ch03_class.basic.sec08.exam04;

public class Calculator {
    public double areaRectangle(int ... numbers) {
        if (numbers.length == 1) {
            return numbers[0] * numbers[0];
        }else{
            return numbers[0] * numbers[1];
        }
    }
}
