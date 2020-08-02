package functionalInterface;

public class GreetingMain {

	public static void main(String[] args) {
		
		
		/* This is an anonymous inner class
		 * An inner class declared without a class name is known as an anonymous inner
		 * class. In case of anonymous inner classes, we declare and instantiate them at
		 * the same time. Generally, they are used whenever you need to override the
		 * method of a class or an interface.
		 */
		
		GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name); //
            }
        };
        
        gm.greet("John Baker");
        
        //Lambda is a short hand method to make an anonymous inner class.
        //Doing the same thing as above using lambda notation
        //lambda comes from lambda calculus, and uses less code.
        GreetingMessage gm2 = (String name) -> {
            System.out.println("Hello " + name);
        };
        gm2.greet("John Baker");

        
        MessagePrinter mp = () -> {
            System.out.println("This is a message");
        };
        mp.printMessage();
        
	}

}
