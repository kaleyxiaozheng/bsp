package implementClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kaley on 20/3/17.
 */
public class ExitSystem implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
