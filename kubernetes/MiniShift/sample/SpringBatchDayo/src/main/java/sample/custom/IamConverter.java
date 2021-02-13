package sample.custom;



import sample.IProcessor;


public class IamConverter implements IProcessor<Object, Object> {

	@Override
	public Object process(Object item) throws Exception {
		
		System.out.println();
		
		System.out.println("i am callerd!!! o_o!");
		
		System.out.println();
		
		return item;
	}

}
