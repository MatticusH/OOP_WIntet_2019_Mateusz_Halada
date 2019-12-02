import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import static java.awt.BorderLayout.*;

public class GameGui extends JFrame {
    private JTextArea enemyStats = new JTextArea();
    private JTextArea playerStats = new JTextArea();
    private Panel mmBtns = new Panel(new GridLayout(3,1));
    private Panel leaderBoards = new Panel(new GridLayout(3,1));
    private Panel container = new Panel();
    private Panel gameSpace = new Panel(new GridLayout(2,7));
    private Panel gameSpace2 = new Panel(new GridLayout(1,3));
    private Panel gameSpace3 = new Panel(new GridLayout(3,1,50, 50));
    private Container main = getContentPane();

    public GameGui() {
        Player enemy = new Player();
        Player player = new Player();

        //The method that defines the window and container for the program is called
        mainWindow();
        //
        gameSpacePanel3();
        //
        gameSpacePanel();
        //
        gameSpacePanel2();
        //The method that defines the main menu panel is called
        mainMenuPanel();


        PlayableCards pc = new PlayableCards();
        /*
         Shuffles purchasable cards and
         gives the player a starting hand
         of 3 cards */

         pc.shuffleShopDeck();
         pc.setPlayerDeck();

         /*
         * This for loop serves as a container
         * for whole rounds during gameplay
         */
         while(enemy.getHp()!=0 && player.getHp()!=0) {
             pc.setEnemyHand();
             enemyStats.setText(enemy.enemyToString());
             playerStats.setText(player.playerToString());

         }

    }

    /** Sets up the main window of the program
     */
    private void mainWindow(){

        setTitle("Main Menu");
        setSize(1280, 720);
        setLocation(160, 90);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);

