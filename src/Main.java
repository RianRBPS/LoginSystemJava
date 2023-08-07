import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {


	

	public static void main(String[] args) {

		JFrame mainFrame = new JFrame();
		JPanel loginPagePanel = new JPanel();
		JPanel userFormPagePanel = new JPanel();
		JPanel usersTablePagePanel = new JPanel();
		JLabel loginLabel = new JLabel("Login!");
		JLabel userFormLabel = new JLabel("User Form!");
		JLabel usersTableLabel = new JLabel("Users Table!");

		String currentPage = "";

		//IDandPasswords idandPasswords = new IDandPasswords();

		
		currentPage = "PAGES.LOGIN";

		mainFrame.setSize(420, 420);

		loginPagePanel.setSize(420, 420);
		loginLabel.setText("login");

		userFormPagePanel.setSize(420, 420);
		userFormLabel.setText("User Form");
		
		usersTablePagePanel.setSize(420,420);
		usersTableLabel.setText("Users Table");

		if (currentPage == "PAGES.LOGIN") {
			// new LoginPage(idandPasswords.getLoginInfo());
			mainFrame.add(loginPagePanel);
		} else if (currentPage == "PAGES.USER_FORM") {
			mainFrame.add(userFormPagePanel);			
		} else if (currentPage == "PAGES.USERS_TABLE") {
			mainFrame.add(usersTablePagePanel);		
		}


		
		// LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
		
		// ProfilePage profilePage = new Profile();


		// Render application Frame

		mainFrame.setVisible(true);
	}

}
