package lv.sonya.matchbox;

import java.util.ArrayList;
import lv.sonya.matchbox.Match;

public class Matchbox {

	boolean isOpen;
	int sandpaperUseInPercent = 100;
	ArrayList<Match> matchbox = new ArrayList<>();
	Match match = new Match();
	
	
	public void createMatchbox(){
	for(int i = 0; i < Match.matchCount; i++){ 
        matchbox.add(new Match()); 
        } 
	}

	public void openMatchBox() {
		isOpen = true;
	}

	public void closeMatchBox() {
		isOpen = false;
	}

	public void addMatches(int count) {
		if(matchbox.size()+ count > Match.matchCount){
			throw new IllegalArgumentException("Too many matches");
		} else {
		for (int i = 0; i < count; i++) {
			matchbox.add(match);
		}
		}
	}
	
	public void removeMatches(int count){
		for (int i = 0; i < count; i++) {
			matchbox.remove(1);
		}
	}
	
	public int showMatchbox(){
		int leftMatches = matchbox.size();
		return leftMatches;
	}
}
