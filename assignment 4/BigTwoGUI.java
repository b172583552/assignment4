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
    private JPanel bottomPanel = new JPanel();
    private int playerCount= 0;
    public BigTwoGUI(){
        //this.game = game;
        //playerList = game.getPlayerList();
		//handsOnTable = game.getHandsOnTable();
        frame = new JFrame();
        bigTwoPanel = new BigTwoPanel();
        menuBar = new JMenuBar();
        gameMenu = new JMenu("Game");
        messageMenu = new JMenu("Message");
        restart = new JMenuItem("Restart");
        quit = new JMenuItem("quit");
        quit.addActionListener(new QuitMenuItemListener());
        clearChatMessage = new JMenuItem("Clear Chat Message");
        clearGameMessage = new JMenuItem("Clear Game Message");
        JPanel buttonPanel = new JPanel();

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

        playButton = new JButton("Play");
        passButton = new JButton("Pass");
        playButton.addActionListener(new PlayButtonListener());
        passButton.addActionListener(new PassButtonListener());
        buttonPanel.add(playButton);
        buttonPanel.add(passButton);
        
        JPanel textPanel = new JPanel();
        
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.X_AXIS));

        JLabel textLabel = new JLabel("Message: ");
        textPanel.add(textLabel);

        chatInput = new JTextField();
        chatInput.addActionListener(new chatInputListener());
        textPanel.add(chatInput);
        

        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));
        bottomPanel.add(buttonPanel);
        bottomPanel.add(textPanel);
        

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
        
        frame.add(bigTwoPanel, BorderLayout.CENTER);
        frame.add(menuBar,BorderLayout.NORTH);
        frame.add(rightPanel,BorderLayout.EAST);
        frame.add(bottomPanel,BorderLayout.SOUTH);

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
    	int canvasSize = 800;
        public BigTwoPanel(){
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            JPanel player1= new JPanel(new BorderLayout());
            JPanel player2= new JPanel(new BorderLayout());
            JPanel player3= new JPanel(new BorderLayout());
            JPanel player4= new JPanel(new BorderLayout());
            JPanel cardPlayed= new JPanel(new BorderLayout());

            JPanel drawPanel1 = new playerPanel();
            JPanel drawPanel2 = new playerPanel();
            JPanel drawPanel3 = new playerPanel();
            JPanel drawPanel4 = new playerPanel();
            JPanel drawPanel5 = new playerPanel();
            
            JLabel label1 = new JLabel("Player 1");
            JLabel label2 = new JLabel("Player 2");
            JLabel label3 = new JLabel("Player 3");
            JLabel label4 = new JLabel("Player 4");
            JLabel label5 = new JLabel("Played by Player ");
            
            JLabel icon1 = new JLabel(new ImageIcon("1.jpg"));
            JLabel icon2 = new JLabel(new ImageIcon("1.jpg"));
            JLabel icon3 = new JLabel(new ImageIcon("1.jpg"));
            JLabel icon4 = new JLabel(new ImageIcon("1.jpg"));
            JLabel icon5 = new JLabel(new ImageIcon("1.jpg"));
            player1.add(label1,BorderLayout.NORTH);
            player2.add(label2,BorderLayout.NORTH);
            player3.add(label3,BorderLayout.NORTH);
            player4.add(label4,BorderLayout.NORTH);
            cardPlayed.add(label5,BorderLayout.NORTH);
            
            player1.add(icon1, BorderLayout.WEST);
            player2.add(icon2, BorderLayout.WEST);
            player3.add(icon3, BorderLayout.WEST);
            player4.add(icon4, BorderLayout.WEST);
            cardPlayed.add(icon5, BorderLayout.WEST);
            
            player1.setBackground(Color.blue);
            player2.setBackground(Color.red);
            player3.setBackground(Color.green);
            player4.setBackground(Color.yellow);
            cardPlayed.setBackground(Color.orange);
            
            this.add(player1);
            this.add(player2);
            this.add(player3);
            this.add(player4);
            this.add(cardPlayed);
            
            setPreferredSize(new Dimension(canvasSize, canvasSize));
            setBackground(Color.green);
            
        }

        
        public void paintComponent(Graphics g) {
            /*
            
            g.drawImage(new ImageIcon("1.jpg").getImage(), 0, 0, this);
            g.drawImage(new ImageIcon("1.jpg").getImage(), 0, 150, this);
            g.drawImage(new ImageIcon("1.jpg").getImage(), 0, 300, this);
            g.drawImage(new ImageIcon("1.jpg").getImage(), 0, 450, this);
            g.drawImage(new ImageIcon("1.jpg").getImage(), 0, 600, this);
            }
            */
        
        }
    }
    
    class playerPanel extends JPanel{
        public string judgeCard(){

        }

        public void paintComponent(Graphics g){
            CardGamePlayer player = playerList.get(playerCount);
            CardList hand = player.getCardsInHand();
            for (int i = 0; i < hand.size(); i++){
                int x = 0;
                int y = 0;
                g.drawImage(new ImageIcon(".jpg").getImage(), x, y, this);
                x
            }
            

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
            System.exit(0);
        }
    }


    class chatInputListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            chatArea.append(activePlayer + ": " + chatInput.getText() + "\n");
        }
    }
  

    public static void main(String[] args) {
        BigTwoGUI gui = new BigTwoGUI();
    }
}
