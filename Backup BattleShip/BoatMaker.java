import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class BoatMaker {
public JCheckBox[][] shipshape;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoatMaker window = new BoatMaker();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		
		
	}

	/**
	 * Create the application.
	 */
	private int gUIPlayerNumber;
	public BoatMaker() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public JCheckBox[][] getShipShape()
	{
		return shipshape;
	}
	
	public void initialize() {
		setFrame(new JFrame());
		getFrame().getContentPane().setBackground(new Color(51, 102, 255));
		getFrame().setBounds(100, 100, 683, 360);
		getFrame().setLocationRelativeTo ( null );
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JLabel lblPlayer = new JLabel("Player");
		lblPlayer.setBounds(34, 11, 46, 14);
		getFrame().getContentPane().add(lblPlayer);
		
		JLabel lblNewLabel = new JLabel(" "+ gUIPlayerNumber);
		lblNewLabel.setBounds(67, 11, 46, 14);
		getFrame().getContentPane().add(lblNewLabel);
		
		JLabel lblSetYourShips = new JLabel("Set your ships!");
		lblSetYourShips.setBounds(139, 11, 126, 14);
		getFrame().getContentPane().add(lblSetYourShips);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(-11, 31, 678, 2);
		getFrame().getContentPane().add(separator);
		
		JLabel lblA = new JLabel("A");
		lblA.setBounds(10, 75, 46, 14);
		getFrame().getContentPane().add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setBounds(10, 115, 46, 14);
		getFrame().getContentPane().add(lblB);
		
		JLabel lblC = new JLabel("C");
		lblC.setBounds(10, 155, 46, 14);
		getFrame().getContentPane().add(lblC);
		
		JLabel lblD = new JLabel("D");
		lblD.setBounds(10, 195, 46, 14);
		getFrame().getContentPane().add(lblD);
		
		JLabel lblE = new JLabel("E");
		lblE.setBounds(10, 235, 46, 14);
		getFrame().getContentPane().add(lblE);
		
		JLabel lblF = new JLabel("F");
		lblF.setBounds(10, 275, 46, 14);
		getFrame().getContentPane().add(lblF);
		
		JLabel label = new JLabel("1");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(40, 44, 46, 14);
		getFrame().getContentPane().add(label);
		
		JLabel label_1 = new JLabel("2");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(140, 44, 46, 14);
		getFrame().getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("3");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(240, 44, 46, 14);
		getFrame().getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("4");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(340, 44, 46, 14);
		getFrame().getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("5");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(440, 44, 46, 14);
		getFrame().getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("6");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(540, 44, 46, 14);
		getFrame().getContentPane().add(label_5);
		
		JCheckBox chckbxA = new JCheckBox("A1");
		chckbxA.setBounds(32, 71, 70, 23);
		getFrame().getContentPane().add(chckbxA);
		
		JCheckBox chckbxA_1 = new JCheckBox("A2");
		chckbxA_1.setVerticalAlignment(SwingConstants.TOP);
		chckbxA_1.setBounds(134, 71, 70, 23);
		getFrame().getContentPane().add(chckbxA_1);
		
		JCheckBox chckbxA_2 = new JCheckBox("A3");
		chckbxA_2.setBounds(240, 71, 70, 23);
		getFrame().getContentPane().add(chckbxA_2);
		
		JCheckBox chckbxA_3 = new JCheckBox("A4");
		chckbxA_3.setBounds(340, 71, 70, 23);
		getFrame().getContentPane().add(chckbxA_3);
		
		JCheckBox chckbxA_4 = new JCheckBox("A5");
		chckbxA_4.setBounds(440, 71, 70, 23);
		getFrame().getContentPane().add(chckbxA_4);
		
		JCheckBox chckbxA_5 = new JCheckBox("A6");
		chckbxA_5.setBounds(540, 71, 70, 23);
		getFrame().getContentPane().add(chckbxA_5);
		
		JCheckBox chckbxB = new JCheckBox("B1");
		chckbxB.setBounds(34, 111, 70, 23);
		getFrame().getContentPane().add(chckbxB);
		
		JCheckBox chckbxB_1 = new JCheckBox("B2");
		chckbxB_1.setBounds(134, 111, 70, 23);
		getFrame().getContentPane().add(chckbxB_1);
		
		JCheckBox chckbxB_2 = new JCheckBox("B3");
		chckbxB_2.setBounds(240, 111, 70, 23);
		getFrame().getContentPane().add(chckbxB_2);
		
		JCheckBox chckbxB_3 = new JCheckBox("B4");
		chckbxB_3.setBounds(340, 111, 70, 23);
		getFrame().getContentPane().add(chckbxB_3);
		
		JCheckBox chckbxB_4 = new JCheckBox("B5");
		chckbxB_4.setBounds(440, 111, 70, 23);
		getFrame().getContentPane().add(chckbxB_4);
		
		JCheckBox chckbxB_5 = new JCheckBox("B6");
		chckbxB_5.setBounds(540, 111, 70, 23);
		getFrame().getContentPane().add(chckbxB_5);
		
		JCheckBox chckbxC = new JCheckBox("C1");
		chckbxC.setBounds(34, 151, 70, 23);
		getFrame().getContentPane().add(chckbxC);
		
		JCheckBox chckbxC_1 = new JCheckBox("C2");
		chckbxC_1.setBounds(134, 151, 70, 23);
		getFrame().getContentPane().add(chckbxC_1);
		
		JCheckBox chckbxC_2 = new JCheckBox("C3");
		chckbxC_2.setBounds(240, 151, 70, 23);
		getFrame().getContentPane().add(chckbxC_2);
		
		JCheckBox chckbxC_3 = new JCheckBox("C4");
		chckbxC_3.setBounds(340, 151, 70, 23);
		getFrame().getContentPane().add(chckbxC_3);
		
		JCheckBox chckbxC_4 = new JCheckBox("C5");
		chckbxC_4.setBounds(440, 151, 70, 23);
		getFrame().getContentPane().add(chckbxC_4);
		
		JCheckBox chckbxC_5 = new JCheckBox("C6");
		chckbxC_5.setBounds(540, 151, 70, 23);
		getFrame().getContentPane().add(chckbxC_5);
		
		JCheckBox chckbxD = new JCheckBox("D1");
		chckbxD.setBounds(34, 195, 70, 23);
		getFrame().getContentPane().add(chckbxD);
		
		JCheckBox chckbxD_5 = new JCheckBox("D6");
		chckbxD_5.setBounds(540, 195, 70, 23);
		getFrame().getContentPane().add(chckbxD_5);
		
		JCheckBox chckbxD_4 = new JCheckBox("D5");
		chckbxD_4.setBounds(440, 195, 70, 23);
		getFrame().getContentPane().add(chckbxD_4);
		
		JCheckBox chckbxD_3 = new JCheckBox("D4");
		chckbxD_3.setBounds(340, 195, 70, 23);
		getFrame().getContentPane().add(chckbxD_3);
		
		JCheckBox chckbxD_2 = new JCheckBox("D3");
		chckbxD_2.setBounds(240, 195, 70, 23);
		getFrame().getContentPane().add(chckbxD_2);
		
		JCheckBox chckbxD_1 = new JCheckBox("D2");
		chckbxD_1.setBounds(134, 195, 70, 23);
		getFrame().getContentPane().add(chckbxD_1);
		
		JCheckBox chckbxE = new JCheckBox("E1");
		chckbxE.setBounds(34, 235, 70, 23);
		getFrame().getContentPane().add(chckbxE);
		
		JCheckBox chckbxE_5 = new JCheckBox("E6");
		chckbxE_5.setBounds(540, 235, 70, 23);
		getFrame().getContentPane().add(chckbxE_5);
		
		JCheckBox chckbxE_4 = new JCheckBox("E5");
		chckbxE_4.setBounds(440, 235, 70, 23);
		getFrame().getContentPane().add(chckbxE_4);
		
		JCheckBox chckbxE_3 = new JCheckBox("E4");
		chckbxE_3.setBounds(340, 235, 70, 23);
		getFrame().getContentPane().add(chckbxE_3);
		
		JCheckBox chckbxE_2 = new JCheckBox("E3");
		chckbxE_2.setBounds(240, 235, 70, 23);
		getFrame().getContentPane().add(chckbxE_2);
		
		JCheckBox chckbxE_1 = new JCheckBox("E2");
		chckbxE_1.setBounds(134, 235, 70, 23);
		getFrame().getContentPane().add(chckbxE_1);
		
		JCheckBox chckbxF = new JCheckBox("F1");
		chckbxF.setBounds(34, 275, 70, 23);
		getFrame().getContentPane().add(chckbxF);
		
		JCheckBox chckbxF_5 = new JCheckBox("F6");
		chckbxF_5.setBounds(540, 275, 70, 23);
		getFrame().getContentPane().add(chckbxF_5);
		
		JCheckBox chckbxF_4 = new JCheckBox("F5");
		chckbxF_4.setBounds(440, 275, 70, 23);
		getFrame().getContentPane().add(chckbxF_4);
		
		JCheckBox chckbxF_3 = new JCheckBox("F4");
		chckbxF_3.setBounds(340, 275, 70, 23);
		getFrame().getContentPane().add(chckbxF_3);
		
		JCheckBox chckbxF_2 = new JCheckBox("F3");
		chckbxF_2.setBounds(240, 275, 70, 23);
		getFrame().getContentPane().add(chckbxF_2);
		
		JCheckBox chckbxF_1 = new JCheckBox("F2");
		chckbxF_1.setBounds(134, 275, 70, 23);
		getFrame().getContentPane().add(chckbxF_1);
		
		shipshape = new JCheckBox[][]{{chckbxA, chckbxA_1, chckbxA_2, chckbxA_3, chckbxA_4, chckbxA_5},
				{chckbxB, chckbxB_1, chckbxB_2, chckbxB_3, chckbxB_4, chckbxB_5},
				{chckbxC, chckbxC_1, chckbxC_2, chckbxC_3, chckbxC_4, chckbxC_5},
				{chckbxD, chckbxD_1, chckbxD_2, chckbxD_3, chckbxD_4, chckbxD_5},
				{chckbxE, chckbxE_1, chckbxE_2, chckbxE_3, chckbxE_4, chckbxE_5},
				{chckbxF, chckbxF_1, chckbxF_2, chckbxF_3, chckbxF_4, chckbxF_5}};
		
		
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
