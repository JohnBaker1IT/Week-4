package functionalInterface;

@FunctionalInterface
public interface GreetingMessage {
	//functional interfaces can have only one abstract method
	//They define a behavior(methods) and not state(variables)
	public abstract void greet(String name);  
	
	
}
