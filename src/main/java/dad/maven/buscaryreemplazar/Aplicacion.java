package dad.maven.buscaryreemplazar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplicacion extends Application {

	private Controlador controlador = new Controlador();

	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene escena = new Scene(controlador.getView(), 530, 160);

		primaryStage.setScene(escena);
		primaryStage.setTitle("Buscar y Reemplazar");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
