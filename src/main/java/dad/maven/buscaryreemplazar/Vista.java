package dad.maven.buscaryreemplazar;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class Vista extends BorderPane {

	private Button btBuscar, btReemplazar, btReemplazarTodo, btCerrar, btAyuda;
	private TextField tfBuscar, tfReemplazar;
	private CheckBox chMayus, chBuscarAtras, chExpresionRegular, chResaltarResultados;

	public Vista() {
		super();

		GridPane centro = new GridPane();
		centro.setPadding(new Insets(5));
		centro.setHgap(5);
		centro.setVgap(5);
		

		//TextFields
		Label lbBuscar = new Label("Buscar:");
		Label lbReemplazar = new Label("Reemplazar con:");

		tfBuscar = new TextField();
		tfReemplazar = new TextField();

		centro.addRow(0, lbBuscar, tfBuscar);
		centro.addRow(1, lbReemplazar, tfReemplazar);

		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints(), };

		cols[0].setHalignment(HPos.LEFT);
		
		centro.getColumnConstraints().setAll(cols);   // \
		cols[1].setHgrow(Priority.ALWAYS);            //  }Alargamiento
		cols[1].setFillWidth(true);					  // /

		
		//Checkboxes centro
		chMayus = new CheckBox();
		chBuscarAtras = new CheckBox();
		chExpresionRegular = new CheckBox();
		chResaltarResultados = new CheckBox();

		GridPane pCheckbox = new GridPane();
		pCheckbox.setPadding(new Insets(5, 5, 0, 0));
		pCheckbox.setHgap(10);
		pCheckbox.setVgap(5);

		pCheckbox.addRow(0, chMayus, new Label("Mayúsculas y minúsculas"), chBuscarAtras,
				new Label("Buscar hacia atrás"));
		pCheckbox.addRow(1, chExpresionRegular, new Label("Expresión regular"), chResaltarResultados,
				new Label("Resaltar resultados"));

		centro.add(pCheckbox, 1, 2);

		
		//Botones derecha
		btBuscar = new Button("Buscar");
		btReemplazar = new Button("Reemplazar");
		btReemplazarTodo = new Button("Reemplazar todo");
		btCerrar = new Button("Cerrar");
		btAyuda = new Button("Ayuda");

		btBuscar.setMaxWidth(Double.MAX_VALUE);
		btReemplazar.setMaxWidth(Double.MAX_VALUE);
		btReemplazarTodo.setMaxWidth(Double.MAX_VALUE);
		btCerrar.setMaxWidth(Double.MAX_VALUE);
		btAyuda.setMaxWidth(Double.MAX_VALUE);

		VBox derecha = new VBox();
		derecha.getChildren().addAll(btBuscar, btReemplazar, btReemplazarTodo, btCerrar, btAyuda);
		derecha.setSpacing(5);
		derecha.setPadding(new Insets(5, 10, 0, 10));

		this.setCenter(centro);
		this.setRight(derecha);

	}

	public Button getBtBuscar() {
		return btBuscar;
	}

	public void setBtBuscar(Button btBuscar) {
		this.btBuscar = btBuscar;
	}

	public Button getBtReemplazar() {
		return btReemplazar;
	}

	public void setBtReemplazar(Button btReemplazar) {
		this.btReemplazar = btReemplazar;
	}

	public Button getBtReemplazarTodo() {
		return btReemplazarTodo;
	}

	public void setBtReemplazarTodo(Button btReemplazarTodo) {
		this.btReemplazarTodo = btReemplazarTodo;
	}

	public Button getBtCerrar() {
		return btCerrar;
	}

	public void setBtCerrar(Button btCerrar) {
		this.btCerrar = btCerrar;
	}

	public Button getBtAyuda() {
		return btAyuda;
	}

	public void setBtAyuda(Button btAyuda) {
		this.btAyuda = btAyuda;
	}

	public TextField getTfBuscar() {
		return tfBuscar;
	}

	public void setTfBuscar(TextField tfBuscar) {
		this.tfBuscar = tfBuscar;
	}

	public TextField getTfReemplazar() {
		return tfReemplazar;
	}

	public void setTfReemplazar(TextField tfReemplazar) {
		this.tfReemplazar = tfReemplazar;
	}

	public CheckBox getCbMayus() {
		return chMayus;
	}

	public void setCbMayus(CheckBox cbMayus) {
		this.chMayus = cbMayus;
	}

	public CheckBox getCbBuscarAtras() {
		return chBuscarAtras;
	}

	public void setCbBuscarAtras(CheckBox cbBuscarAtras) {
		this.chBuscarAtras = cbBuscarAtras;
	}

	public CheckBox getCbExpresionRegular() {
		return chExpresionRegular;
	}

	public void setCbExpresionRegular(CheckBox cbExpresionRegular) {
		this.chExpresionRegular = cbExpresionRegular;
	}

	public CheckBox getCbResaltarResultados() {
		return chResaltarResultados;
	}

	public void setCbResaltarResultados(CheckBox cbResaltarResultados) {
		this.chResaltarResultados = cbResaltarResultados;
	}

}