package tolemy.test;

import tolemy.rr.Context;
import tolemy.rr.ReflectiveRefactoring;

public class TestRefactoring implements ReflectiveRefactoring {

	public TestRefactoring() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void refactor(Context context) {
		System.out.println("test succeded");
	}
	
	@Override
	public String getName() {
		return "Test";
	}

}
