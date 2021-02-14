package sample.custom;



import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import sample.IProcessor;


@Component("iamconverter")
@Scope("prototype")
public class IamConverter implements IProcessor<Object, Object> {

	@Override
	public Object process(Object item) throws Exception {
		
		System.out.println();
		
		System.out.println("i am callerd!!! o_o!");
		
		System.out.println();
		
		return item;
	}

}
