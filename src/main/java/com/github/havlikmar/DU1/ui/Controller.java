package com.github.havlikmar.DU1.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.github.havlikmar.DU1.logika.Hra;
import com.github.havlikmar.DU1.logika.Slovo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;

public class Controller {
	private Map<Button, Slovo> tlacitka;
	private Hra hra;
	private List<Slovo> slovicka;
	@FXML private Button  	tlacitko1;
	@FXML private Button  	tlacitko2;
	@FXML private Button  	tlacitko3;
	@FXML private Button  	tlacitko4;
	@FXML private Button  	tlacitko5;
	@FXML private Button  	tlacitko6;
	@FXML private Tooltip  	tooltip1;
	@FXML private Tooltip  	tooltip2;
	@FXML private Tooltip  	tooltip3;
	@FXML private Tooltip  	tooltip4;
	@FXML private Tooltip  	tooltip5;
	@FXML private Tooltip  	tooltip6;
	

	public void inicializuj(Hra hra) {
		this.hra = hra;
		tlacitka = new HashMap<Button, Slovo>();
		slovicka = hra.getSlovicka();
		
		tlacitka.put(tlacitko1, slovicka.get(0));
		tooltip1.setText(tlacitka.get(tlacitko1).getNazevCJ());
		
		tlacitka.put(tlacitko2, slovicka.get(1));
		tooltip2.setText(tlacitka.get(tlacitko2).getNazevCJ());
		
		tlacitka.put(tlacitko3, slovicka.get(2));
		tooltip3.setText(tlacitka.get(tlacitko3).getNazevCJ());
		
		tlacitka.put(tlacitko4, slovicka.get(3));
		tooltip4.setText(tlacitka.get(tlacitko4).getNazevCJ());
		
		tlacitka.put(tlacitko5, slovicka.get(4));
		tooltip5.setText(tlacitka.get(tlacitko5).getNazevCJ());
		
		tlacitka.put(tlacitko6, slovicka.get(5));
		tooltip6.setText(tlacitka.get(tlacitko6).getNazevCJ());
		
	}
}
