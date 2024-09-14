package a0021_MergeTwoSortedLists;

public class ListNode {

	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	@Override
	public String toString() {
		var sb = new StringBuilder();

		var ln = this;
		do {
			sb.append(ln.val);
			ln = ln.next;
			if (ln != null)
				sb.append(",");
		} while (ln != null);

		return sb.toString();
	}
}