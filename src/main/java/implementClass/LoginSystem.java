package implementClass;

import gui.MainControl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kaley on 20/3/17.
 */
public class LoginSystem implements ActionListener {

	private String userID;
	private String password;
	private MainControl manControl;

	public LoginSystem(MainControl mainControl) {
		this.manControl = mainControl;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		userID = manControl.getUserIDText().getText();
		password = manControl.getPasswordText().getText();

		System.out.println(userID + password);
	}
}
