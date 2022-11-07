package aaa;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Main {

	static class Consts {
		public static final String WORK_DIR = "WORK_DIR";
		public static final String $WORK_DIR = "${WORK_DIR}";
	}

	public static void main(String[] args) {
		a();
	}

	static void a() {

		final var APPLICATION_NAME = "dummy";
		final var preferences = Preferences.userRoot().node("/" + APPLICATION_NAME);

		var frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// frame.setLocationRelativeTo(null);

		final var splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		frame.getContentPane().add(splitPane);
		frame.setSize(500, 500);

		{ // top

			var panel = new JPanel();
			var tabbedPane = new JTabbedPane();

			panel.setLayout(new BorderLayout());
			panel.add(field("workdir", preferences), BorderLayout.NORTH);
			panel.add(tabbedPane, BorderLayout.CENTER);
			panel.add(buttons(""), BorderLayout.SOUTH);
			splitPane.add(panel, JSplitPane.TOP);
			{ // tab
				var list = new ArrayList<Row>();
				list.add(new Row(label("a1"), textField("b1"), button("c1")));
				list.add(new Row(label("a1"), textField("b1"), button("c1")));
				list.add(new Row(label("aaaaaaa"), textField("b1"), button("btnnnnnnn1")));
				tabbedPane.addTab("1", makeTab(list));
			}
			{ // tab
				tabbedPane.addTab("2", makeTab(""));
			}
			{ // tab
				tabbedPane.addTab("3", makeTab(""));
			}
		}
		{ // bottom

			var textArea = new JTextArea(1000, 500);
			var scrollPane = new JScrollPane(textArea);
			textArea.setPreferredSize(new Dimension(500, 500));
			System.setOut(new PrintStreamCapturer(textArea, System.out));
			System.setErr(new PrintStreamCapturer(textArea, System.err, "[ERROR] "));

			splitPane.add(scrollPane, JSplitPane.BOTTOM);
		}

		new Logic().dummy();

		frame.validate();
		frame.setVisible(true);
	}

	// ==========================
	// ==========================
	// ==========================

	static void action() {

	}

	static JComponent field(String name, Preferences preferences) {
		var label1 = new JLabel("WORKING DIR");
		final var tf1 = new JTextField();
		{
			tf1.setName(name);
			var text = preferences.get(name, "");
			tf1.setText(text);
			tf1.getDocument().addDocumentListener((SimpleDocumentListener) e -> {

				preferences.put(tf1.getName(), tf1.getText());
				// System.out.println(e);
			});
		}
		var panel = new JPanel();

		var layout = new GroupLayout(panel);
		panel.setLayout(layout);
		GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();

		hGroup.addGroup(layout.createParallelGroup().addComponent(label1));
		hGroup.addGroup(layout.createParallelGroup().addComponent(tf1));
		layout.setHorizontalGroup(hGroup);
		GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();

		vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(label1).addComponent(tf1));
		layout.setVerticalGroup(vGroup);
		return panel;
	}

	static JComponent buttons(String name) {
		JComponent panel = new JPanel();
		var btn1 = new JButton("実行");
		var btn2 = new JButton("ログクリア");
		panel.add(btn1);
		panel.add(btn2);
		return panel;
	}

	static JComponent makeTab(List<Row> rows) {

		var panel = new JPanel();
		var layout = new GroupLayout(panel);
		panel.setLayout(layout);

		// Turn on automatically adding gaps between components
		layout.setAutoCreateGaps(true);

		// Turn on automatically creating gaps between components that touch
		// the edge of the container and the container.
		layout.setAutoCreateContainerGaps(true);

		// Create a sequential group for the horizontal axis.

		GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
		// Create a sequential group for the vertical axis.
		GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();

		{// vgroup
			rows.stream().forEach(r -> {
				vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(r.label)
						.addComponent(r.textField).addComponent(r.button));
			});
		}

		{ // hgroup
			var glabel = layout.createParallelGroup();
			var gtf = layout.createParallelGroup();
			var gbtn = layout.createParallelGroup();
			rows.stream().forEach(row -> {
				glabel.addComponent(row.label);
				gtf.addComponent(row.textField);
				gbtn.addComponent(row.button);
			});
			hGroup.addGroup(glabel);
			hGroup.addGroup(gtf);
			hGroup.addGroup(gbtn);
		}

		layout.setHorizontalGroup(hGroup);
		layout.setVerticalGroup(vGroup);
		return panel;
	}

	static JComponent makeTab(String name) {
		var label1 = new JLabel("aaaaa");
		var label2 = new JLabel("bbbbbssssssssss");
		var tf1 = new JTextField();
		var tf2 = new JTextField();
		var btn1 = new JButton("button1");
		var btn2 = new JButton("buttonffff1");

		var panel = new JPanel();
		var layout = new GroupLayout(panel);
		panel.setLayout(layout);

		// Turn on automatically adding gaps between components
		layout.setAutoCreateGaps(true);

		// Turn on automatically creating gaps between components that touch
		// the edge of the container and the container.
		layout.setAutoCreateContainerGaps(true);

		// Create a sequential group for the horizontal axis.

		GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();

		hGroup.addGroup(layout.createParallelGroup().addComponent(label1).addComponent(label2));
		hGroup.addGroup(layout.createParallelGroup().addComponent(tf1).addComponent(tf2));
		hGroup.addGroup(layout.createParallelGroup().addComponent(btn1).addComponent(btn2));

		layout.setHorizontalGroup(hGroup);

		// Create a sequential group for the vertical axis.
		GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();

		vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(label1).addComponent(tf1)
				.addComponent(btn1));
		vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(label2).addComponent(tf2)
				.addComponent(btn2));

		layout.setVerticalGroup(vGroup);

		return panel;
	}

	// ==========================
	// ==========================
	// ==========================

	public static JLabel label(String text) {
		return new JLabel(text);
	}

	public static JTextField textField(String name) {
		var textFiled = new JTextField();
		textFiled.setName(name);
		return textFiled;
	}

	public static JButton button(String text) {
		return new JButton(text);
	}

	// ==========================
	// ==========================
	// ==========================
	/*
	 * https://stackoverflow.com/questions/12945537/how-to-set-output-stream-to-
	 * textarea
	 */
	public static class PrintStreamCapturer extends PrintStream {

		private JTextArea text;
		private boolean atLineStart;
		private String indent;

		public PrintStreamCapturer(JTextArea textArea, PrintStream capturedStream, String indent) {
			super(capturedStream);
			this.text = textArea;
			this.indent = indent;
			this.atLineStart = true;
		}

		public PrintStreamCapturer(JTextArea textArea, PrintStream capturedStream) {
			this(textArea, capturedStream, "");
		}

		private void writeToTextArea(String str) {
			if (text != null) {
				synchronized (text) {
					text.setCaretPosition(text.getDocument().getLength());
					text.append(str);
				}
			}
		}

		private void write(String str) {
			String[] s = str.split("\n", -1);
			if (s.length == 0)
				return;
			for (int i = 0; i < s.length - 1; i++) {
				writeWithPotentialIndent(s[i]);
				writeWithPotentialIndent("\n");
				atLineStart = true;
			}
			String last = s[s.length - 1];
			if (!last.equals("")) {
				writeWithPotentialIndent(last);
			}
		}

		private void writeWithPotentialIndent(String s) {
			if (atLineStart) {
				writeToTextArea(indent + s);
				atLineStart = false;
			} else {
				writeToTextArea(s);
			}
		}

		private void newLine() {
			write("\n");
		}

		@Override
		public void print(boolean b) {
			synchronized (this) {
				super.print(b);
				write(String.valueOf(b));
			}
		}

		@Override
		public void print(char c) {
			synchronized (this) {
				super.print(c);
				write(String.valueOf(c));
			}
		}

		@Override
		public void print(char[] s) {
			synchronized (this) {
				super.print(s);
				write(String.valueOf(s));
			}
		}

		@Override
		public void print(double d) {
			synchronized (this) {
				super.print(d);
				write(String.valueOf(d));
			}
		}

		@Override
		public void print(float f) {
			synchronized (this) {
				super.print(f);
				write(String.valueOf(f));
			}
		}

		@Override
		public void print(int i) {
			synchronized (this) {
				super.print(i);
				write(String.valueOf(i));
			}
		}

		@Override
		public void print(long l) {
			synchronized (this) {
				super.print(l);
				write(String.valueOf(l));
			}
		}

		@Override
		public void print(Object o) {
			synchronized (this) {
				super.print(o);
				write(String.valueOf(o));
			}
		}

		@Override
		public void print(String s) {
			synchronized (this) {
				super.print(s);
				if (s == null) {
					write("null");
				} else {
					write(s);
				}
			}
		}

		@Override
		public void println() {
			synchronized (this) {
				newLine();
				super.println();
			}
		}

		@Override
		public void println(boolean x) {
			synchronized (this) {
				print(x);
				newLine();
				super.println();
			}
		}

		@Override
		public void println(char x) {
			synchronized (this) {
				print(x);
				newLine();
				super.println();
			}
		}

		@Override
		public void println(int x) {
			synchronized (this) {
				print(x);
				newLine();
				super.println();
			}
		}

		@Override
		public void println(long x) {
			synchronized (this) {
				print(x);
				newLine();
				super.println();
			}
		}

		@Override
		public void println(float x) {
			synchronized (this) {
				print(x);
				newLine();
				super.println();
			}
		}

		@Override
		public void println(double x) {
			synchronized (this) {
				print(x);
				newLine();
				super.println();
			}
		}

		@Override
		public void println(char x[]) {
			synchronized (this) {
				print(x);
				newLine();
				super.println();
			}
		}

		@Override
		public void println(String x) {
			synchronized (this) {
				print(x);
				newLine();
				super.println();
			}
		}

		@Override
		public void println(Object x) {
			String s = String.valueOf(x);
			synchronized (this) {
				print(s);
				newLine();
				super.println();
			}
		}
	}

	@FunctionalInterface
	public interface SimpleDocumentListener extends DocumentListener {
		/*
		 * https://stackoverflow.com/questions/3953208/value-change-listener-to-
		 * jtextfield
		 */

		void update(DocumentEvent e);

		@Override
		default void insertUpdate(DocumentEvent e) {
			update(e);
		}

		@Override
		default void removeUpdate(DocumentEvent e) {
			update(e);
		}

		@Override
		default void changedUpdate(DocumentEvent e) {
			update(e);
		}
	}

	static record a(double length, double width) {

	}

	public static record Row(JLabel label, JTextField textField, JButton button) {

	}
}
