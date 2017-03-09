import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuiQuiz extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private String[][] questions;
	private int currentQuestion;
	private String answer;
	private String input;
	private int questionCounter;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GuiQuiz dialog = new GuiQuiz();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			dialog.createQuestions();
			dialog.askQuestion();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	/**
	 * Create the dialog.
	 */
	public GuiQuiz() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblQuiztimeBattleship = new JLabel("Quiz -Time Battleship");
		lblQuiztimeBattleship.setBounds(137, 74, 130, 14);
		contentPanel.add(lblQuiztimeBattleship);
		
		JLabel lblByTjLander = new JLabel("By Tj Lander, and Arthur Howard");
		lblByTjLander.setBounds(110, 144, 199, 14);
		contentPanel.add(lblByTjLander);
	}
		public void createQuestions()
		{
			String temp;
			
			questionCounter = Integer.parseInt(JOptionPane.showInputDialog("How Many Questions?")); 
			questions = new String[2][questionCounter];
			for(int a = 0;a < questionCounter;a++)
			{
			temp = JOptionPane.showInputDialog("Input your questions with a - in between the question, and answer.");
			questions[0][a] = temp.substring(0,temp.indexOf('-'));
			questions[1][a] = temp.substring(temp.indexOf('-')+1, temp.length());
			}
			
		}
		
		public boolean askQuestion()
		{
			currentQuestion = ((int)Math.random()*currentQuestion);
			if(JOptionPane.showInputDialog(questions[0][currentQuestion]).equals(questions[1][currentQuestion]))
			{
				System.out.println("true");
				return true;
			}else{
				return false;
			}
		}
		
}
