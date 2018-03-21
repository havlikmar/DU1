package com.github.havlikmar.logika;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Hra {
	private boolean konecHry = false;
	private List<Slovo> slovicka;
	private Integer dobre = 0;
	private Integer spatne = 0;
	private String hadane;

	public Hra() {
		slovicka = new ArrayList<Slovo>();
		Slovo elephant = new Slovo("elephant", "slon");
		slovicka.add(elephant);
		Slovo dog = new Slovo("dog", "pes");
		slovicka.add(dog);
	}
	
    public boolean konecHry() {
        return konecHry;
    }
    
    public void vyberSlovo() {
    	Random nahodneSlovo = new Random();
    	hadane = slovicka.get(nahodneSlovo.nextInt(slovicka.size())).getNazevAJ();
    }
    
    public Integer getSpatne() {
        return spatne;
    }
    
    public Integer getDobre() {
        return dobre;
    }
    
    public boolean uhodnuto(String slovo) {
    	if (slovo.equals(hadane)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public void setScore(String slovo) {
    	if (uhodnuto(slovo)) {
    		dobre = dobre + 1;
    	}
    	else
    	{
    		spatne = spatne + 1;
    	}
    }
}
