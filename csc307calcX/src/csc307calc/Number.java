
package csc307calc;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Number {
	Button numButton;
	public Number(int symbol, Output output){
		numButton = new Button("" + symbol);
		numButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println(""+symbol);
				output.num *= 10;
				output.num += symbol;
				output.refresh();
			}
		});
	}
	
}