        Color bg = new Color(1, 95, 133);
        main.setBackground(bg);
        main.add(leaderBoards);
        main.setVisible(true);
    }

    /** Defines the gameSpace panel
     */
    private void gameSpacePanel(){
        container.setSize(new Dimension(1260, 720));
        ButtonGroup playerDeck = new ButtonGroup();
        ButtonGroup playerHand = new ButtonGroup();

        gameSpace.setSize(new Dimension( 460, 300));

        JButton slotA = new JButton("A");
        JButton slotB = new JButton("B");
        JButton slotC = new JButton("C");
        JButton slotD = new JButton("D");
        JButton slotE = new JButton("E");
        JButton slotF = new JButton("F");
        JButton slotG = new JButton("G");
        JButton handSlotA = new JButton("A1");
        JButton handSlotB = new JButton("B1");
        JButton handSlotC = new JButton("C1");


        Image card = null;
        try {
            card = ImageIO.read(getClass().getResource("Cards/testImg.PNG")); } catch (IOException e) {
            e.printStackTrace();
        }

        card.getScaledInstance(55, 80, 0);
        slotA.setIcon(new ImageIcon(card));
        slotB.setIcon(new ImageIcon(card));
        slotC.setIcon(new ImageIcon(card));
        slotD.setIcon(new ImageIcon(card));
        slotE.setIcon(new ImageIcon(card));
        slotF.setIcon(new ImageIcon(card));
        slotG.setIcon(new ImageIcon(card));

        handSlotA.setIcon(new ImageIcon(card));
        handSlotB.setIcon(new ImageIcon(card));
        handSlotC.setIcon(new ImageIcon(card));

        slotA.setPreferredSize(new Dimension(55, 80));
        slotB.setPreferredSize(new Dimension(55, 80));
        slotC.setPreferredSize(new Dimension(55, 80));
        slotD.setPreferredSize(new Dimension(55, 80));
        slotE.setPreferredSize(new Dimension(55, 80));
        slotF.setPreferredSize(new Dimension(55, 80));
        slotG.setPreferredSize(new Dimension(55, 80));

        handSlotA.setPreferredSize(new Dimension(55, 80));
        handSlotB.setPreferredSize(new Dimension(55, 80));
        handSlotC.setPreferredSize(new Dimension(55, 80));

        playerDeck.add(slotA);
        playerDeck.add(slotB);
        playerDeck.add(slotC);
        playerDeck.add(slotD);
        playerDeck.add(slotE);
        playerDeck.add(slotF);
        playerDeck.add(slotG);

        gameSpace.add(slotA);
        gameSpace.add(slotB);
        gameSpace.add(slotC);
        gameSpace.add(slotD);
        gameSpace.add(slotE);
        gameSpace.add(slotF);
        gameSpace.add(slotG);

        playerHand.add(handSlotA);
        playerHand.add(handSlotB);
        playerHand.add(handSlotC);

        gameSpace.add(handSlotA);
        gameSpace.add(handSlotB);
        gameSpace.add(handSlotC);

        gameSpace.setVisible(true);
        container.add(gameSpace);

        container.setVisible(false);

        main.add(container);

    }

    /** Defines the gameSpace panel
     */
    private void gameSpacePanel2(){
        ButtonGroup enemyHand = new ButtonGroup();

        gameSpace2.setSize(new Dimension( 460, 300));

        JButton slotA = new JButton("A");
        JButton slotB = new JButton("B");
        JButton slotC = new JButton("C");

        Image card = null;
        try {
            card = ImageIO.read(getClass().getResource("Cards/testImg.PNG"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        card.getScaledInstance(55, 80, 0);
        slotA.setIcon(new ImageIcon(card));
        slotB.setIcon(new ImageIcon(card));
        slotC.setIcon(new ImageIcon(card));

        slotA.setPreferredSize(new Dimension(55, 80));
        slotB.setPreferredSize(new Dimension(55, 80));
        slotC.setPreferredSize(new Dimension(55, 80));

        enemyHand.add(slotA);
        enemyHand.add(slotB);
        enemyHand.add(slotC);

        gameSpace2.add(slotA);
        gameSpace2.add(slotB);
        gameSpace2.add(slotC);

        gameSpace2.setVisible(true);
        container.add(gameSpace2);
        container.setVisible(false);

        main.add(container);

    }

    /** Defines the gameSpace panel
     */
    private void gameSpacePanel3(){
        enemyStats.setSize(new Dimension(320, 200));
        playerStats.setSize(new Dimension(320, 200));
        enemyStats.setLocation(0,500);

        gameSpace3.setSize(new Dimension( 340, 700));

        gameSpace3.add(enemyStats);
        gameSpace3.add(playerStats);
        gameSpace3.setVisible(true);
        container.add(gameSpace3);

        container.setVisible(false);

        main.add(container);

    }


    /** Defines the main menu panel
     */
    private void mainMenuPanel(){
        JButton playButton = new JButton("Play");
        JButton leaderBoardsButton = new JButton("Leaderboards");
        JButton exitButn = new JButton("Exit");

        playButton.setPreferredSize(new Dimension(160, 80));
        leaderBoardsButton.setPreferredSize(new Dimension(160, 80));
        exitButn.setPreferredSize(new Dimension(160, 80));

        mmBtns.add(playButton);
        mmBtns.add(leaderBoardsButton);
        mmBtns.add(exitButn);

        setVisible(true);

        MMButtonHandler plBtn = new MMButtonHandler();
        playButton.addActionListener(plBtn);

        MMButtonHandler ldBtn = new MMButtonHandler();
        leaderBoardsButton.addActionListener(ldBtn);

        MMButtonHandler exitBtn = new MMButtonHandler();
        exitButn.addActionListener(exitBtn);

        playButton.setActionCommand("a");
        leaderBoardsButton.setActionCommand("b");
        exitButn.setActionCommand("c");
        main.add(mmBtns);
    }

    /** Provides the buttons with functionality
     */
    private class MMButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String choice = e.getActionCommand();

            switch(choice){
                case "a":
                    Player player = new Player();
                    Player pc = new Player();

                    changeToGameSpace();

                    break;
                case "b":
                    mmBtns.setVisible(false);
                    leaderBoards.setVisible(true);
                    leaderBoards.revalidate();
                    leaderBoards.repaint();
                    break;
                case "c":
                    System.exit(0);
            }
        }
    }

    private void changeToGameSpace(){
        setName(JOptionPane.showInputDialog("Please enter your nickname: "));
        mmBtns.setVisible(false);
        container.setVisible(true);
        container.revalidate();
        container.repaint();
        gameSpace.setVisible(true);
        gameSpace.revalidate();
        gameSpace.repaint();
        gameSpace2.setVisible(true);
        gameSpace2.revalidate();
        gameSpace2.repaint();
        gameSpace3.setVisible(true);
        gameSpace3.revalidate();
        gameSpace3.repaint();
    }
}







