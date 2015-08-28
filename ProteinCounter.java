import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 * A class to create a protein counter
 * 
 * @author Ricky Dam
 * @version June 20, 2015 
 * 
 * @author Ricky Dam
 * @version June 21, 2015
 * 
 * @author Ricky Dam
 * @version June 22, 2015
 * 
 * @author Ricky Dam
 * @version June 23, 2015
 */
public class ProteinCounter extends JFrame implements ActionListener
{   
    private JFrame frame;
    private JLabel labelFeed; // the label that changes depending on what is happening
    
    private JMenuItem resetItem; // a menuItem for resetting and with keyboard shortcut
    private JMenuItem quitItem; // a menuItem for quitting and with keyboard shortcut       
          
    private JPanel mainPanel;
    private double proteinCount;
    private JTextField proteinCountDisplay;
    
    private JPanel displayPanel;
    
    private JPanel historyPanel;
    private boolean firstHistory;
    private JTextArea history;
    private JTextArea history2;
    
    private JPanel supplementPanel;
    private JPanel dairyPanel;
    private JPanel meatPanel;
    private JPanel grainPanel;
    private JPanel fruitPanel;
    private JPanel vegetablePanel;    
    
    private JButton shake;
    private JButton milk;
    private JButton yogurt;
    private JButton egg;
    private JButton beef;
    private JButton chicken;
    private JButton pork;
    private JButton bread;
    private JButton pita;
    private JButton rice;
    private JButton apple;
    private JButton banana;
    private JButton blueberry;   
    private JButton potato;
    private JButton cucumber;
    private JButton greenbeans;
   
    private int shakeCount;
    private int milkCount;
    private int yogurtCount;
    private int eggCount;
    private int beefCount;
    private int chickenCount;
    private int porkCount;
    private int breadCount;
    private int pitaCount;
    private int riceCount;
    private int appleCount;
    private int bananaCount;
    private int blueberryCount;
    private int potatoCount;
    private int cucumberCount;
    private int greenbeansCount;   
    /** 
     * Constructs a Protein Counter
     */
    public ProteinCounter()       
    {       
       frame = new JFrame("Ricky's Protein Counter");      
       frame.setPreferredSize(new Dimension(1378, 1075)); // (width, length)      
       Container contentPane = frame.getContentPane();
       contentPane.setLayout(new BorderLayout()); // The number of panes
       
       labelFeed = new JLabel();
       labelFeed.setText(" You may begin counting your protein intake.");
       labelFeed.setFont(new Font(null, Font.BOLD, 25));
       contentPane.add(labelFeed, BorderLayout.SOUTH);
       
       menu();
       
       main();
       history();
       
       supplement();
       dairy();
       meat();
       grain();
       fruit();
       vegetable();

       zero();
       initialize();
       quantities();       
       
       contentPane.add(mainPanel, BorderLayout.WEST);
       contentPane.add(historyPanel, BorderLayout.EAST);       

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
       frame.pack();
       frame.setResizable(true);
       frame.setVisible(true);      
    }    
   
