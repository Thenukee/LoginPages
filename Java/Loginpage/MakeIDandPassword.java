import java.util.HashMap;

import javax.swing.JOptionPane;

class MakeIDandPassword {
    private String username,newPassword;
    private HashMap<String,String> loginInfo = new HashMap<String,String>();

     protected int createUserAccount(String firstName, String lastName, String password,IDandPasswords iDandPasswords) {
        loginInfo=iDandPasswords.getLoginInfo();
        String username = firstName.toLowerCase() + lastName.toLowerCase();
        
        if (loginInfo != null && loginInfo.containsKey(username)) {
            JOptionPane.showMessageDialog(null, this, "Username Already taken !", 0);
            return -1;
        } 
        else{
            iDandPasswords.newUser(username, password);

            return 1;
        }
    }
}
