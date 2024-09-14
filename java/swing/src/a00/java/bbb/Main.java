package bbb;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import aaa.Main.Row;
import base.simples.SimplePressedMouseListener;

public class Main {

	public static void main(String[] args) {
		a();
	}

	/*
	 * やはりごちゃごちゃしてきた
	 */
	static void a() {
		/*
		 * アクションとUIを分離してみたい 手続きなコードになるだろうなー
		 */

		/*
		 * ここに依存しあうオブジェクトをまとめる
		 */
		class MyComponents {
			JPanel contentPane;
			// ===

			// ===
			JList list;
			JTextArea textArea;
		}

		final var myComponents = new MyComponents();

		final var APPLICATION_NAME = "dummy";
		final var preferences = Preferences.userRoot().node("/" + APPLICATION_NAME);

		var frame = new JFrame();
		// frame.setLocationRelativeTo(null);

		final var contentPane1 = new JPanel();
		{
			contentPane1.setLayout(new BorderLayout());
			myComponents.contentPane = contentPane1;
		}
		frame.getContentPane().add(contentPane1);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		frame.setSize(500, 500);

		/*
		 * 画面の構成は上、中、下で、上に各種情報、真ん中にリストテキストArea、下にボタン類
		 */
		{

			{ // 上
				var row1 = new Row(new JLabel("1"), new JTextField(), new JButton("dummy"));
				var row2 = new Row(new JLabel("2"), new JTextField(), new JButton() {
				});
				var list = new ArrayList<Row>();
				{
					list.add(row1);
					list.add(row2);
				}

				// ラベル - テキストフィールド- ボタン
				myComponents.contentPane.add(makeTab(list), BorderLayout.NORTH);

			}

			{ // 中

				var list = new JList<String>();
				{
					myComponents.list = list;
				}

				var textArea = new JTextArea();
				{
					myComponents.textArea = textArea;
				}
				final var splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
				{
					splitPane.add(new JScrollPane(list), JSplitPane.TOP);
					splitPane.add(new JScrollPane(textArea), JSplitPane.BOTTOM);
				}

				myComponents.contentPane.add(splitPane, BorderLayout.CENTER);
			}

			{ // 下
				var btn1 = new JButton("output");

			}

			/*
			 * アクションなど
			 */
			{
				// listを選択したら何かする
				myComponents.list.addMouseListener((SimplePressedMouseListener) e -> {

					// すでにこの時点で選択されたものがあるか判定する
					System.out.println(e);
				});

			}

		}

		frame.validate();
		frame.setVisible(true);
	}

	static class Row {
		final JComponent comp1;
		final JComponent comp2;
		final JComponent comp3;

		public Row(JComponent comp1, JComponent comp2, JComponent comp3) {
			this.comp1 = comp1;
			this.comp2 = comp2;
			this.comp3 = comp3;
		}
	}

	static JComponent makeTab(List<Row> rows) {

		var panel = new JPanel();
		var layout = new GroupLayout(panel);
		panel.setLayout(layout);

		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
		GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();

		{// vgroup
			rows.stream().forEach(r -> {
				vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(r.comp1)
						.addComponent(r.comp2).addComponent(r.comp3));
			});
		}

		{ // hgroup
			var glabel = layout.createParallelGroup();
			var gtf = layout.createParallelGroup();
			var gbtn = layout.createParallelGroup();
			rows.stream().forEach(row -> {
				glabel.addComponent(row.comp1);
				gtf.addComponent(row.comp2);
				gbtn.addComponent(row.comp3);
			});
			hGroup.addGroup(glabel);
			hGroup.addGroup(gtf);
			hGroup.addGroup(gbtn);
		}

		layout.setHorizontalGroup(hGroup);
		layout.setVerticalGroup(vGroup);
		return panel;
	}

}
