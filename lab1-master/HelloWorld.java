public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello world!!");
		
		for(int i = 0; i < args.length; i++){
			
			for(int j = 0; j < args[i].length()-1; ++j){	
				System.out.print( args[i].charAt(j) );
				
			}
		}
		

	}

}