    /**
     * Checks for what action was performed by the user.
     * 
     * @param The event that has been done by the user
     */
    public void actionPerformed(ActionEvent event)
    {
        Object object = event.getSource();
        if(object instanceof JButton) {
            JButton theButton = (JButton) event.getSource();           
            //*****************************************************
            if(firstHistory) {             
                if(theButton == shake) {
                    proteinCount += 24.0 + 14.4;
                    labelFeed.setText(" Latest : Protein Shake with 400mL of Milk");                   
                    shakeCount++;
                }
                //*****************************************************
                if(theButton == milk) {
                    proteinCount += 9.0;
                    labelFeed.setText(" Latest : Milk");
                    milkCount++;
                }
                if(theButton == yogurt) {
                    proteinCount += 3.0;
                    labelFeed.setText(" Latest : Yogurt");
                    yogurtCount++;
                }
                if(theButton == egg) {
                    proteinCount += 6.0;
                    labelFeed.setText(" Latest : Egg");
                    eggCount++;
                }
                //*****************************************************
                if(theButton == beef) {
                    proteinCount += 22.0;
                    labelFeed.setText(" Latest : Beef");
                    beefCount++;
                }
                if(theButton == chicken) {
                    proteinCount += 25.0;
                    labelFeed.setText(" Latest : Chicken");
                    chickenCount++;
                }
                if(theButton == pork) {
                    proteinCount += 21.0;
                    labelFeed.setText(" Latest : Pork");
                    porkCount++;
                }
                //*****************************************************
                if(theButton == bread) {
                    proteinCount += 10.0;
                    labelFeed.setText(" Latest : Bread");
                    breadCount++;
                }
                if(theButton == pita) {
                    proteinCount += 5.0;
                    labelFeed.setText(" Latest : Pita");
                    pitaCount++;
                }
                if(theButton == rice) {
                    proteinCount += 4.5;
                    labelFeed.setText(" Latest : Rice");
                    riceCount++;
                }
                //*****************************************************
                if(theButton == apple) {
                    proteinCount += 0.3;
                    labelFeed.setText(" Latest : Apple");
                    appleCount++;
                }
                if(theButton == banana) {
                    proteinCount += 1.1;
                    labelFeed.setText(" Latest : Banana");
                    bananaCount++;
                }
                if(theButton == blueberry) {
                    proteinCount += 0.7;
                    labelFeed.setText(" Latest : Blueberry");
                    blueberryCount++;
                }
                //*****************************************************
                if(theButton == potato) {
                    proteinCount += 2.0;
                    labelFeed.setText(" Latest : Potato");
                    potatoCount++;
                }           
                if(theButton == cucumber) {
                    proteinCount += 0.6;
                    labelFeed.setText(" Latest : Cucumber");
                    cucumberCount++;
                }
                if(theButton == greenbeans) {
                    proteinCount += 1.8;
                    labelFeed.setText(" Latest : Green Beans");
                    greenbeansCount++;
                }
                firstHistory = false;
            }
            else {             
                if(theButton == shake) {
                    proteinCount += 24.0 + 14.4;
                    labelFeed.setText(" Latest : Protein Shake with 400mL of Milk");
                    shakeCount++;
                }
                //*****************************************************
                if(theButton == milk) {
                    proteinCount += 9.0;
                    labelFeed.setText(" Latest : Milk");
                    milkCount++;
                }
                if(theButton == yogurt) {
                    proteinCount += 3.0;
                    labelFeed.setText(" Latest : Yogurt");
                    yogurtCount++;
                }
                if(theButton == egg) {
                    proteinCount += 6.0;
                    labelFeed.setText(" Latest : Egg");
                    eggCount++;
                }
                //*****************************************************
                if(theButton == beef) {
                    proteinCount += 22.0;
                    labelFeed.setText(" Latest : Beef");
                    beefCount++;                   
                }
                if(theButton == chicken) {
                    proteinCount += 25.0;
                    labelFeed.setText(" Latest : Chicken");
                    chickenCount++;
                }
                if(theButton == pork) {
                    proteinCount += 21.0;
                    labelFeed.setText(" Latest : Pork");
                    porkCount++;
                }
                //*****************************************************
                if(theButton == bread) {
                    proteinCount += 10.0;
                    labelFeed.setText(" Latest : Bread");
                    breadCount++;
                }
                if(theButton == pita) {
                    proteinCount += 5.0;
                    labelFeed.setText(" Latest : Pita");
                    pitaCount++;
                }
                if(theButton == rice) {
                    proteinCount += 4.5;
                    labelFeed.setText(" Latest : Rice");
                    riceCount++;
                }
                //*****************************************************
                if(theButton == apple) {
                    proteinCount += 0.3;
                    labelFeed.setText(" Latest : Apple");
                    appleCount++;
                }
                if(theButton == banana) {
                    proteinCount += 1.1;
                    labelFeed.setText(" Latest : Banana");
                    bananaCount++;
                }
                if(theButton == blueberry) {
                    proteinCount += 0.7;
                    labelFeed.setText(" Latest : Blueberry");
                    blueberryCount++;
                }
                //*****************************************************
                if(theButton == potato) {
                    proteinCount += 2.0;
                    labelFeed.setText(" Latest : Potato");
                    potatoCount++;
                }
                if(theButton == cucumber) {
                    proteinCount += 0.6;
                    labelFeed.setText(" Latest : Cucumber");
                    cucumberCount++;
                }
                if(theButton == greenbeans) {
                    proteinCount += 1.8;
                    labelFeed.setText(" Latest : Green Beans");
                    greenbeansCount++;
                }   
            }
            quantities();
            firstHistory = false;
            //*****************************************************
            proteinCountDisplay.setText(String.format(Locale.US, "%.1f", proteinCount));
            //proteinCountDisplay.setText(" " + proteinCount);
        }    
        else { // Find out which menuItem has been clicked      
            JMenuItem element = (JMenuItem) object;
            if(element == resetItem) { // the player chose to reset the game
                proteinCount = 0;
                proteinCountDisplay.setText("" + proteinCount);
                labelFeed.setText(" Cleared.");
                zero();
                quantities();
            }           
            if (element == quitItem) { // the player chose to quit the program
                System.exit(0);
            }
        }
    }    
    
