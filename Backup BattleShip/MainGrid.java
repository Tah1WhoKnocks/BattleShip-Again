import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
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
	private JTextField txtQuestion;
	

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
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		
		txtQuestion = new JTextField();
		txtQuestion.setText("Question");
		txtQuestion.setBounds(335, 11, 230, 20);
		frame.getContentPane().add(txtQuestion);
		txtQuestion.setColumns(10);
		
		JLabel lblAttack = new JLabel("Attack!");
		lblAttack.setBounds(84, 14, 46, 14);
		frame.getContentPane().add(lblAttack);
		
		JLabel lblYourShips = new JLabel("Your Ships!");
		lblYourShips.setBounds(1180, 14, 83, 14);
		frame.getContentPane().add(lblYourShips);
		
		JLabel lblPlayer = new JLabel("Player ");
		lblPlayer.setBounds(682, 14, 46, 14);
		frame.getContentPane().add(lblPlayer);
		
		JButton btnA = new JButton("A1");
		btnA.setBounds(50, 96, 70, 60);
		frame.getContentPane().add(btnA);
		
		JButton btnA_1 = new JButton("A2");
		btnA_1.setBounds(150, 96, 70, 60);
		frame.getContentPane().add(btnA_1);
		
		JButton btnA_2 = new JButton("A3");
		btnA_2.setBounds(250, 96, 70, 60);
		frame.getContentPane().add(btnA_2);
		
		JButton btnA_3 = new JButton("A4");
		btnA_3.setBounds(350, 96, 70, 60);
		frame.getContentPane().add(btnA_3);
		
		JButton btnA_4 = new JButton("A5");
		btnA_4.setBounds(450, 96, 70, 60);
		frame.getContentPane().add(btnA_4);
		
		JButton btnA_5 = new JButton("A6");
		btnA_5.setBounds(550, 96, 70, 60);
		frame.getContentPane().add(btnA_5);
		
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
		
		JButton btnNewButton = new JButton("B1");
		btnNewButton.setBounds(50, 197, 70, 60);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("C1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(50, 297, 70, 60);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("D1");
		btnNewButton_2.setBounds(50, 397, 70, 60);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("E1");
		btnNewButton_3.setBounds(50, 497, 70, 60);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("F1");
		btnNewButton_4.setBounds(50, 597, 70, 60);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnB = new JButton("B2");
		btnB.setBounds(150, 197, 70, 60);
		frame.getContentPane().add(btnB);
		
		JButton btnB_1 = new JButton("B3");
		btnB_1.setBounds(250, 197, 70, 60);
		frame.getContentPane().add(btnB_1);
		
		JButton btnB_2 = new JButton("B4");
		btnB_2.setBounds(350, 197, 70, 60);
		frame.getContentPane().add(btnB_2);
		
		JButton btnB_3 = new JButton("B5");
		btnB_3.setBounds(450, 197, 70, 60);
		frame.getContentPane().add(btnB_3);
		
		JButton btnB_4 = new JButton("B6");
		btnB_4.setBounds(550, 197, 70, 60);
		frame.getContentPane().add(btnB_4);
		
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
		
		JButton btnC = new JButton("C2");
		btnC.setBounds(150, 297, 70, 60);
		frame.getContentPane().add(btnC);
		
		JButton btnC_1 = new JButton("C3");
		btnC_1.setBounds(250, 297, 70, 60);
		frame.getContentPane().add(btnC_1);
		
		JButton btnC_2 = new JButton("C4");
		btnC_2.setBounds(350, 297, 70, 60);
		frame.getContentPane().add(btnC_2);
		
		JButton btnC_3 = new JButton("C5");
		btnC_3.setBounds(450, 297, 70, 60);
		frame.getContentPane().add(btnC_3);
		
		JButton btnC_4 = new JButton("C6");
		btnC_4.setBounds(550, 297, 70, 60);
		frame.getContentPane().add(btnC_4);
		
		JButton btnD = new JButton("D2");
		btnD.setBounds(150, 397, 70, 60);
		frame.getContentPane().add(btnD);
		
		JButton btnD_1 = new JButton("D3");
		btnD_1.setBounds(250, 397, 70, 60);
		frame.getContentPane().add(btnD_1);
		
		JButton btnD_2 = new JButton("D4");
		btnD_2.setBounds(350, 397, 70, 60);
		frame.getContentPane().add(btnD_2);
		
		JButton btnD_3 = new JButton("D5");
		btnD_3.setBounds(450, 397, 70, 60);
		frame.getContentPane().add(btnD_3);
		
		JButton btnD_4 = new JButton("D6");
		btnD_4.setBounds(550, 397, 70, 60);
		frame.getContentPane().add(btnD_4);
		
		JButton btnE = new JButton("E2");
		btnE.setBounds(150, 497, 70, 60);
		frame.getContentPane().add(btnE);
		
		JButton btnE_1 = new JButton("E3");
		btnE_1.setBounds(250, 497, 70, 60);
		frame.getContentPane().add(btnE_1);
		
		JButton btnE_2 = new JButton("E4");
		btnE_2.setBounds(350, 497, 70, 60);
		frame.getContentPane().add(btnE_2);
		
		JButton btnE_3 = new JButton("E5");
		btnE_3.setBounds(450, 497, 70, 60);
		frame.getContentPane().add(btnE_3);
		
		JButton btnE_4 = new JButton("E6");
		btnE_4.setBounds(550, 497, 70, 60);
		frame.getContentPane().add(btnE_4);
		
		JButton btnF = new JButton("F2");
		btnF.setBounds(150, 597, 70, 60);
		frame.getContentPane().add(btnF);
		
		JButton btnF_1 = new JButton("F3");
		btnF_1.setBounds(250, 597, 70, 60);
		frame.getContentPane().add(btnF_1);
		
		JButton btnF_2 = new JButton("F4");
		btnF_2.setBounds(350, 597, 70, 60);
		frame.getContentPane().add(btnF_2);
		
		JButton btnF_3 = new JButton("F5");
		btnF_3.setBounds(450, 597, 70, 60);
		frame.getContentPane().add(btnF_3);
		
		JButton btnF_4 = new JButton("F6");
		btnF_4.setBounds(550, 597, 70, 60);
		frame.getContentPane().add(btnF_4);
		
		JButton button = new JButton("A1");
		button.setBounds(700, 96, 70, 60);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("A2");
		button_1.setBounds(800, 96, 70, 60);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("A3");
		button_2.setBounds(900, 96, 70, 60);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("A4");
		button_3.setBounds(1000, 96, 70, 60);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("A5");
		button_4.setBounds(1100, 96, 70, 60);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("A6");
		button_5.setBounds(1200, 96, 70, 60);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("B1");
		button_6.setBounds(700, 197, 70, 60);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("B2");
		button_7.setBounds(800, 197, 70, 60);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("B3");
		button_8.setBounds(900, 197, 70, 60);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("B4");
		button_9.setBounds(1000, 197, 70, 60);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("B5");
		button_10.setBounds(1100, 197, 70, 60);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("B6");
		button_11.setBounds(1200, 197, 70, 60);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("C1");
		button_12.setBounds(700, 297, 70, 60);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("C2");
		button_13.setBounds(800, 297, 70, 60);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("C3");
		button_14.setBounds(900, 297, 70, 60);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("C4");
		button_15.setBounds(1000, 297, 70, 60);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("C5");
		button_16.setBounds(1100, 297, 70, 60);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("C6");
		button_17.setBounds(1200, 297, 70, 60);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("D1");
		button_18.setBounds(700, 397, 70, 60);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("D2");
		button_19.setBounds(800, 397, 70, 60);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("D3");
		button_20.setBounds(900, 397, 70, 60);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("D4");
		button_21.setBounds(1000, 397, 70, 60);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("D5");
		button_22.setBounds(1100, 397, 70, 60);
		frame.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("D6");
		button_23.setBounds(1200, 397, 70, 60);
		frame.getContentPane().add(button_23);
		
		JButton button_24 = new JButton("E1");
		button_24.setBounds(700, 497, 70, 60);
		frame.getContentPane().add(button_24);
		
		JButton button_25 = new JButton("E2");
		button_25.setBounds(800, 497, 70, 60);
		frame.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("E3");
		button_26.setBounds(900, 497, 70, 60);
		frame.getContentPane().add(button_26);
		
		JButton button_27 = new JButton("E4");
		button_27.setBounds(1000, 497, 70, 60);
		frame.getContentPane().add(button_27);
		
		JButton button_28 = new JButton("E5");
		button_28.setBounds(1100, 497, 70, 60);
		frame.getContentPane().add(button_28);
		
		JButton button_29 = new JButton("E6");
		button_29.setBounds(1200, 497, 70, 60);
		frame.getContentPane().add(button_29);
		
		JButton button_30 = new JButton("F1");
		button_30.setBounds(700, 597, 70, 60);
		frame.getContentPane().add(button_30);
		
		JButton button_31 = new JButton("F2");
		button_31.setBounds(800, 597, 70, 60);
		frame.getContentPane().add(button_31);
		
		JButton button_32 = new JButton("F3");
		button_32.setBounds(900, 597, 70, 60);
		frame.getContentPane().add(button_32);
		
		JButton button_33 = new JButton("F4");
		button_33.setBounds(1000, 597, 70, 60);
		frame.getContentPane().add(button_33);
		
		JButton button_34 = new JButton("F5");
		button_34.setBounds(1100, 597, 70, 60);
		frame.getContentPane().add(button_34);
		
		JButton button_35 = new JButton("F6");
		button_35.setBounds(1200, 597, 70, 60);
		frame.getContentPane().add(button_35);
		
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
}
