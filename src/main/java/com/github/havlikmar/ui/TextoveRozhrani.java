package com.github.havlikmar.ui;

import com.github.havlikmar.logika.Hra;

/**
 * Class TextoveRozhrani
 *
 * Zkušební třída pro testování zda funguje logika hry. Nepoužívá se pro GUI
 *
 * @author     Martin Havlík
 * @version    21.3.2018
 */
public class TextoveRozhrani {
	 private Hra hra;
	 
	    /**
	     * Konstruktor pro vytvoření hry.
	     */
	    public TextoveRozhrani() {
	        hra = new Hra();
	    }
	    
	    public void hraj() {
	      hra.vyberSlovo();
	      	
	    }
}
