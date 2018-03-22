package com.github.havlikmar.DU1.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.github.havlikmar.DU1.logika.Hra;
import com.github.havlikmar.DU1.logika.Slovo;
import com.github.havlikmar.DU1.main.Start;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class Controller {
	private Map<String, Slovo> tlacitka;
	private Hra hra;
	private List<Slovo> slovicka;
	private boolean hadame = false;
	private Start start;
	@FXML private Button  	tlacitko1;
	@FXML private Button  	tlacitko2;
	@FXML private Button  	tlacitko3;
	@FXML private Button  	tlacitko4;
	@FXML private Button  	tlacitko5;
	@FXML private Button  	tlacitko6;
	@FXML private Button  	hadej;
	@FXML private Tooltip  	tooltip1;
	@FXML private Tooltip  	tooltip2;
	@FXML private Tooltip  	tooltip3;
	@FXML private Tooltip  	tooltip4;
	@FXML private Tooltip  	tooltip5;
	@FXML private Tooltip  	tooltip6;
	@FXML private TextArea	textVystup;
	
	public void odesliPrikaz() {
		textVystup.clear();
		String odpoved = 	"Správně uhadnuté: " + hra.getDobre() + "\n" +
							"Špatně uhadnuté: " + hra.getSpatne();
		textVystup.appendText(odpoved);
	}
	
	public void inicializuj(Hra hra, Start start) {
		this.hra = hra;
		this.start = start;
		tlacitka = new HashMap<String, Slovo>();
		slovicka = hra.getSlovicka();
		
		tlacitka.put(tlacitko1.getId(), slovicka.get(0));
		tooltip1.setText(tlacitka.get("tlacitko1").getNazevCJ());
		
		tlacitka.put(tlacitko2.getId(), slovicka.get(1));
		tooltip2.setText(tlacitka.get("tlacitko2").getNazevCJ());
		
		tlacitka.put(tlacitko3.getId(), slovicka.get(2));
		tooltip3.setText(tlacitka.get("tlacitko3").getNazevCJ());
		
		tlacitka.put(tlacitko4.getId(), slovicka.get(3));
		tooltip4.setText(tlacitka.get("tlacitko4").getNazevCJ());
		
		tlacitka.put(tlacitko5.getId(), slovicka.get(4));
		tooltip5.setText(tlacitka.get("tlacitko5").getNazevCJ());
		
		tlacitka.put(tlacitko6.getId(), slovicka.get(5));
		tooltip6.setText(tlacitka.get("tlacitko6").getNazevCJ());
		
	}
	
	@FXML public void klikHadej(ActionEvent arg0) {
		if (!hadame) {
			hra.vyberSlovo();
			String slovo = hra.getHadane();
			hadej.setText(slovo);
			hadame = true;
		}
	}
	
	@FXML public void hadej(ActionEvent arg0) {
		if (hadame) {
			String hadane = ((Node) arg0.getTarget()).getId();
			hadane = tlacitka.get(hadane).getNazevAJ();
			if (hadej.getText().equals(hadane)) {
				hra.setScore(hadane);
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Výsledek hádání");
				alert.setHeaderText(null);
				alert.setContentText("Hádané slovo je správné");
				alert.showAndWait();
			}
			else 
			{	
				hra.setScore(hadane);
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Výsledek hádání");
				alert.setHeaderText("Hádané slovo je špatně");
				alert.showAndWait();
			}
		hadame = false;
		hadej.setText("hádej");
		this.odesliPrikaz();
		}
	}
}
