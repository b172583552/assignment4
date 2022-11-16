import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
/**
 * BigTwoGUI
 */
public class BigTwoGUI implements CardGameUI{
    private BigTwo game;
    private boolean[] selected;
    private int activePlayer;
    private JFrame frame;
    private JPanel bigTwoPanel;
    private JButton playButton;
    private JButton passButton;
    private JTextArea msgArea;
    private JTextArea chatArea;
    private JTextField chatInput;

    public BigTwoGUI(BigTwo game){
        this.game = game;
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new BigTwoPanel());
        frame.pack();
        frame.setVisible(true);
    }
    //for test only 
    public BigTwoGUI(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new BigTwoPanel());
        frame.pack();
        frame.setVisible(true);
    }

    public void setActivePlayer(int activePlayer){

    }

    public void repaint(){

    }

    public void printMsg(String msg){

    }

    public  void clearMsgArea(){

    }

    public void reset(){

    }

    public  void enable(){

    }

    public void disable(){

    }
     
    public void promptActivePlayer(){

    }

    /**
     * InnerBigTwoGUI
     */
    class BigTwoPanel extends JPanel implements MouseListener{
        public BigTwoPanel(){
            int canvasSize = 400;
            setPreferredSize(new Dimension(canvasSize, canvasSize));
            setBackground(color.white);

        } 
    }

    class PlayButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){

        }
    }

    class PassButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            
        }
    }

    class RestartMenuItemListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            
        }
    }
    class QuitMenuItemListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            
        }
    }
  
    public static void main(String[] args) {
        BigTwoGUI gui = new BigTwoGUI();
    }
}