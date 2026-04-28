package main.java.ch09_collection_generic.advanced.ch15.sec02.exam03;

import main.java.ch09_collection_generic.advanced.ch15.sec02.exam01.Board;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Board> list = new LinkedList<>();

        list.add(new Board("제목1", "내용1", "저자1"));
        list.add(new Board("제목2", "내용2", "저자2"));
        list.add(new Board("제목3", "내용3", "저자3"));
        list.add(new Board("제목4", "내용4", "저자4"));
        list.add(new Board("제목5", "내용5", "저자5"));

        System.out.println(list.size());
        System.out.println();

        System.out.println(list.get((2)));
        System.out.println();

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        list.remove(2);
        list.remove(2);

        for(Board b : list) {
            System.out.println(b);
        }
    }
}
