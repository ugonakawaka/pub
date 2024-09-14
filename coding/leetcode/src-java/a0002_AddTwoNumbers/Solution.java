package a0002_AddTwoNumbers;

import java.math.BigInteger;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Solution {

	public static void main(String[] args) {
		
		var func2 = (BiFunction<Integer, ListNode, ListNode>) (i, n) -> {
			return new ListNode(i, n);
		};
		
		var func3 = (Function<Integer[], ListNode>)(is) -> {
			
			var ln = (ListNode)null;
			for(int i=0;i<is.length;i++) {
				ln = func2.apply(is[i],ln);
			}
			return ln;
		};
		
		var solution = new Solution();
		{
			var l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
			var l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

			System.out.println(l1);
			System.out.println(l2);
			var l3 = solution.addTwoNumbers(l1, l2);
			System.out.println(l3);

		}
		
		{
			

			var l1 = func3.apply(new Integer[]{9,9,9,9,9,9,9});
			var l2 = func3.apply(new Integer[]{9,9,9,9});
			System.out.println(l1);
			System.out.println(l2);
			var l3 = solution.addTwoNumbers(l1, l2);
			System.out.println(l3);

		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		var func1 = (Function<ListNode, BigInteger>) (ln) -> {
			var sb = new StringBuilder();

			do {
				sb.append(ln.val);
				ln = ln.next;

			} while (ln != null);
			return new BigInteger(sb.reverse().toString());

		};

		BigInteger l3 = func1.apply(l1).add(func1.apply(l2));

		var s = "" + l3;

		var func2 = (BiFunction<Integer, ListNode, ListNode>) (i, n) -> {
			return new ListNode(i, n);
		};

		var l4 = (ListNode)null;
		for(int i=0;i<s.length();i++) {
			l4 = func2.apply(Integer.parseInt("" + s.charAt(i)), l4);
		}
		

		return l4;
	}
}
