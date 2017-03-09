import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import net.miginfocom.swing.MigLayout;
import norm.buzzfeed;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import java.awt.Color;

public class MainGrid {

	String answer;
	JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Player self;
	private Player opponent;
	

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGrid window = new MainGrid();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public MainGrid() {
		initialize();
		setSelf(new Player(1));
		setOpponent(new Player(2));
	}
	
	public MainGrid(Player p, Player o) {
		self = p;
		opponent = o;
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		ActionListener listener = new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            if (e.getSource() instanceof JButton) {
	                String text = ((JButton) e.getSource()).getText();
	                JOptionPane.showMessageDialog(null, text);
	            }
	        }
	    };
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 102, 255));
		frame.setBounds(100, 100, 1366, 720);
		frame.setLocationRelativeTo ( null );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 49, 1350, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(659, 0, 31, 681);
		frame.getContentPane().add(separator_1);
		
		JLabel lblAttack = new JLabel("Attack!");
		lblAttack.setBounds(84, 14, 46, 14);
		frame.getContentPane().add(lblAttack);
		
		JLabel lblYourShips = new JLabel("Your Ships!");
		lblYourShips.setBounds(1180, 14, 83, 14);
		frame.getContentPane().add(lblYourShips);
		
		JLabel lblPlayer = new JLabel("Player ");
		lblPlayer.setBounds(682, 14, 46, 14);
		frame.getContentPane().add(lblPlayer);
		
		String[] letters = {"A","B","C","D","E","F","G","H","I","J"};
		
		JButton[] listThem = new JButton[64];
		int y = 100;
		
		//cleaner implementation of buttons
		//loop reads player.getEnemies and sets buttons accordingly
		
		//self = new Player(1);
		//opponent = new Player(2);
		
		for(int row = 0; row<6; row++){
			int x = 50;
			for(int col = 0; col<6; col++){
				if(self.getEnemies()[row][col]==2){
					listThem[(row*6)+col]=new JButton(letters[row]+(col+1));
					listThem[(row*6)+col].setBounds(x,y,70,60);
					frame.getContentPane().add(listThem[(row*6)+col]);
				}
				else if(self.getEnemies()[row][col]==1){
					listThem[(row*6)+col]=new JButton("Miss!");
					listThem[(row*6)+col].setBounds(x,y,70,60);
					frame.getContentPane().add(listThem[(row*6)+col]);
				}
				else {
					listThem[(row*6)+col]=new JButton("Hit!");
					listThem[(row*6)+col].setBounds(x,y,70,60);
					frame.getContentPane().add(listThem[(row*6)+col]);
				}
				
				
				x+=100;
			}
			y += 100;
		}
		
		JButton[] listMe = new JButton[64];
		int y1 = 100;
		
			
			
			/*for(int col = 1; col<7; col++){
				listMe[row+col]=new JButton(letters[row]+col);
				listMe[row+col].setBounds(x,y1,70,60);
				frame.getContentPane().add(listMe[row+col]);
				*/
			
				
		for(int row = 0; row<6; row++){
			int x = 710;
			for(int col = 0; col<6; col++){
				if(self.getShips()[row][col]>1){
					listMe[(row*6)+col]=new JButton("Ship");
					listMe[(row*6)+col].setBounds(x,y1,70,60);
					frame.getContentPane().add(listMe[(row*6)+col]);
				}
				else if(self.getShips()[row][col]==1){
					listMe[(row*6)+col]=new JButton("Empty");
					listMe[(row*6)+col].setBounds(x,y1,70,60);
					frame.getContentPane().add(listMe[(row*6)+col]);
				}
				else {
					listMe[(row*6)+col]=new JButton("Hit!");
					listMe[(row*6)+col].setBounds(x,y1,70,60);
					listMe[(row*6)+col].setBackground(Color.red);
					frame.getContentPane().add(listMe[(row*6)+col]);
				}
				
				
				x+=100;
			}
			y1 += 100;
		}
		
		JLabel lblA = new JLabel("A");
		lblA.setBounds(10, 120, 46, 14);
		frame.getContentPane().add(lblA);
		
		JLabel label = new JLabel("1");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(50, 62, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("2");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(150, 62, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("3");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(250, 62, 46, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("4");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(350, 62, 46, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("5");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(450, 62, 46, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("6");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(550, 62, 46, 14);
		frame.getContentPane().add(label_5);
		
		JLabel lblB = new JLabel("B");
		lblB.setBounds(10, 220, 46, 14);
		frame.getContentPane().add(lblB);
		
		JLabel lblC = new JLabel("C");
		lblC.setBounds(10, 320, 46, 14);
		frame.getContentPane().add(lblC);
		
		JLabel lblD = new JLabel("D");
		lblD.setBounds(10, 420, 46, 14);
		frame.getContentPane().add(lblD);
		
		JLabel lblE = new JLabel("E");
		lblE.setBounds(10, 520, 46, 14);
		frame.getContentPane().add(lblE);
		
		JLabel lblF = new JLabel("F");
		lblF.setBounds(10, 620, 46, 14);
		frame.getContentPane().add(lblF);
		
		JLabel label_6 = new JLabel("A");
		label_6.setBounds(668, 119, 46, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("B");
		label_7.setBounds(668, 220, 46, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("C");
		label_8.setBounds(668, 320, 46, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("D");
		label_9.setBounds(668, 420, 46, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("E");
		label_10.setBounds(668, 520, 46, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("F");
		label_11.setBounds(668, 620, 46, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("1");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBounds(700, 62, 46, 14);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("2");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(800, 62, 46, 14);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("3");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setBounds(900, 62, 46, 14);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("4");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBounds(1000, 62, 46, 14);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("5");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setBounds(1100, 62, 46, 14);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("6");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setBounds(1200, 62, 46, 14);
		frame.getContentPane().add(label_17);
	}
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public Player getOpponent() {
		return opponent;
	}

	public void setOpponent(Player opponent) {
		this.opponent = opponent;
	}
	
	public Player getSelf() {
		return opponent;
	}

	public void setSelf(Player p) {
		self = p;
	}
}