    /**
     * The main function that allows building a jar file from this class.
     * 
     * @param args A array of strings
     */
    public static void main(String[] args)
    {
          javax.swing.SwingUtilities.invokeLater(new Runnable() 
          {
              @Override public void run() {
                  new ProteinCounter();
              }
          }
          );
    }
    
    /** 
     * Reset the counter and all the quantities.
     */
    public void zero()       
    {  
       firstHistory = true;
       shakeCount = 0;
       milkCount = 0;
       yogurtCount = 0;
       eggCount = 0;
       beefCount = 0;
       chickenCount = 0;
       porkCount = 0;
       breadCount = 0;
       pitaCount = 0;
       riceCount = 0;
       appleCount = 0;
       bananaCount = 0;
       blueberryCount = 0;
       potatoCount = 0;
       cucumberCount = 0;
       greenbeansCount = 0;   
    }
    
    /** 
     * Putting in all the names in the name column.
     */
    public void initialize()       
    {  
         history.setText("");
         history.append(" Protein Shake" + "\n");
         history.append(" Milk" + "\n");
         history.append(" Yogurt" + "\n");
         history.append(" Egg" + "\n");
         history.append(" Beef" + "\n");
         history.append(" Chicken" + "\n");
         history.append(" Pork" + "\n");
         history.append(" Bread" + "\n");
         history.append(" Pita" + "\n");
         history.append(" Rice" + "\n");
         history.append(" Apple" + "\n");
         history.append(" Banana" + "\n");
         history.append(" Blueberry" + "\n");
         history.append(" Potato" + "\n");
         history.append(" Cucumber" + "\n");
         history.append(" Green Beans");
    }
    
    /** 
     * Update the quantity column.
     */
    public void quantities()       
    {  
         history2.setText("");
         history2.append(" " + shakeCount + "\n");
         history2.append(" " + milkCount + "\n");
         history2.append(" " + yogurtCount + "\n");
         history2.append(" " + eggCount + "\n");
         history2.append(" " + beefCount + "\n");
         history2.append(" " + chickenCount + "\n");
         history2.append(" " + porkCount + "\n");
         history2.append(" " + breadCount + "\n");
         history2.append(" " + pitaCount + "\n");           
         history2.append(" " + riceCount + "\n");
         history2.append(" " + appleCount + "\n");
         history2.append(" " + bananaCount + "\n");
         history2.append(" " + blueberryCount + "\n");
         history2.append(" " + potatoCount + "\n");
         history2.append(" " + cucumberCount + "\n");
         history2.append(" " + greenbeansCount);
    }
    
    /** 
     * Create the supplement section.
     */
    public void supplement()       
    {  
       supplementPanel = new JPanel();
       supplementPanel.setLayout(new GridLayout(1, 1));    
       TitledBorder supp = BorderFactory.createTitledBorder("Supplement");
       supp.setTitleFont(new Font(null, Font.BOLD, 25));
       supplementPanel.setBorder(supp);

       shake = new JButton();      
       shake.setLayout(new GridLayout(2, 1));
      
       JLabel supplement_1 = new JLabel("Protein Shake (1 scoop + 400mL of Milk)");
       supplement_1.setFont(new Font(null, 0, 25));
       supplement_1.setHorizontalAlignment(JTextField.CENTER);
       JLabel supplement_2 = new JLabel("24.0g + 14.4g");
       supplement_2.setFont(new Font(null, Font.BOLD, 40));
       supplement_2.setHorizontalAlignment(JTextField.CENTER);
       
       ///////////////////////////
       shake.add(supplement_1);
       shake.add(supplement_2);
       ///////////////////////////
       supplementPanel.add(shake);
       shake.addActionListener(this);
       ///////////////////////////
       mainPanel.add(supplementPanel);
    }
    
