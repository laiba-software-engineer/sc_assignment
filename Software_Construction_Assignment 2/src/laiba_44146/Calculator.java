package laiba_44146;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Calculator extends Application{

	Stage stage;
	Scene scene;
	
	String value[] = new String[100];
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage st) throws Exception {
		
		stage = st;
		
		stage.setTitle("Software Construction Assignment 2");
		
	
		addcomponents();
		
		
	}
		
	private void addcomponents(){
		
		
		HBox h = new HBox();
		h.setPadding(new Insets (0, 5, 5, 5));
		
		Text heading = new Text("Calculator");
		heading.setFont(Font.font("SHOWCARD GOTHIC" , FontWeight.EXTRA_BOLD, 20));
		h.getChildren().add(heading);
		heading.setId("heading");
		
		GridPane gp = new GridPane();
	    
		Button b1 = new Button("1");
		b1.setPrefSize(50, 50);
		b1.setId("b1");
		b1.setStyle("-fx-background-color: yellow;");
		
		Button b2 = new Button("2");
		b2.setPrefSize(50, 50);
		b2.setId("b2");
		b2.setStyle("-fx-background-color: yellow;");
		
		Button b3 = new Button("3");
		b3.setPrefSize(50, 50);
		b3.setId("b3");
		b3.setStyle("-fx-background-color: yellow;");
		
		Button b4 = new Button("4");
		b4.setPrefSize(50, 50);
		b4.setId("b4");
		b4.setStyle("-fx-background-color: yellow;");
		
		Button b5 = new Button("5");
		b5.setPrefSize(50, 50);
		b5.setId("b5");
		b5.setStyle("-fx-background-color: yellow;");
		
		Button b6 = new Button("6");
		b6.setPrefSize(50, 50);
		b6.setId("b6");		
		b6.setStyle("-fx-background-color: yellow;");
		
		Button b7 = new Button("7");
		b7.setPrefSize(50, 50);
		b7.setId("b7");
		b7.setStyle("-fx-background-color: yellow;");
		
		Button b8 = new Button("8");
		b8.setPrefSize(50, 50);
		b8.setId("b8");
		b8.setStyle("-fx-background-color: yellow;");
		
		Button b9 = new Button("9");
		b9.setPrefSize(50, 50);
		b9.setId("b9");
		b9.setStyle("-fx-background-color: yellow;");
	
		Button bpercent = new Button("%");
		bpercent.setPrefSize(50, 50);
		bpercent.setId("bperecnt");
		bpercent.setStyle("-fx-background-color: yellow;");
		
		Button b0 = new Button("0");
		b0.setPrefSize(50, 50);
		b0.setId("b0");
		b0.setStyle("-fx-background-color: yellow;");
		
		Button bdot = new Button(".");
		bdot.setPrefSize(50, 50);
		bdot.setId("bdot");
		bdot.setStyle("-fx-background-color: yellow;");
		
		Button bsum = new Button("+");
		bsum.setPrefSize(50, 50);
		bsum.setId("bsum");
		bsum.setStyle("-fx-background-color: yellow;");
		
		Button bsub = new Button("-");
		bsub.setPrefSize(50, 50);
		bsub.setId("bsub");
		bsub.setStyle("-fx-background-color: yellow;");
		
		Button bmul = new Button("*");
		bmul.setPrefSize(50, 50);
		bmul.setId("bmul");
		bmul.setStyle("-fx-background-color: yellow;");
		
		Button bdiv = new Button("/");
		bdiv.setPrefSize(50, 50);
		bdiv.setId("bdiv");
		bdiv.setStyle("-fx-background-color: yellow;");
		
		Button bequal = new Button("=");
		bequal.setPrefSize(50, 50);
		bequal.setId("bequal");
		bequal.setStyle("-fx-background-color: rosybrown;");
		
		
		Button bbackspace = new Button("<-");
		bbackspace.setPrefSize(50, 50);
		bbackspace.setId("bbackspace");
		bbackspace.setStyle("-fx-background-color: yellow;");
		
		Button bclearAll = new Button("Clear");
		bclearAll.setPrefSize(50, 50);
		bclearAll.setId("bclearAll");
		bclearAll.setStyle("-fx-background-color: yellow;");
		
		final TextField screen = new TextField();
    	screen.setStyle("-fx-background-color: antiquewhite;");
		screen.setPrefSize(240,50);
		screen.getText();
		screen.setEditable(false);
		screen.setId("screen");
		
		
		
		HBox h1 = new HBox();
		h1.setPadding(new Insets (30, 5, 5, 5));
		h1.getChildren().add(screen);
		
		
		gp.add(b1, 0, 6);
		gp.add(b2, 1, 6);
		gp.add(b3, 2, 6);
		
		gp.add(b4, 0, 5);
		gp.add(b5, 1, 5);
		gp.add(b6, 2, 5);
		
		gp.add(b7, 0, 4);
		gp.add(b8, 1, 4);
		gp.add(b9, 2, 4);
		
		gp.add(bpercent, 0, 7);
		gp.add(b0, 1, 7);
		gp.add(bdot, 2, 7);
		
		gp.add(bequal, 3, 7);
		
		gp.add(bsum, 3, 6);
		gp.add(bsub, 3, 5);
		gp.add(bmul, 3, 4);
		gp.add(bdiv, 3, 3);
		
		gp.add(bbackspace, 2, 3);
		gp.add(bclearAll, 1, 3);
		
	   b1.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			screen.setText("1");
			
		}
	});
	   
	   b2.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			screen.setText("2");
			
		}
	});
	   
	   b3.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			screen.setText("3");
		}
	});
	   
	   b4.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			screen.setText("4");
			
		}
	});
	  
	   b5.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			screen.setText("5");
			
		}
	});
	   
	   b6.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			screen.setText("6");
			
		}
	});
	   
	   b7.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			screen.setText("7");
			
		}
	});
	   
	   b8.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			screen.setText("8");
			
		}
	});
	   
	   b9.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			screen.setText("9");
			
		}
	});
	   
	   b0.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			screen.setText("0");
			
		}
	});
	   
	   bpercent.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			screen.setText("%");
			
		}
	});
	   
	   bdot.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			screen.setText(".");
			
		}
	});
	   
	   bequal.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			screen.setText("=");
			
		}
	});
	   
	   bsum.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			screen.setText("+");
			
		}
	});
	   
	   bsub.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			screen.setText("-");
			
		}
	});
	   
	   bmul.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent arg0) {
			screen.setText("*");
			
		}
	});
	
	   bdiv.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent arg0) {
			screen.setText("/");
			
		}
	});
	   
	   bclearAll.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent arg0) {
			TextField value = screen;
				value.setText(null);
			
		}
	});
	   
	   screen.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent arg0) {
		
		
		}
	});
	   
		gp.setVgap(5);
		gp.setHgap(5);
		gp.setPadding(new Insets (80, 5, 20, 16));
		
		Group root = new Group(h, h1, gp);

		
		scene = new Scene(root, 250, 380);
		scene.setFill(Color.PINK);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}
	
	   
}

