package com.github.havlikmar.DU1.logika;

import javafx.scene.control.Tooltip;

public class Slovo {
	private String nazevAJ; 
	private String nazevCJ;
	private String obr;
	
	public Slovo(String nazevAJ, String nazevCJ, String obr){
		this.nazevAJ = nazevAJ;
		this.nazevCJ = nazevCJ;
		this.obr = obr;
	}
	
	public String getNazevAJ() {
		return nazevAJ;
	}
	
	public String getNazevCJ() {
		return nazevCJ;
	}
	
	public String getObr() {
		return obr;
	}
}
