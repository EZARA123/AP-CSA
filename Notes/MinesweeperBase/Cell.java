
/**
 * Write a description of class Cell here.
 * 
 * @author Wiebe 
 * @version 10.11.16
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cell implements ActionListener{
    //Variables you need to work with
    private int value;
    
    //Variables you don't need to worry about or care about.
    private JButton button;
    /**
     * This constructor is complete and does not need modification
     */
    public Cell(){
        button = new JButton();
        button.addActionListener(this);
        button.setPreferredSize(new Dimension(20,20));
        button.setMargin(new Insets(0,0,0,0));
        value = 0;
    }
    /** This Method tells me if the cell is a mine.
     * 
     * @return True if it is a mine, otherwse false.
     */
    boolean isMine(){
        return (value == 9);
    }
    
    
    //Additional Methods may be required. Please make them yourself.
    public int setMine(){
       return (value = 9);
    }
    public void changeValue(int count){
        value += count; 
    }
    //The following methods are used for the User Inferface. These methods are fully functional and do not need to be modified.
    public void checkCell(){
        button.setEnabled(false);
        displayValue();
    }
    public int getValue(){
        return value;
    }
    public void displayValue(){
        if(this.isMine()){
            button.setText("\u2600");
            button.setBackground(Color.RED);
        }else if(value!=0){
            button.setText(String.valueOf(value));
        }
    }
    public JButton getButton() {
        return button;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        checkCell();
    }
}
