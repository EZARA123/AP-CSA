package MineSweeper2;


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

public class MinesweeperBoard2{
    Cell2[][] board;
    int rows;
    int columns;
    public MinesweeperBoard2(int row, int col, int amountOfMines){
        //Put the constructor here.
        rows = row;
        columns = col;
        board = new Cell2[rows][columns];

        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());
        addMines(amountOfMines);
        addNums();
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public MinesweeperBoard2(){
        this(10,10,20);
    }

    public void addMines(int mines){
        for(int i = 0; i < mines; i++){
            int mineRow = (int)(Math.random() * columns);
            int mineCol = (int)(Math.random() * rows);
            if(board[mineRow][mineCol].isMine()){
                i--;
            }else{
                board [mineRow][mineCol].setMine();
            } 
        }
    }

    public void addNums(){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                 int count = 0;
            if(!board[i][j].isMine()){
                if(j + 1 < board.length && i % board[i].length != board[i].length - 1 && board[i][j + 1].isMine()){
                    count++; //Right
                }
                if(j - 1 >= 0 && i % columns != 0 && board[i][j-1].isMine()){
                    count++; //Left
                }
                if(i + 1 < board.length && board [i + 1][j].isMine()){
                    count++; //Down
                }
                if(i - 1 > 0 && board [i-1][j].isMine()){
                    count++; //Up
                }
                if(i + 1 < board.length && j % board[i].length  != 0 && board[i + 1][j - 1].isMine()){
                    count++;//DownLeft
                }
                if(i + 1 < board.length && j % board[i].length != board[i].length - 1 && board[i + 1][j + 1].isMine()){
                    count++;//DownRight
                }   
                if(i - 1 >= 0 && j % board[i].length != board[i].length - 1 && board[i-1][j + 1].isMine()){
                    count++;//UpLeft
                }
                if(i - 1 >= 0 && j % board[i].length != 0 && board[i -1][j - 1].isMine()){
                    count++;//UpRight
                }
            }
            board[i][j].changeValue(count);
            }
  
        }
    }

    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        int x = -1;
        for(int i = 0; i < rows; i++){
            for(int j =0; j < columns; j++){
                x++;
                if(board[i][j].isMine()){
                    System.out.print("X");
                } else {
                    System.out.print(board[i][j].getValue());
                }
            }
            System.out.println();
        }

    }

    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int i = 0; i< rows; i++){
            for(int j = 0; j < columns; j++){
                board[i][j]= new Cell2();
                panel.add(board[i][j].getButton());
            }
        }
        return panel;
    }
}
