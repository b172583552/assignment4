import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
/**
 * BigTwoGUI
 */
public class BigTwoGUI implements CardGameUI{
    private BigTwo game;
    private boolean[] selected;
    private int activePlayer;
    private ArrayList<CardGamePlayer> playerList; // the list of players
	private ArrayList<Hand> handsOnTable; // the list of hands played on the table
	
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu gameMenu;
    private JMenu messageMenu;
    private JMenuItem restart;
    private JMenuItem quit;
    private JMenuItem clearGameMessage;
    private JMenuItem clearChatMessage;
    private JPanel bigTwoPanel;
    private JButton playButton;
    private JButton passButton;
    private JTextArea msgArea;
    private JTextArea chatArea;
    private JTextField chatInput;
    public BigTwoGUI(){
        //this.game = game;
        //playerList = game.getPlayerList();
		//handsOnTable = game.getHandsOnTable();
        frame = new JFrame();
        menuBar = new JMenuBar();
        gameMenu = new JMenu("Game");
        messageMenu = new JMenu("Message");
        restart = new JMenuItem("Restart");
        quit = new JMenuItem("quit");
        clearChatMessage = new JMenuItem("Clear Chat Message");
        clearGameMessage = new JMenuItem("Clear Game Message");
        
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        
        msgArea = new JTextArea(10,20);
        chatArea = new JTextArea(10,20);
        msgArea.setLineWrap(true);
        chatArea.setLineWrap(true);
        JScrollPane scroller1 = new JScrollPane(msgArea);
        scroller1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        rightPanel.add(scroller1);

        JScrollPane scroller2 = new JScrollPane(chatArea);
        scroller2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        rightPanel.add(scroller1);
        rightPanel.add(scroller2);

        menuBar.add(gameMenu);
        menuBar.add(messageMenu);
        gameMenu.add(restart);
        gameMenu.add(quit);
        messageMenu.add(clearChatMessage);
        messageMenu.add(clearGameMessage);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(new BigTwoPanel(), BorderLayout.CENTER);
        frame.add(menuBar,BorderLayout.NORTH);
        frame.add(rightPanel,BorderLayout.EAST);
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
    class BigTwoPanel extends JPanel {
    	int canvasSize = 400;
        public BigTwoPanel(){
            
            setPreferredSize(new Dimension(canvasSize, canvasSize));
            setBackground(Color.green);
            
        } 
       public void paintComponent(Graphics g) {
    	   	super.paintComponent(g);
    	   	
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
