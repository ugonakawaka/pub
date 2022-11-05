package a16_other_api;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;

public class A01_class_reload {

	/*
	 * https://stackoverflow.com/questions/20091075/reload-used-classes-at-runtime-java
	 */
	public static void main(String[] args) throws ClassNotFoundException, IOException, InterruptedException, InstantiationException, IllegalAccessException {
		Class<?> myClass = A01_class_reload.class;
		
		A01_class_reload.print();
		System.out.printf("my class is Class@%x%n", myClass.hashCode());
		System.out.println("reloading...");
		
		// この間に書き換えてみる
		Thread.sleep(3000l);
		
		URL[] urls = { myClass.getProtectionDomain().getCodeSource().getLocation() };
		ClassLoader delegateParent = myClass.getClassLoader().getParent();
		try (URLClassLoader cl = new URLClassLoader(urls, delegateParent)) {
			Class<?> reloaded = cl.loadClass(myClass.getName());
			System.out.printf("reloaded my class: Class@%x%n", reloaded.hashCode());
			System.out.println("Different classes: " + (myClass != reloaded));
			
			var methods = reloaded.getMethods();
			Arrays.asList(methods).stream().filter(m->m.getName().contains("print")).peek(System.out::println).forEach(m->{
				try {
					m.invoke(reloaded);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			});
		}
	}
	
	public static void print() {
		var message = "o_o!";
		System.out.println(message);
	}
	
	
}
