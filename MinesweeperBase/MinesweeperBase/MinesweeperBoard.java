
/**
 * Write a description of class Minesweeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MinesweeperBoard{
    Cell[] board;
    int rows;
    int columns;
    public MinesweeperBoard(int row, int col){
        //Put the constructor here.
        rows = row;
        columns = col;
        board = new Cell[rows*columns];

        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());
        addMines(20);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public MinesweeperBoard(){
        this(10,10);
    }

    public void addMines(int mines){
        for(int i = 0; i < mines; i++){
            int mineCell = (int)(Math.random() * (columns * rows) + 1);
            board [mineCell].setMine(); 
        }
    }

    public void addNums(){
        
    }

    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        int x = -1;
        for(int j = 0; j < columns; j++){
            for(int i =0; i < rows; i++){
                x++;
                if(board[x].getValue() == 9){
                    System.out.print("X");
                } else {
                    System.out.print(board[x].getValue());
                }

            }
            System.out.println();
        }

    }

    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int i = 0; i< rows*columns; i++){
            board[i]= new Cell();
            panel.add(board[i].getButton());
        }
        return panel;
    }

}
