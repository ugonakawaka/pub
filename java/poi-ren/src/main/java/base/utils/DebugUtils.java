package base.utils;

public class DebugUtils {

	public static void dprintln(Object o) {
		var className = o.getClass().getCanonicalName();
		System.out.printf("%s [%s]%n", className, o);
	}

}