    /** 
     * Create the dairy section.
     */
    public void dairy()
    {
       dairyPanel = new JPanel();
       dairyPanel.setLayout(new GridLayout(1, 1));    
       TitledBorder dairy = BorderFactory.createTitledBorder("Dairy");
       dairy.setTitleFont(new Font(null, Font.BOLD, 25));
       dairyPanel.setBorder(dairy);
      
       milk = new JButton();      
       milk.setLayout(new GridLayout(2, 1));
       yogurt = new JButton();
       yogurt.setLayout(new GridLayout(2, 1));
       egg = new JButton();
       egg.setLayout(new GridLayout(2, 1));
      
       JLabel dairy_1 = new JLabel("Milk (250g : 1 glass)");
       dairy_1.setFont(new Font(null, 0, 25));
       dairy_1.setHorizontalAlignment(JTextField.CENTER);
       JLabel dairy_2 = new JLabel("9.0g");
       dairy_2.setFont(new Font(null, Font.BOLD, 40));
       dairy_2.setHorizontalAlignment(JTextField.CENTER);
      
       JLabel dairy_3 = new JLabel("Yogurt (100g : 1 container)");
       dairy_3.setFont(new Font(null, 0, 25));
       dairy_3.setHorizontalAlignment(JTextField.CENTER);
       JLabel dairy_4 = new JLabel("3.0g");
       dairy_4.setFont(new Font(null, Font.BOLD, 40));
       dairy_4.setHorizontalAlignment(JTextField.CENTER);

       JLabel dairy_5 = new JLabel("Egg (61g : 1 egg)");
       dairy_5.setFont(new Font(null, 0, 25));
       dairy_5.setHorizontalAlignment(JTextField.CENTER);
       JLabel dairy_6 = new JLabel("6.0g");
       dairy_6.setFont(new Font(null, Font.BOLD, 40));
       dairy_6.setHorizontalAlignment(JTextField.CENTER);
       
       ///////////////////////////
       milk.add(dairy_1);
       milk.add(dairy_2);
       yogurt.add(dairy_3);
       yogurt.add(dairy_4); 
       egg.add(dairy_5);
       egg.add(dairy_6);
       ///////////////////////////
       dairyPanel.add(milk);
       milk.addActionListener(this);
       dairyPanel.add(yogurt);
       yogurt.addActionListener(this);
       dairyPanel.add(egg);  
       egg.addActionListener(this);
       ///////////////////////////
       mainPanel.add(dairyPanel);
    }
    
    /** 
     * Create the meat section.
     */
    public void meat()
    {
       meatPanel = new JPanel();
       meatPanel.setLayout(new GridLayout(1, 1));      
       TitledBorder meat = BorderFactory.createTitledBorder("Meat");
       meat.setTitleFont(new Font(null, Font.BOLD, 25));
       meatPanel.setBorder(meat);
      
       beef = new JButton();      
       beef.setLayout(new GridLayout(2, 1));
       chicken = new JButton();      
       chicken.setLayout(new GridLayout(2, 1));
       pork = new JButton();      
       pork.setLayout(new GridLayout(2, 1));
      
       JLabel meat_1 = new JLabel("Beef (100g)");
       meat_1.setFont(new Font(null, 0, 25));
       meat_1.setHorizontalAlignment(JTextField.CENTER);      
       JLabel meat_2 = new JLabel("22.0g");
       meat_2.setFont(new Font(null, Font.BOLD, 40));
       meat_2.setHorizontalAlignment(JTextField.CENTER);

       JLabel meat_3 = new JLabel("Chicken (100g)");
       meat_3.setFont(new Font(null, 0, 25));
       meat_3.setHorizontalAlignment(JTextField.CENTER);      
       JLabel meat_4 = new JLabel("25.0g");
       meat_4.setFont(new Font(null, Font.BOLD, 40));
       meat_4.setHorizontalAlignment(JTextField.CENTER);

       JLabel meat_5 = new JLabel("Pork (100g)");
       meat_5.setFont(new Font(null, 0, 25));
       meat_5.setHorizontalAlignment(JTextField.CENTER);      
       JLabel meat_6 = new JLabel("21.0g");
       meat_6.setFont(new Font(null, Font.BOLD, 40));
       meat_6.setHorizontalAlignment(JTextField.CENTER);
       
       ///////////////////////////
       beef.add(meat_1);
       beef.add(meat_2);
       chicken.add(meat_3);
       chicken.add(meat_4);  
       pork.add(meat_5);
       pork.add(meat_6);
       ///////////////////////////
       meatPanel.add(beef);
       beef.addActionListener(this);
       meatPanel.add(chicken);
       chicken.addActionListener(this);
       meatPanel.add(pork);
       pork.addActionListener(this);
       ///////////////////////////
       mainPanel.add(meatPanel);
    }
    
