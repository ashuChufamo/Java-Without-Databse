package ashu;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author selam computer
 */
public class FXMLController implements Initializable {
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   
    @FXML 
    private Label status;
    
    @FXML 
    private Label username;
    
    @FXML 
    private Label password;

    
   
public void login()
{
    if (islogin(username.getText(),password.getText()))
            {status.setText("correct authenticaton");}
    else {status.setText("incorrec username password combination");}
}

    private boolean islogin(String uname, String pass)  {
        if (uname.equals("ashu") && pass.equals("1234"))
        {           
        return true;
    }
        return false;
}public void test(){}

}


  