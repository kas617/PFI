import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;


public class GUI extends JFrame {

	
	private JFrame frame;
	private JTextField humanName;
	private JTextField dogName;
	JTextArea errorArea;
	JTextArea infoArea;
	Human human;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 356, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHumansAndDogs = new JLabel("Humans and Dogs");
		lblHumansAndDogs.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 16));
		lblHumansAndDogs.setBounds(113, 23, 136, 14);
		frame.getContentPane().add(lblHumansAndDogs);
		
		//Text fields for Humans
		humanName = new JTextField();
		humanName.setBounds(10, 64, 136, 20);
		frame.getContentPane().add(humanName);
		humanName.setColumns(10);
		
		//Text field for dogs
		dogName = new JTextField();
		dogName.setBounds(10, 110, 136, 20);
		frame.getContentPane().add(dogName);
		dogName.setColumns(10);
		
		//Button to add Human name
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = humanName.getText();
				if(name.length() > 2) {
					human = new Human(name);
					errorArea.append("new human!\n");
				} else {
					errorArea.append("The name must be at least 3 characters long!\n");
				}
			
			}
		});
		btnNewHuman.setBounds(156, 63, 171, 23);
		frame.getContentPane().add(btnNewHuman);
		
		
		//Button to add Dog name
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(human != null) {
					if(!human.hasDog()) {
						String dogName = dogName.getText();
						human.buyDog(new Dog(dogName));
						errorArea.append("buy dog!\n");
					} else {
						errorArea.append("This person already has dog!\n");
					}
				} else {
					errorArea.append("no human \n");
				}
				
			}
		});
		btnBuyDog.setBounds(156, 109, 171, 23);
		frame.getContentPane().add(btnBuyDog);
		
		//Button to print info
		JButton btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			}
		});
		btnPrintInfo.setBounds(156, 153, 171, 23);
		frame.getContentPane().add(btnPrintInfo);
		
		
		//Info field
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(10, 185, 46, 14);
		frame.getContentPane().add(lblInfo);
		
		
		//Error field		
		JLabel lblErrorMessages = new JLabel("Error messages");
		lblErrorMessages.setBounds(10, 259, 125, 14);
		frame.getContentPane().add(lblErrorMessages);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(7, 198, 320, 50);
		frame.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 274, 317, 50);
		frame.getContentPane().add(textArea_1);
	}
}
