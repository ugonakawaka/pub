package base.simples;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// mousePressed
public interface SimplePressedMouseListener extends MouseListener {

	@Override
	default void mouseClicked(MouseEvent e) {
		// do nothing
	}

	@Override
	default void mouseReleased(MouseEvent e) {
		// do nothing
	}

	@Override
	default void mouseEntered(MouseEvent e) {
		// do nothing
	}

	@Override
	default void mouseExited(MouseEvent e) {
		// do nothing
	}

}
