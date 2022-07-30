package myvali.main;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

public class DynamicAnnotationReplaceUtils {
	private static final String ANNOTATIONS = "annotations";
	private static final String ANNOTATION_DATA = "annotationData";

	public static <T>void a(T t) {
		
		System.out.println("ok");
		var fields =  t.getClass().getDeclaredFields();
		
		for (Field field : fields) {
			// field.setAccessible(true);
			System.out.println(field);
			
		}
		
		
	}
	
	
	public static void annotationReplacedBy(Class<?> targetClazz, String originalName, Annotation newOne) {
		try {
			@SuppressWarnings("all")
			Method method = Class.class.getDeclaredMethod(ANNOTATION_DATA, null);
			method.setAccessible(true);

			Object annotationData = method.invoke(targetClazz);

			Field annotations = annotationData.getClass().getDeclaredField(ANNOTATIONS);
			annotations.setAccessible(true);

			@SuppressWarnings("unchecked")
			Map<Class<? extends Annotation>, Annotation> map = (Map<Class<? extends Annotation>, Annotation>) annotations
					.get(annotationData);

			Annotation original = map.entrySet().stream().filter(e -> {
				return e.getKey().getSimpleName().equals(originalName);
			}).findFirst().get().getValue();

			if (original == null) {
				throw new IllegalArgumentException(
						String.format("Class(%s) has not %s annotaion.", targetClazz.getCanonicalName(), originalName));
			}

			// map.put(original, newOne);
		} catch (Exception ex) {
			throw new IllegalArgumentException(ex);
		}
	}

}