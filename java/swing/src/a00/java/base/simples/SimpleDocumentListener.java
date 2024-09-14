package base.simples;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * 
 * ラムダで扱うためよう
 *
 */
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