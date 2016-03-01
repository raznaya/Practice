package lv.sonya.matchbox;

import java.util.Collection;
import java.util.HashSet;
import java.util.Stack;

public class SimpleMatchbox implements Matchbox {

	private boolean isOpen;
	private int sandpaperUseInPercent;
	private Stack<Match> matches;
	private int matchCount = 30;

	public SimpleMatchbox() {
		this.matches = new Stack<>();
		for (int i = 0; i < matchCount; i++) {
			matches.add(new Match());
		}
		this.sandpaperUseInPercent = 100;
		this.isOpen = false;
	}

	@Override
	public void open() {
		isOpen = true;

	}

	@Override
	public void close() {
		isOpen = false;

	}

	@Override
	public void putMatches(Collection<Match> matches) {
		checkStatus();
		this.matches.addAll(matches);
	}

	@Override
	public Match takeMatch() {
		checkStatus();
		return matches.pop();
	}

	@Override
	public Collection<Match> takeMatches(int count) {
		Collection<Match> temporary = new HashSet<>();
		int max = countMatches() > count ? count : countMatches();
		for (int i = 0; i < max; i++) {
			temporary.add(takeMatch());
		}
		return temporary;
	}

	@Override
	public boolean fireMatch(Match match) {
		if (useSandpaper() == 0) {
			throw new IllegalStateException("Sandpaper is used, you can`t fire a match!");
		} else {
			match.setFired(true);
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
		return matchCount - matchCount / sandpaperUseInPercent;
	}
}
