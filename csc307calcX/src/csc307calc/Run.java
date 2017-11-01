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

public class Run extends Application{
	Output output;
	Number button0;
	Number button1;
	Number button2;
	Number button3;
	Number button4;
	Number button5;
	Number button6;
	Number button7;
	Number button8;
	Number button9;
	Plus buttonPlus;
	Minus buttonMinus;
	Divide buttonDivide;
	Mult buttonMult;
	Equals buttonEquals;

	int num = 0;
	public static void main(String[] args){
		launch(args);
	}
	public void start(Stage stage) throws Exception{
		stage.setTitle("my first stage title");
		output = new Output();
		VBox root = new VBox();
		HBox top = new HBox();
		HBox layer1 = new HBox();
		HBox layer2 = new HBox();
		HBox layer3 = new HBox();
		HBox layer4 = new HBox();
		button0 = new Number(0,output); 
		button1 = new Number(1,output);
		button2 = new Number(2,output);
		button3 = new Number(3,output);
		button4 = new Number(4,output);
		button5 = new Number(5,output);
		button6 = new Number(6,output);
		button7 = new Number(7,output);
		button8 = new Number(8,output);
		button9 = new Number(9,output);
		buttonPlus = new Plus(output);
		buttonMinus = new Minus(output);
		buttonDivide = new Divide(output);
		buttonMult = new Mult(output);
		buttonEquals = new Equals(output);
		top.getChildren().add(output.output);
		layer1.getChildren().addAll(button1.numButton,button2.numButton,button3.numButton,buttonPlus.op);
		layer2.getChildren().addAll(button4.numButton,button5.numButton,button6.numButton,buttonMinus.op);
		layer3.getChildren().addAll(button7.numButton,button8.numButton,button9.numButton,buttonMult.op);
		layer4.getChildren().addAll(button0.numButton,buttonEquals.eq,buttonDivide.op);
		root.getChildren().addAll(top,layer1,layer2,layer3,layer4);
		Scene scene = new Scene(root,400,400);
		stage.setScene(scene);
		stage.show();
		
	}
}