    /** 
     * Create the grain section.
     */
    public void grain()
    {
       grainPanel = new JPanel();
       grainPanel.setLayout(new GridLayout(1, 1));      
       TitledBorder grain = BorderFactory.createTitledBorder("Grain");
       grain.setTitleFont(new Font(null, Font.BOLD, 25));
       grainPanel.setBorder(grain);
      
       bread = new JButton();      
       bread.setLayout(new GridLayout(2, 1));
       pita = new JButton();      
       pita.setLayout(new GridLayout(2, 1));
       rice = new JButton();      
       rice.setLayout(new GridLayout(2, 1));
      
       JLabel grain_1 = new JLabel("Bread (82g : 2 slices)");
       grain_1.setFont(new Font(null, 0, 25));
       grain_1.setHorizontalAlignment(JTextField.CENTER);      
       JLabel grain_2 = new JLabel("10.0g");
       grain_2.setFont(new Font(null, Font.BOLD, 40));
       grain_2.setHorizontalAlignment(JTextField.CENTER);

       JLabel grain_3 = new JLabel("Pita (60g : 1 pita)");
       grain_3.setFont(new Font(null, 0, 25));
       grain_3.setHorizontalAlignment(JTextField.CENTER);      
       JLabel grain_4 = new JLabel("5.0g");
       grain_4.setFont(new Font(null, Font.BOLD, 40));
       grain_4.setHorizontalAlignment(JTextField.CENTER);
      
       JLabel grain_5 = new JLabel("Rice (200g)");
       grain_5.setFont(new Font(null, 0, 25));
       grain_5.setHorizontalAlignment(JTextField.CENTER);      
       JLabel grain_6 = new JLabel("4.5g");
       grain_6.setFont(new Font(null, Font.BOLD, 40));
       grain_6.setHorizontalAlignment(JTextField.CENTER);
       
       ///////////////////////////
       bread.add(grain_1);
       bread.add(grain_2);
       pita.add(grain_3);
       pita.add(grain_4);  
       rice.add(grain_5);
       rice.add(grain_6);     
       ///////////////////////////
       grainPanel.add(bread);
       bread.addActionListener(this);
       grainPanel.add(pita);
       pita.addActionListener(this);
       grainPanel.add(rice);
       rice.addActionListener(this);
       ///////////////////////////
       mainPanel.add(grainPanel);
    }
    
