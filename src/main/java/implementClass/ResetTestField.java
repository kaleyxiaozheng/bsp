package implementClass;

import gui.AccountCreation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kaley on 20/3/17.
 */
public class ResetTestField implements ActionListener{

	private AccountCreation accountCreation;

	public ResetTestField(AccountCreation accountCreation) {
		this.accountCreation = accountCreation;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		accountCreation.getUserIDText().setText("");
		accountCreation.getPasswordField().setText("");
		accountCreation.getFirstNameText().setText("");
		accountCreation.getLastNameText().setText("");
		accountCreation.getEmailText().setText("");
		accountCreation.getPhoneNumberText().setText("");
		accountCreation.getDOBText().setText("");
		accountCreation.getAddressText().setText("");
		accountCreation.getPINText().setText("");
	}
}
