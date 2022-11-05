package a16_other_api;

import java.util.function.Consumer;
import java.util.prefs.Preferences;
import java.util.prefs.PreferencesFactory;

public class A00_Preferences {

	public static void main(String[] args) {
		a();
	}

	static void a() {
		
		var printer = (Consumer<Preferences>)(p)->{
			System.out.println("==========");
			System.out.println(p.absolutePath());
			System.out.println(p.name());
			System.out.println(p.isUserNode());
			System.out.println(p.toString());
		};
		
		
		/*
		 * 設定情報を保存するよ
		 */
		{
			var preferences = Preferences.userRoot();
			printer.accept(preferences);
		}
		{
			var preferences = Preferences.userNodeForPackage(A00_Preferences.class);
			printer.accept(preferences);
			
		}
		{
			var preferences = Preferences.userRoot().node("/Prefs");
			printer.accept(preferences);
		}
		
	}
}
