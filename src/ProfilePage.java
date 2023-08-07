import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ProfilePage implements ActionListener {
	JFrame frame = new JFrame();
	JLabel pageNameLabel = new JLabel("Profile page");
	
	ProfilePage(){
		frame.add(pageNameLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
