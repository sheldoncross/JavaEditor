package editor;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private MenuBar mainMenu;

    @FXML
    private TextField mainText;

    @FXML
    private TextArea statusBar;


    public Controller(){

        //Get save option from main menu
        MenuItem saveOption = mainMenu.getMenus().get(mainMenu.getMenus().indexOf("Save"));

        //Set the action for the save option
        saveOption.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
    }
}