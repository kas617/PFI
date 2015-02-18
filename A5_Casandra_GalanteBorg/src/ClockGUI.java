import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;


public class ClockGUI extends JFrame {
	
	
	private String time;
	private String _hours;
	private String _minutes;
	private String _seconds;
	
	private String myHour;
	private String myMin;
	private String mySec;
	
	
	private JTextArea myHours;
	private JTextArea myMinutes;
	private JTextArea mySeconds;
	private JLabel clockLabel;

	int alarmHour;
	int alarmMinute;
	int alarmSecond;
	
	
	
	
	private ClockLogic myClock;

	private JPanel contentPane;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClockGUI frame = new ClockGUI();
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
	
	
	public ClockGUI() {
		myClock = new ClockLogic(ClockGUI.this);
		myClock.execute();//Starts the Clock
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 323);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		myHours=new JTextArea();
		myHours.setBounds(91, 138, 98, 34);
		contentPane.add(myHours);
		
		myMinutes=new JTextArea();
myMinutes.setBounds(91, 183, 98, 34);
		contentPane.add(myMinutes);
		
		mySeconds=new JTextArea();

		mySeconds.setBounds(91, 228, 98, 34);
		contentPane.add(mySeconds);
		
		JButton btnSetAlarm = new JButton("SET ALARM");
		btnSetAlarm.setFont(new Font("Exo", Font.BOLD, 15));
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
		myHour = new String (myHours.getText());
		myMin = new String (myMinutes.getText());
		mySec = new String (mySeconds.getText());
		
			int _alarmHour =Integer.parseInt(myHour);
			int _alarmMinute = Integer.parseInt(myMin);
			int _alarmSecond = Integer.parseInt(mySec);
			
			//Variables
			
			alarmHour = _alarmHour;
			alarmMinute = _alarmMinute;
			alarmSecond = _alarmSecond;
			
			myClock.setBoolean(true);
			
			myClock.setAlarm(alarmHour,alarmMinute,alarmSecond);
			
			//Variables to be used with the if sats.
			
			String hours= Integer.toString(alarmHour);
			String minute= Integer.toString(alarmMinute);
			String seconds= Integer.toString(alarmSecond);
			
			if(alarmHour <10){
				hours= "0" + alarmHour;
			}
				if(alarmMinute <10){
					minute= "0" + alarmMinute;
				}
				if(alarmSecond <10){
					seconds= "0" + alarmSecond;
				}
				
				System.out.println("The alarm is set on:  " + hours + " : " + minute + " : " + seconds);
				
			}
		});
		
		clockLabel=new JLabel("");
		clockLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		clockLabel.setBackground(new Color(255, 255, 255));
		clockLabel.setForeground(new Color(250, 250, 210));
		clockLabel.setFont(new Font("Exo", Font.PLAIN, 50));
		clockLabel.setBounds(91, 23, 414, 87);
		contentPane.add(clockLabel);
		btnSetAlarm.setBounds(429, 138, 148, 42);
		contentPane.add(btnSetAlarm);
		
		
		JButton btnReset = new JButton("RESET ALARM");
		btnReset.setFont(new Font("Exo", Font.BOLD, 15));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		myClock.reset();
		
		myHours.setText("0" + String.valueOf(ClockLogic.alarm_hours));
		myMinutes.setText("0" + String.valueOf(ClockLogic.alarm_minutes));
		mySeconds.setText("0" + String.valueOf(ClockLogic.alarm_second));
		
		System.out.println("Du har ställt alarmet!");
			}
		});
		btnReset.setBounds(429, 207, 148, 42);
		contentPane.add(btnReset);
		
		
		
		
		
		
		JLabel lblmyHours = new JLabel("Hour");
		lblmyHours.setFont(new Font("Exo", Font.PLAIN, 16));
		lblmyHours.setBounds(20, 151, 84, 14);
		contentPane.add(lblmyHours);
		
		JLabel lblmyMinutes = new JLabel("Minute");
		lblmyMinutes.setFont(new Font("Exo", Font.PLAIN, 16));
		lblmyMinutes.setBounds(20, 196, 84, 14);
		contentPane.add(lblmyMinutes);
		
		JLabel lblmySeconds = new JLabel("Second");
		lblmySeconds.setFont(new Font("Exo", Font.PLAIN, 16));
		lblmySeconds.setBounds(20, 241, 84, 14);
		contentPane.add(lblmySeconds);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\kas\\Desktop\\AlarmClock\\clock.jpg"));
		label.setBounds(199, 138, 224, 127);
		contentPane.add(label);
	}
	
	
	
	public void setTime(int hour, int minutes, int seconds){
        
        /**
         * this method makes the clock work on the ClockLabel
         */
         
        _hours=Integer.toString(hour);
        _minutes=Integer.toString(minutes);
        _seconds=Integer.toString(seconds);
         
        /**
         * the if help to put a 0 if it is necessary
         */
         
        if(hour < 10){
                
               _hours = "0" + _hours;
           }
            
           if(minutes < 10)
           {
               _minutes = "0" + _minutes;
           }
           if(seconds < 10)
           {
               _seconds = "0" + _seconds;
           }
         
        time = _hours + ":" +   _minutes + ":" + _seconds;
         
        clockLabel.setText(time); // Clock Label
         
    }
     
    public void invokeAlarm(){
        /**
         * Modifies the background color when the alarm goes off
         * 
         */
    	  
    	 Color d = new Color((float) Math.random(), (float) Math.random(),(float) Math.random());
         contentPane.setBackground(d); 
     
          myHours.setText("");
          myMinutes.setText("");
          mySeconds.setText("");
    }
}