    /** 
     * Create the fruit section.
     */
    public void fruit()
    {
       fruitPanel = new JPanel();
       fruitPanel.setLayout(new GridLayout(1, 1));      
       TitledBorder fruit = BorderFactory.createTitledBorder("Fruit");
       fruit.setTitleFont(new Font(null, Font.BOLD, 25));
       fruitPanel.setBorder(fruit);
      
       apple = new JButton();      
       apple.setLayout(new GridLayout(2, 1));
       banana = new JButton();      
       banana.setLayout(new GridLayout(2, 1));       
       blueberry = new JButton();      
       blueberry.setLayout(new GridLayout(2, 1));
       
       JLabel fruit_1 = new JLabel("Apple (100g)");
       fruit_1.setFont(new Font(null, 0, 25));
       fruit_1.setHorizontalAlignment(JTextField.CENTER);
       JLabel fruit_2 = new JLabel("0.3g");
       fruit_2.setFont(new Font(null, Font.BOLD, 40));
       fruit_2.setHorizontalAlignment(JTextField.CENTER);     
      
       JLabel fruit_3 = new JLabel("Banana (100g)");
       fruit_3.setFont(new Font(null, 0, 25));
       fruit_3.setHorizontalAlignment(JTextField.CENTER);
       JLabel fruit_4 = new JLabel("1.1g");
       fruit_4.setFont(new Font(null, Font.BOLD, 40));
       fruit_4.setHorizontalAlignment(JTextField.CENTER);

       JLabel fruit_5 = new JLabel("Blueberry (100g)");
       fruit_5.setFont(new Font(null, 0, 25));
       fruit_5.setHorizontalAlignment(JTextField.CENTER);
       JLabel fruit_6 = new JLabel("0.7g");
       fruit_6.setFont(new Font(null, Font.BOLD, 40));
       fruit_6.setHorizontalAlignment(JTextField.CENTER);
       
       ///////////////////////////
       apple.add(fruit_1);
       apple.add(fruit_2); 
       banana.add(fruit_3);
       banana.add(fruit_4);  
       blueberry.add(fruit_5);
       blueberry.add(fruit_6);
       ///////////////////////////
       fruitPanel.add(apple);
       apple.addActionListener(this);
       fruitPanel.add(banana);
       banana.addActionListener(this);
       fruitPanel.add(blueberry);
       blueberry.addActionListener(this);
       ///////////////////////////
       mainPanel.add(fruitPanel);
    }
    
    /** 
     * Create the vegetable section.
     */
    public void vegetable()
    {
       vegetablePanel = new JPanel();
       vegetablePanel.setLayout(new GridLayout(1, 1));      
       TitledBorder vegetable = BorderFactory.createTitledBorder("Vegetable");
       vegetable.setTitleFont(new Font(null, Font.BOLD, 25));
       vegetablePanel.setBorder(vegetable);

       potato = new JButton();      
       potato.setLayout(new GridLayout(2, 1));
       cucumber = new JButton();      
       cucumber.setLayout(new GridLayout(2, 1));
       greenbeans = new JButton();      
       greenbeans.setLayout(new GridLayout(2, 1));
      
       JLabel vegetable_1 = new JLabel("Potato (100g)");
       vegetable_1.setFont(new Font(null, 0, 25));
       vegetable_1.setHorizontalAlignment(JTextField.CENTER);
       JLabel vegetable_2 = new JLabel("2.0g");
       vegetable_2.setFont(new Font(null, Font.BOLD, 40));
       vegetable_2.setHorizontalAlignment(JTextField.CENTER);

       JLabel vegetable_3 = new JLabel("Cucumber (100g)");
       vegetable_3.setFont(new Font(null, 0, 25));
       vegetable_3.setHorizontalAlignment(JTextField.CENTER);
       JLabel vegetable_4 = new JLabel("0.6g");
       vegetable_4.setFont(new Font(null, Font.BOLD, 40));
       vegetable_4.setHorizontalAlignment(JTextField.CENTER);

       JLabel vegetable_5 = new JLabel("Green Beans (100g)");
       vegetable_5.setFont(new Font(null, 0, 25));
       vegetable_5.setHorizontalAlignment(JTextField.CENTER);
       JLabel vegetable_6 = new JLabel("1.8g");
       vegetable_6.setFont(new Font(null, Font.BOLD, 40));
       vegetable_6.setHorizontalAlignment(JTextField.CENTER);
       
       ///////////////////////////
       potato.add(vegetable_1);
       potato.add(vegetable_2);
       cucumber.add(vegetable_3);
       cucumber.add(vegetable_4);
       greenbeans.add(vegetable_5);
       greenbeans.add(vegetable_6);
       ///////////////////////////
       vegetablePanel.add(potato);
       potato.addActionListener(this);
       vegetablePanel.add(cucumber);
       cucumber.addActionListener(this);
       vegetablePanel.add(greenbeans);
       greenbeans.addActionListener(this);
       ///////////////////////////
       mainPanel.add(vegetablePanel);
    }
    
