package gui;

import implementClass.ExitSystem;
import implementClass.LoginSystem;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kaley on 14/3/17.
 */
public class MainControl extends JPanel{
	private JLabel header;
	private JLabel userId;
	private JLabel password;

	private JTextField userIDText;
	private JTextField passwordText;

	private JButton login;
	private JButton exit;

	private JPanel[] panels;

	private JButton[] buttons;

	public MainControl() {
		initialize();
	}

	public void initialize(){

		this.setLayout(new GridLayout(3,1));
		panels = new JPanel[3];

		for(int i = 0; i < panels.length; i++){
			panels[i] = new JPanel();
		}

		// Panel1 with header
		panels[0].setLayout(new BorderLayout());
		this.add(panels[0]);

		header = new JLabel("Bank of Monash System");
		header.setFont(new Font("Serif", Font.BOLD, 25));
		header.setHorizontalAlignment(JLabel.CENTER);
		panels[0].add(header);

		// Panel2 with userID and password
		panels[1].setLayout(new GridLayout(2, 4));
		this.add(panels[1]);

		buttons = new JButton[14];

		for(int i = 0; i < buttons.length; i++){
			buttons[i] = new JButton();
			buttons[i].setVisible(false);
			buttons[i].setEnabled(false);
		}

		userId = new JLabel("User ID: ");
		password = new JLabel("Password: ");

		userIDText = new JTextField();
		passwordText = new JTextField();

		panels[1].add(buttons[0]);
		panels[1].add(userId);
		panels[1].add(userIDText);
		panels[1].add(buttons[1]);
		panels[1].add(buttons[2]);
		panels[1].add(password);
		panels[1].add(passwordText);
		panels[1].add(buttons[3]);

		// Panel 3 with buttons
		panels[2].setLayout(new GridLayout(3, 4));
		this.add(panels[2]);

		login = new JButton("log in");
		exit = new JButton("exit");

		for(int i = 4; i < 9; i++){
			panels[2].add(buttons[i]);
		}
		panels[2].add(login);
		panels[2].add(exit);

		for(int i = 9; i < 14; i++){
			panels[2].add(buttons[i]);
		}

		// Button login
		LoginSystem ls = new LoginSystem(this);
		login.addActionListener((ls));

		// Button exit
		ExitSystem es = new ExitSystem();
		exit.addActionListener(es);
	}

	// Getter method
	public JTextField getUserIDText() {
		return userIDText;
	}

	public JTextField getPasswordText() {
		return passwordText;
	}

	public static void main(String[] args){
		MainControl mc = new MainControl();
		JFrame mainFrame = new JFrame("Bank of Monash System");
		mainFrame.add(mc);
		mainFrame.setSize(600, 400);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
}
