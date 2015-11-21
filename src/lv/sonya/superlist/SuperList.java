package lv.sonya.superlist;

public class SuperList {

	private ListItem first;

	public void add(int value) {
		if (first == null) {
			first = new ListItem(value);
		} else {
			ListItem current = first;
			while (current.next != null) {
				current = current.next;
			}
			ListItem newItem = new ListItem(value);
			current.next = newItem;
		}
	}

	public int get(int index) {
		ListItem current = first;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.value;
	}

	public void print() {
		ListItem current = first;
		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}

	public void remove(int index) {
		ListItem current = first;
		for (int i = 0; i < (index - 1); i++) {
			current = current.next;
		}
		current.next = current.next.next;
	}
}
