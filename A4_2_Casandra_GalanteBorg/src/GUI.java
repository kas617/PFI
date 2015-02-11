import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import java.awt.TextArea;
import javax.swing.JLabel;


public class GUI {

	private JFrame frame;

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
	
       public static void loopingAnimals(String[] args) {
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		animals.add(new Dog("canis lupus", 4, true));
		animals.add(new Dog("canis lupus", 4, false, "brasse"));
		animals.add(new Cat("lynx lynx", 3, 9));
		Cat cat = new Cat("lynx lynx", 3, 9);
		cat.setFriendlyName("misse");
		animals.add(cat);
		animals.add(new Snake("python skitfarlig", true));
		Snake snake = new Snake("python", false);
		snake.setFriendlyName("Bengt");
		animals.add(snake);
		
		for(Animal animal : animals) {
			System.out.println(animal.getInfo());
		}

	}
	
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 32, 414, 219);
		frame.getContentPane().add(textArea);
		
		JLabel lblAnimalList = new JLabel("Animal List");
		lblAnimalList.setBounds(10, 11, 116, 14);
		frame.getContentPane().add(lblAnimalList);
	}
}
