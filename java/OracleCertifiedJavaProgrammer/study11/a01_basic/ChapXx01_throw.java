package a01_basic;

import java.io.IOException;

public class ChapXx01_throw {

	interface Aaa {
		void throwXxx() throws IOException, Throwable;
	}
	interface Bbb {
		void throwXxx() throws Throwable;
	}
	
	class XxxImp implements Aaa, Bbb {

		@Override
		public void throwXxx() throws Throwable {
			// TODO Auto-generated method stub
			
		}



		
	}
	
}
