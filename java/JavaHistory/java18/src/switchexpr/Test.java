package switchexpr;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	interface Node {
		public int eval();
	}

	static class IntNode implements Node {
		int value;

		public int eval() {
			return value;
		}
	}

	static class NegNode implements Node {
		Node node;

		public int eval() {
			return -node.eval();
		}
	}

	static class MulNode implements Node {
		Node left, right;

		public int eval() {
			return left.eval() * right.eval();
		}
	}

	static class AddNode implements Node {
		Node left, right;

		public int eval() {
			return left.eval() + right.eval();
		}
	}

//	static int eval(Node n) {
//	    return switch(n) {
//	        case IntNode(var i) -> i;
//	        case NegNode(var n) -> -eval(n);
//	        case AddNode(var left, var right) -> eval(left) + eval(right);
//	        case MulNode(var left, var right) -> eval(left) * eval(right);
//	    };
//	}

}
