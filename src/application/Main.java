package application;

import java.io.File;
import java.util.Observable;
import java.util.Scanner;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {

	static ObservableList<String> names = FXCollections.observableArrayList();

	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("GUI Sample");
		BorderPane borderPane = new BorderPane();
		GridPane gPane = new GridPane();
		gPane.setGridLinesVisible(true);
		borderPane.setCenter(gPane);
		Scene scene = new Scene(borderPane, 1600, 900, Color.DARKGRAY);

		Label label1 = new Label();
		label1.setMinHeight(25);
		label1.setText("Team1: ");

		Label label2 = new Label();
		label2.setMinHeight(25);
		label2.setText("Team2: ");

		Label label3 = new Label();
		label3.setMinHeight(25);
		label3.setText("Team3: ");

		Label label4 = new Label();
		label4.setMinHeight(25);
		label4.setText("Team4: ");

		Label empty1 = new Label();
		empty1.setMinHeight(200);
		empty1.setMinWidth(100);
		empty1.setText(" ");

		Label empty2 = new Label();
		empty2.setMinHeight(200);
		empty2.setMinWidth(100);
		empty2.setText(" ");

		Button submit1 = new Button();
		submit1.setText("Submit");

		Button submit2 = new Button();
		submit2.setText("Submit");

		//Event Handle

		TextField input1 = new TextField();
		input1.setMaxHeight(20); input1.setMaxWidth(200);
		input1.setPromptText("Score 1");
		input1.setFocusTraversable(false);

		TextField input2 = new TextField();
		input2.setMaxHeight(20); input2.setMaxWidth(200);
		input2.setPromptText("Team 2");
		input2.setFocusTraversable(false);

		TextField input3 = new TextField();
		input3.setMaxHeight(20); input3.setMaxWidth(200);
		input3.setPromptText("Score 3");
		input3.setFocusTraversable(false);

		TextField input4 = new TextField();
		input4.setMaxHeight(20); input4.setMaxWidth(200);
		input4.setPromptText("Team 4");
		input4.setFocusTraversable(false);


		gPane.add(label1, 0, 0);
		gPane.add(label2,0, 2);
		gPane.add(label3,0, 6);
		gPane.add(label4, 0, 8);

		gPane.add(empty1, 0, 3, 2, 3);
		gPane.add(empty2, 2, 0,1, 8);


		gPane.add(submit2,0, 7);
		gPane.add(submit1,0, 1);

		gPane.add(input1, 1, 0);
		gPane.add(input2, 1, 2);
		gPane.add(input3, 1, 6);
		gPane.add(input4, 1, 8);


		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {

		launch(args);
//		String fileName = "file.txt";
//		File inputFile = null;
//		Scanner sc = null;

//		try {
//			inputFile = new File(fileName);
//			sc = new Scanner(inputFile);
//			while(sc.hasNextLine()) {
//				String name = sc.nextLine();
//				names.add(name);
//			}
//			sc.close();
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			System.exit(-1);
//		}

//		launch(args);
	}
}