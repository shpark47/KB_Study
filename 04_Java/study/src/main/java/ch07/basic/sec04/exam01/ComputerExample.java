package main.java.ch07.basic.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator cal = new  Calculator();
        Computer com = new  Computer();
        System.out.println(cal.areaCircle(2));
        System.out.println(com.areaCircle(2));
    }
}
