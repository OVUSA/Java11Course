
public class ClassForExceptions {
	
	try(SomeResource r = new SomeResource()){
		r.doThing(true);
		
	}catch(Exception ex) {
		
	}

}