    /** 
     * Create the history panel. (EAST)
     */
    public void history()
    {    
       historyPanel = new JPanel();
       historyPanel.setLayout(new BorderLayout());        
       
       JPanel topPart = new JPanel();
       topPart.setLayout(new BorderLayout());
      
       JLabel historyTitle = new JLabel("History");     
       Color gray = new Color(210, 210, 210);
       historyTitle.setBackground(gray);
       historyTitle.setOpaque(true);
       historyTitle.setFont(new Font(null, Font.BOLD, 50));
       historyTitle.setHorizontalAlignment(JLabel.CENTER);      
       topPart.add(historyTitle, BorderLayout.NORTH);
      
       history = new JTextArea(5, 8); // (length, width)
       history.setEditable(false);
       JScrollPane pane = new JScrollPane(history);
       history.setLineWrap(true);      
       history.setCaretPosition(history.getDocument().getLength());
       history.setFont(new Font(null, 0, 40));
       historyPanel.add(pane, BorderLayout.WEST);
      
       history2 = new JTextArea(5, 2); // (length, width)
       history2.setEditable(false);
       JScrollPane pane2 = new JScrollPane(history2);      
       history2.setLineWrap(true);      
       history2.setCaretPosition(history.getDocument().getLength());
       history2.setFont(new Font(null, Font.BOLD, 40));
       historyPanel.add(pane2, BorderLayout.EAST);
      
       JPanel nameAndQuantity = new JPanel();
       nameAndQuantity.setLayout(new BorderLayout());
      
       JLabel historyName = new JLabel(" Name");
       historyName.setFont(new Font(null, Font.BOLD, 30));
       historyName.setHorizontalAlignment(JLabel.CENTER);
       nameAndQuantity.add(historyName, BorderLayout.WEST);
      
       JLabel historyQuantity = new JLabel("                     Qty");
       historyQuantity.setFont(new Font(null, Font.BOLD, 30));
       historyQuantity.setHorizontalAlignment(JLabel.CENTER);
       nameAndQuantity.add(historyQuantity, BorderLayout.CENTER); 
      
       topPart.add(nameAndQuantity, BorderLayout.SOUTH);      
       historyPanel.add(topPart, BorderLayout.NORTH);         
    }
    
    /** 
     * Create the main panel. (WEST)
     */
    public void main()
    {    
       mainPanel = new JPanel();
       mainPanel.setLayout(new GridLayout(7, 1));           
      
       // ---------- Display Panel ---------- //
       displayPanel = new JPanel();
       displayPanel.setLayout(new GridLayout(1, 1));             
      
       JLabel labelDisplay = new JLabel(" Protein(g): ");      
       Color white = new Color(255, 255, 255);
       labelDisplay.setBackground(white);
       labelDisplay.setOpaque(true);
       labelDisplay.setFont(new Font(null, Font.BOLD, 60));
       labelDisplay.setHorizontalAlignment(JLabel.CENTER);
       displayPanel.add(labelDisplay);
       mainPanel.add(displayPanel);
                  
       proteinCount = 0.0;
       proteinCountDisplay = new JTextField();
       proteinCountDisplay.setBackground(white);
       proteinCountDisplay.setOpaque(true);
       proteinCountDisplay.setEditable(false);
       proteinCountDisplay.setFont(new Font(null, Font.BOLD, 120));
       proteinCountDisplay.setHorizontalAlignment(JTextField.CENTER);
       proteinCountDisplay.setText("" + proteinCount);     
       displayPanel.add(proteinCountDisplay);
    }
    
    /** 
     * Create the menu bar and items.
     */
    public void menu()
    {    
       JMenuBar menuBar = new JMenuBar();
       frame.setJMenuBar(menuBar);
      
       JMenu fileMenu = new JMenu("File");
       fileMenu.setFont(new Font(null, Font.BOLD, 23));
       menuBar.add(fileMenu);
      
       final int SHORTCUT_MASK = Toolkit.getDefaultToolkit().getMenuShortcutKeyMask();
      
       resetItem = new JMenuItem("Clear (Ctrl+C)"); 
       resetItem.setFont(new Font(null, Font.BOLD, 30));
       fileMenu.add(resetItem);
       resetItem.addActionListener(this);
       resetItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, SHORTCUT_MASK));
      
       quitItem = new JMenuItem("Quit (Ctrl+Q)");
       quitItem.setFont(new Font(null, Font.BOLD, 30));
       fileMenu.add(quitItem);
       quitItem.addActionListener(this);
       quitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));             
    }
}