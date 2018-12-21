package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    public TextField textGetusername;
    public TextField textGetfirstname;
    public TextField textGetlastname;
    public ListView Friendlist;
    public Label lblFirst;
    public Label lblLast;

    public void addFriend(ActionEvent actionEvent) {
        Friend temp = new Friend(textGetusername.getText(), textGetfirstname.getText(), textGetlastname.getText());


    }

    public void deleteFriend(ActionEvent actionEvent) {
    }
}
