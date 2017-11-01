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
public class Equals {
	Button eq;
	public Equals(Output output){
		eq = new Button("=");
		eq.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("=");
				output.op.operate(output);
				output.num = output.total;
				output.refresh();
			}
		});
	}
}
