package Minimax;

import java.util.Date;

public class ConnectFourMain {

    public static void main(String[] args) {
        long startTime, endTime;
        Date date = new Date();
        startTime = date.getTime();
        String s = "012345601234560123456012345613";
        //her under er til 4*5 board
        //String s = "0101234322323444110";
        //String s = "010123430"; // single thread 10500 ms
        //String s = "010101344322324"; // single thread 20 ms
        //String s = "24310324130200423411";//'o' kan vinde i næste runde
        //String s = "23140320140332"; //hvis 2'er sættes ender man i double attack til modstanderen - skal løses
        //String s = "231403201403322"; //double attack - skal løses - 'o' - i 2 og 4 har zugzwang
        //String s = "2314032014033224";
        //String s = "231403201403324210";
        Board board = new Board(s);
        //System.out.println();

        System.out.println("We are " + board.getNextTurn());
        //MinimaxNewValueEstamation mm = new MinimaxNewValueEstamation(board);
        //MinimaxParallel mp = new MinimaxParallel(board);

//		DoubleRecurcive mm = new DoubleRecurcive(board); mm.minimaxCalc();
        DoubleRecurciveParallel mp = new DoubleRecurciveParallel(board);
        mp.minimaxCalc();
        System.out.println();
        board.display();
        System.out.println();
        System.out.println("We are " + board.getNextTurn() + "\n");
        Date date1 = new Date();
        endTime = date1.getTime();
        System.out.println("time used in ms" + (endTime - startTime));
    }
}
