package csc307calc;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class Output {
	int num = 0;
	int total = 0;
	Label output;
	Operation op;
	public Output(){
		output = new Label("" + num);
	}
	public void refresh(){
		output.setText("" + num);
	}
}
