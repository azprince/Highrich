package application;
	
import UI.StartScene;
import controller.Time;
import UI.GameScene;
import UI.Images;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application {
	
	private static Stage stage;
	private static Scene startScene;
	private static Scene gameScene;
	
	public void start(Stage primaryStage) {
		stage = primaryStage;
		startScene = new StartScene();
		stage.setTitle("HighRich");
		stage.setScene(startScene);
		stage.getIcons().add(Images.ICON);
		stage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static void gameScene() {
		gameScene = new GameScene();
		stage.setScene(gameScene);
		new Time();
	}
}
