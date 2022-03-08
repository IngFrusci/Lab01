package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	List<String>elencoParole = new LinkedList<String>();
	public Parole() {

	}
	
	public void addParola(String p) {
		if(p!=null) {
		elencoParole.add(p);
		}
	}
	
	public List<String> getElenco() {
		Collections.sort(elencoParole, new ComparatoreLista());
		return elencoParole;
	}
	
	public void reset() {
		elencoParole.clear();
	}

}
