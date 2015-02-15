import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.TextArea;
import java.util.ArrayList;


public class GUI extends JFrame {

	private JPanel contentPane;
	ArrayList<Animal> animals; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	
	
	
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Animal list");
		lblNewLabel.setBounds(10, 11, 125, 14);
		contentPane.add(lblNewLabel);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 31, 414, 220);
		contentPane.add(textArea);
	
		
        animals = new ArrayList<Animal>();
		
		animals.add(new Dog("canis lupus", 4, true));
		animals.add(new Dog("canis lupus", 4, false, "Charlie"));
		animals.add(new Cat("lynx lynx", 3, 9));
		Cat cat = new Cat("lynx lynx", 3, 9);
		cat.setFriendlyName("Candy");
		animals.add(cat);
		animals.add(new Snake("python skitfarlig", true));
		Snake snake = new Snake("python", false);
		snake.setFriendlyName("Sneaky");
		animals.add(snake);
		
		for (int i = 0; i < animals.size(); i++ ){
			textArea.append(animals.get(i).getInfo() + "\n");
		}
		
	}
}



