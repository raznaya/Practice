package lv.sonya.matchbox;

import java.util.Collection;
import java.util.HashSet;
import java.util.Stack;

public class SimpleMatchbox implements Matchbox {

	private boolean isOpen;
	int leftPercent;
	private Stack<Match> matches;
	private int matchCount = 30;
	private boolean matchIsTaken = false;


	public SimpleMatchbox() {
		this.matches = new Stack<>();
		for (int i = 0; i < matchCount; i++) {
			matches.add(new Match());
		}
		this.leftPercent = 100;
		this.isOpen = false;
	}

	@Override
	public void open() {
		isOpen = true;
		matchIsTaken = false;
	}

	@Override
	public void close() {
		isOpen = false;

	}

	@Override
	public void putMatches(Collection<Match> matches) {
		checkStatus();
		matchIsTaken = false;
		this.matches.addAll(matches);
	}

	@Override
	public Match takeMatch() {
		checkStatus();
		matchIsTaken();
		return matches.pop();
	}

	@Override
	public Collection<Match> takeMatches(int count) {
		Collection<Match> temporary = new HashSet<>();
		int max = countMatches() > count ? count : countMatches();
		for (int i = 0; i < max; i++) {
			temporary.add(takeMatch());
		}
		matchIsTaken();
		return temporary;
	}

	@Override
	public boolean fireMatch(Match match) {
		if (useSandpaper() == 0 ) {
			throw new IllegalStateException("Sandpaper is used, you can`t fire a match!");
		} else if(matchIsTaken()== false) {
			throw new IllegalStateException("Match isn`t taken yet!");
		} else {
			match.setFired(true);
			useSandpaper();
			return true;
		}
	}

	@Override
	public int countMatches() {
		int count = matches.size();
		return count;
	}

	public void checkStatus() {
		if (isOpen == false) {
			throw new IllegalStateException("Matchbox is closed");
		}
	}

	@Override
	public int useSandpaper() {
		int leftMatches = matchCount - 1;
		int onePercent = matchCount / 100;
		leftPercent = leftMatches / onePercent;
		System.out.println("Feel free to use +" + leftPercent + " % of sandpaper" );
		return leftPercent;
	}
	
	@Override
	public boolean matchIsTaken(){
		return matchIsTaken = true;
	}
}
