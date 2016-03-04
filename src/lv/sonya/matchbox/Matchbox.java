package lv.sonya.matchbox;

import java.util.Collection;

public interface Matchbox {

	public void open();

	public void close();

	public void putMatches(Collection<Match> matches);

	public Match takeMatch();

	public Collection<Match> takeMatches(int count);

	public boolean fireMatch(Match match);

	public int countMatches();

	public void useSandpaper();
	
	public boolean matchIsTaken();
	
}
