package gui;

import implementClass.ExitSystem;
import implementClass.ResetTestField;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kaley on 14/3/17.
 */
public class AccountCreation extends JPanel{
	private JPanel[] panels;

	private JButton update;
	private JButton exit;
	private JButton reset;
	private JButton back;
	private JButton[] buttons;

	private JLabel header;

	private JLabel userID;
	private JLabel password;
	private JLabel firstName;
	private JLabel lastName;
	private JLabel email;
	private JLabel phoneNumber;
	private JLabel DOB;
	private JLabel address;
	private JLabel PIN;

	private JLabel userIDCheck;
	private JLabel passwordCheck;
	private JLabel emailCheck;
	private JLabel DOBCheck;
	private JLabel phoneNumberCheck;
	private JLabel PINCheck;

	private JTextField userIDText;
	private JTextField firstNameText;
	private JTextField lastNameText;
	private JTextField emailText;
	private JTextField phoneNumberText;
	private JTextField DOBText;
	private JTextField addressText;
	private JTextField PINText;

	private JPasswordField passwordField;

	public AccountCreation() {

		initialize();
	}

	public void initialize(){

		this.setLayout(new BorderLayout());
		panels = new JPanel[3];

		for(int i = 0; i < panels.length; i++){
			panels[i] = new JPanel();
		}

		// Panel1 with header
		panels[0].setPreferredSize(new Dimension(80, 100));
		panels[0].setLayout(new BorderLayout());
		this.add(panels[0], BorderLayout.PAGE_START);

		header = new JLabel("Bank of Monash System");
		header.setFont(new Font("Serif", Font.BOLD, 25));
		header.setHorizontalAlignment(JLabel.CENTER);
		panels[0].add(header);

		// Panel2 with private information
		panels[1].setPreferredSize(new Dimension(80, 600));
		panels[1].setLayout(new GridLayout(17, 3));
		this.add(panels[1], BorderLayout.CENTER);

		buttons = new JButton[41];
		for(int i = 0; i < buttons.length; i++){
			buttons[i] = new JButton();
			buttons[i].setVisible(false);
			buttons[i].setEnabled(false);
		}

		userID = new JLabel("<html>User ID:<sup><font color=red>*</font></sup></html>");
		password = new JLabel("<html>Password:<sup><font color=red>*</font></sup></html>");
		firstName = new JLabel("<html>First Name:<sup><font color=red>*</font></sup></html>");
		lastName = new JLabel("<html>Last Name:<sup><font color=red>*</font></sup></html>");
		phoneNumber = new JLabel("<html>Phone Number:<sup><font color=red>*</font></sup></html>");
		email = new JLabel("<html>Email:<sup><font color=red>*</font></sup></html>");
		DOB = new JLabel("<html>Date of Birth:<sup><font color=red>*</font></sup></html>");
		address = new JLabel("<html>Address:<sup><font color=red>*</font></sup></html>");
		PIN = new JLabel("<html>PIN Number:<sup><font color=red>*</font></sup></html>");

		userID.setHorizontalAlignment(SwingConstants.RIGHT);
		password.setHorizontalAlignment(SwingConstants.RIGHT);
		firstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lastName.setHorizontalAlignment(SwingConstants.RIGHT);
		phoneNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		email.setHorizontalAlignment(SwingConstants.RIGHT);
		DOB.setHorizontalAlignment(SwingConstants.RIGHT);
		address.setHorizontalAlignment(SwingConstants.RIGHT);
		PIN.setHorizontalAlignment(SwingConstants.RIGHT);

		userIDCheck = new JLabel("<html><sub><font color=red>10 digital numbers</font></sub></html>");
		passwordCheck = new JLabel("<html><sub><font color=red>At least 1 upper letter, 1 special mark, and 1 digital number</font></sub></html>");
		emailCheck = new JLabel("<html><sub><font color=red>xxx@xxx.xx</font></sub></html>");
		DOBCheck = new JLabel("<html><sub><font color=red>dd/mm/yy</font></sub></html>");
		phoneNumberCheck = new JLabel("<html><sub><font color=red>10 digital numbers without space</font></sub></html>");
		PINCheck = new JLabel("<html><sub><font color=red>6 digital numbers</font></sub></html>");

		userIDText = new JTextField();
		firstNameText = new JTextField();
		lastNameText = new JTextField();
		emailText = new JTextField();
		phoneNumberText = new JTextField();
		DOBText = new JTextField();
		addressText = new JTextField();
		PINText = new JTextField();

		passwordField = new JPasswordField();

		panels[1].add(userID);
		panels[1].add(userIDText);
		panels[1].add(userIDCheck);

		panels[1].add(buttons[0]);
		panels[1].add(buttons[1]);
		panels[1].add(buttons[2]);

		panels[1].add(password);
		panels[1].add(passwordField);
		panels[1].add(passwordCheck);

		panels[1].add(buttons[3]);
		panels[1].add(buttons[4]);
		panels[1].add(buttons[5]);

		panels[1].add(firstName);
		panels[1].add(firstNameText);
		panels[1].add(buttons[6]);

		panels[1].add(buttons[7]);
		panels[1].add(buttons[8]);
		panels[1].add(buttons[9]);

		panels[1].add(lastName);
		panels[1].add(lastNameText);
		panels[1].add(buttons[10]);

		panels[1].add(buttons[11]);
		panels[1].add(buttons[12]);
		panels[1].add(buttons[13]);

		panels[1].add(email);
		panels[1].add(emailText);
		panels[1].add(emailCheck);

		panels[1].add(buttons[14]);
		panels[1].add(buttons[15]);
		panels[1].add(buttons[16]);

		panels[1].add(phoneNumber);
		panels[1].add(phoneNumberText);
		panels[1].add(phoneNumberCheck);

		panels[1].add(buttons[17]);
		panels[1].add(buttons[18]);
		panels[1].add(buttons[19]);

		panels[1].add(DOB);
		panels[1].add(DOBText);
		panels[1].add(DOBCheck);

		panels[1].add(buttons[20]);
		panels[1].add(buttons[21]);
		panels[1].add(buttons[22]);

		panels[1].add(address);
		panels[1].add(addressText);
		panels[1].add(buttons[23]);

		panels[1].add(buttons[24]);
		panels[1].add(buttons[25]);
		panels[1].add(buttons[26]);

		panels[1].add(PIN);
		panels[1].add(PINText);
		panels[1].add(PINCheck);

		// Panel3 with buttons

		panels[2] = new JPanel();
		panels[2].setPreferredSize(new Dimension(80, 150));
		panels[2].setLayout(new GridLayout(3, 6));
		this.add(panels[2], BorderLayout.PAGE_END);

		update = new JButton("update");
		reset = new JButton("reset");
		back = new JButton("back");
		exit = new JButton("exit");

		for(int i =27; i < 34; i++){
			panels[2].add(buttons[i]);
		}

		panels[2].add(update);
		panels[2].add(reset);
		panels[2].add(back);
		panels[2].add(exit);

		for(int i = 34; i < 41; i++){
			panels[2].add(buttons[i]);
		}

		// Button reset
		ResetTestField rte = new ResetTestField(this);
		reset.addActionListener(rte);

		// Button exit
		ExitSystem es = new ExitSystem();
		exit.addActionListener(es);
	}

	// Getter method


	public JTextField getUserIDText() {
		return userIDText;
	}

	public JTextField getFirstNameText() {
		return firstNameText;
	}

	public JTextField getLastNameText() {
		return lastNameText;
	}

	public JTextField getEmailText() {
		return emailText;
	}

	public JTextField getPhoneNumberText() {
		return phoneNumberText;
	}

	public JTextField getDOBText() {
		return DOBText;
	}

	public JTextField getAddressText() {
		return addressText;
	}

	public JTextField getPINText() {
		return PINText;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public static void main(String[] args){
		AccountCreation ac = new AccountCreation();
		JFrame mainFrame = new JFrame("Bank of Monash System");
		mainFrame.add(ac);
		mainFrame.setSize(1200, 1000);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
}
