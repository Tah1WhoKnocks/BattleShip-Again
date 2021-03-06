package norm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class buzzfeed extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					buzzfeed frame = new buzzfeed();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public buzzfeed() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblBuzzfeed = new JLabel("Buzzfeed");
		lblBuzzfeed.setFont(new Font("Tahoma", Font.BOLD, 30));
		GridBagConstraints gbc_lblBuzzfeed = new GridBagConstraints();
		gbc_lblBuzzfeed.insets = new Insets(0, 0, 5, 0);
		gbc_lblBuzzfeed.anchor = GridBagConstraints.WEST;
		gbc_lblBuzzfeed.gridx = 0;
		gbc_lblBuzzfeed.gridy = 0;
		contentPane.add(lblBuzzfeed, gbc_lblBuzzfeed);
		
		JButton btnNextSite = new JButton("next site");
		btnNextSite.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
			}
		});
		GridBagConstraints gbc_btnNextSite = new GridBagConstraints();
		gbc_btnNextSite.insets = new Insets(0, 0, 5, 0);
		gbc_btnNextSite.gridx = 0;
		gbc_btnNextSite.gridy = 1;
		contentPane.add(btnNextSite, gbc_btnNextSite);
		
	}

}
