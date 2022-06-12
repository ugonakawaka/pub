package base.utils;

import static base.utils.Utils.*;

import base.utils.UBase.QuietFunc;
import base.utils.UBase.Silencer;

@SuppressWarnings("unused")
public abstract class UBase {

	
	
	
	// ============
	public interface Silencer {
		public void apply() throws Throwable;
	}

	public interface QuietFunc<T> {
		public T apply() throws Throwable;
	}

	// ============

	public static <T> T exec(QuietFunc<T> quietFunc) {
		try {
			return quietFunc.apply();
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

	public static void exec(Silencer silencer) {
		try {
			silencer.apply();
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}
}
