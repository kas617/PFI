

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class BikeGUI {
	

	private JTextField colorArea;
	private JTextField sizeArea;
	private JTextField priceArea;
	

	private BikeStore myBikeStore = new BikeStore();
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeGUI window = new BikeGUI();
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
	public BikeGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 391, 329);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		//
		//	
		//
		//Search areas
		colorArea = new JTextField();
		colorArea.setBounds(10, 171, 151, 22);
		frame.getContentPane().add(colorArea);
		
		sizeArea = new JTextField();
		sizeArea.setBounds(10, 214, 151, 22);
		frame.getContentPane().add(sizeArea);
		
		priceArea = new JTextField();
		priceArea.setBounds(10, 257, 151, 22);
		frame.getContentPane().add(priceArea);
		
		
		//
		//
		//
		//List area
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 355, 149);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		//
		//
		//
		//Button To show list
		JButton btnSearch = new JButton("Show Bike List");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(myBikeStore.getAllBikes());
			}
		});
		btnSearch.setBounds(248, 221, 119, 57);
		frame.getContentPane().add(btnSearch);
		
		//
		//
		//
		//Enter new information Button
		JButton btnNew = new JButton("NEW");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myBikeStore.addBike (colorArea.getText(), sizeArea.getText(), priceArea.getText());
				textArea.setText(myBikeStore.getAllBikes());
				colorArea.setText("");
				sizeArea.setText("");
				priceArea.setText("");
			}
		});
		btnNew.setBounds(248, 171, 117, 39);
		frame.getContentPane().add(btnNew);
		
		//
		//
		//
		//Area name labels
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(180, 167, 34, 31);
		frame.getContentPane().add(lblColor);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(180, 207, 44, 37);
		frame.getContentPane().add(lblSize);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(180, 243, 44, 50);
		frame.getContentPane().add(lblPrice);
		
		
	}
}
