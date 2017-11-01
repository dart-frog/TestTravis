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

public class Divide implements Operation {
	Button op;
	Divide div;
	public Divide(Output output){
		op = new Button("/");
		div = this;
		op.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("/");
				output.total = output.num;
				output.num = 0;
				output.op = div;
				output.refresh();
			}
		});
	}
	public void operate(Output output) {
		output.total /= output.num;
		output.refresh();
	}

}
