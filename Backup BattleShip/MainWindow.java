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

public class MainWindow {

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
					MainWindow window = new MainWindow();
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
	public MainWindow() {
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
		btnA.setBackground(new Color(105, 105, 105));
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
	}
}
