package com.github.havlikmar.DU1.logika;

import javafx.scene.control.Tooltip;

public class Slovo {
	private String nazevAJ; 
	private String nazevCJ; 
	
	public Slovo(String nazevAJ, String nazevCJ){
		this.nazevAJ = nazevAJ;
		this.nazevCJ = nazevCJ;
	}
	
	public String getNazevAJ() {
		return nazevAJ;
	}
	
	public String getNazevCJ() {
		return nazevCJ;
	}
}
