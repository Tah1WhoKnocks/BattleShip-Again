import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

public class MainWindow {

	private JFrame frame;

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
		frame.setBounds(100, 100, 480, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][][][][][][][]", "[][][][][][][][][][][][][][]"));
		
		JButton btna = new JButton("A1");
		btna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		frame.getContentPane().add(btna, "cell 2 3");
		
		JButton btnA = new JButton("A2");
		frame.getContentPane().add(btnA, "cell 4 3");
		
		JButton btnA_1 = new JButton("A3");
		frame.getContentPane().add(btnA_1, "cell 6 3");
		
		JButton btnA_2 = new JButton("A4");
		frame.getContentPane().add(btnA_2, "cell 8 3");
		
		JButton btnA_3 = new JButton("A5");
		frame.getContentPane().add(btnA_3, "cell 10 3");
		
		JButton btnA_4 = new JButton("A6");
		frame.getContentPane().add(btnA_4, "cell 12 3");
		
		JButton btnB = new JButton("B1");
		frame.getContentPane().add(btnB, "cell 2 5");
		
		JButton btnB_1 = new JButton("B2");
		frame.getContentPane().add(btnB_1, "cell 4 5");
		
		JButton btnB_2 = new JButton("B3");
		frame.getContentPane().add(btnB_2, "cell 6 5");
		
		JButton btnB_3 = new JButton("B4");
		btnB_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnB_3, "cell 8 5");
		
		JButton btnB_4 = new JButton("B5");
		frame.getContentPane().add(btnB_4, "cell 10 5");
		
		JButton btnB_5 = new JButton("B6");
		frame.getContentPane().add(btnB_5, "cell 12 5");
		
		JButton btnC = new JButton("C1");
		frame.getContentPane().add(btnC, "cell 2 7");
		
		JButton btnC_1 = new JButton("C2");
		frame.getContentPane().add(btnC_1, "cell 4 7");
		
		JButton btnC_3 = new JButton("C3");
		frame.getContentPane().add(btnC_3, "cell 6 7");
		
		JButton btnC_4 = new JButton("C4");
		frame.getContentPane().add(btnC_4, "cell 8 7");
		
		JButton btnC_5 = new JButton("C5");
		frame.getContentPane().add(btnC_5, "cell 10 7");
		
		JButton btnC_6 = new JButton("C6");
		frame.getContentPane().add(btnC_6, "cell 12 7");
		
		JButton btnD = new JButton("D1");
		frame.getContentPane().add(btnD, "cell 2 9");
		
		JButton btnC_2 = new JButton("D2");
		btnC_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnC_2, "cell 4 9");
		
		JButton btnC_7 = new JButton("D3");
		btnC_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnC_7, "cell 6 9");
		
		JButton btnC_8 = new JButton("D4");
		frame.getContentPane().add(btnC_8, "cell 8 9");
		
		JButton btnD_1 = new JButton("D5");
		frame.getContentPane().add(btnD_1, "cell 10 9");
		
		JButton btnD_2 = new JButton("D6");
		frame.getContentPane().add(btnD_2, "cell 12 9");
		
		JButton btnE = new JButton("E1");
		frame.getContentPane().add(btnE, "cell 2 11");
		
		JButton btnE_1 = new JButton("E2");
		frame.getContentPane().add(btnE_1, "cell 4 11");
		
		JButton btnE_2 = new JButton("E3");
		frame.getContentPane().add(btnE_2, "cell 6 11");
		
		JButton btnE_3 = new JButton("E4");
		frame.getContentPane().add(btnE_3, "cell 8 11");
		
		JButton btnE_4 = new JButton("E5");
		frame.getContentPane().add(btnE_4, "cell 10 11");
		
		JButton btnE_5 = new JButton("E6");
		frame.getContentPane().add(btnE_5, "cell 12 11");
		
		JButton btnF = new JButton("F1");
		frame.getContentPane().add(btnF, "cell 2 13");
		
		JButton btnF_1 = new JButton("F2");
		frame.getContentPane().add(btnF_1, "cell 4 13");
		
		JButton btnF_2 = new JButton("F3");
		frame.getContentPane().add(btnF_2, "cell 6 13");
		
		JButton btnF_3 = new JButton("F4");
		frame.getContentPane().add(btnF_3, "cell 8 13");
		
		JButton btnF_4 = new JButton("F5");
		frame.getContentPane().add(btnF_4, "cell 10 13");
		
		JButton btnF_5 = new JButton("F6");
		frame.getContentPane().add(btnF_5, "cell 12 13");
	}
}
