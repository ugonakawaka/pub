package a0021_MergeTwoSortedLists;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.BiFunction;
import java.util.function.Function;

class Solution {

	public static void main(String[] args) {

	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		var f = (Function<ListNode, LinkedList<Integer>>) (node) -> {

			var l = new LinkedList<Integer>();

			if (node == null)
				return l;
			var n = node;
			do {
				l.add(n.val);
			} while ((n = n.next) != null);

			return l;
		};

		var l = f.apply(list1);
		l.addAll(f.apply(list2));

		Collections.sort(l, Comparator.reverseOrder());

		var func2 = (BiFunction<Integer, ListNode, ListNode>) (i, n) -> {
			return new ListNode(i, n);
		};

		var l4 = (ListNode) null;

		for (int i = 0; i < l.size(); i++) {
			l4 = func2.apply(l.get(i), l4);
		}

		return l4;
	}
	
	// 遅かった...
	public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {

		var f = (Function<ListNode, LinkedList<Integer>>) (node) -> {

			var l = new LinkedList<Integer>();

			if (node == null)
				return l;
			var n = node;
			do {
				l.add(n.val);
			} while ((n = n.next) != null);

			return l;
		};

		var l = f.apply(list1);
		l.addAll(f.apply(list2));

		Collections.sort(l, Comparator.reverseOrder());

		var func2 = (BiFunction<Integer, ListNode, ListNode>) (i, n) -> {
			return new ListNode(i, n);
		};

		var l4 = (ListNode) null;

		for (int i = 0; i < l.size(); i++) {
			l4 = func2.apply(l.get(i), l4);
		}

		return l4;
	}
}