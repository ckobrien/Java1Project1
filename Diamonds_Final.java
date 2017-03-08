
public class Diamonds_Final {
	public static void main(String[] args) {
	     line();
	     upTriangle();
	     downTriangle();
	     line();
	     downTriangle();
	     upTriangle();
	     line();
	}
	public static void upTriangle() {
		//start of upward triangle
	    for(int vertlines=1; vertlines<=4; vertlines++) {
	        System.out.print("|");
	        for(int spaces=1; spaces<=5-vertlines; spaces ++){
	            System.out.print(" ");    
	            }
	        for(int slashes=1; slashes<=vertlines-1; slashes++) {
	            System.out.print("/");
	        } System.out.print("*");
	        for(int slashes=1; slashes<=vertlines-1; slashes++) {
	            System.out.print("\\"); }
	        for(int spaces=1; spaces<=5-vertlines; spaces ++){
	            System.out.print(" ");    
	            }
	        System.out.print("|");
	     System.out.println("");
	    }
	} //end of upward triangle
	    //start of downward triangle
	public static void downTriangle() {
	    for (int vertlines=1; vertlines<=4; vertlines++) {
	        System.out.print("|");
	        for (int spaces=1; spaces<=vertlines; spaces++) {
	            System.out.print(" ");
	        } 
	        for(int slashes=1; slashes<=-1*vertlines+4; slashes++) {
	                System.out.print("\\");
	            }
	        System.out.print("*");
	            for (int slashes=1; slashes<=-1*vertlines+4; slashes++) {
	                System.out.print("/");
	            } 
	            for ( int spaces=1; spaces<=vertlines; spaces++) {
	                System.out.print(" ");
	            }
	             System.out.println("|");
	    } //end of downward triangle
	    }
	public static void line() {
		System.out.println("+---------+");
		
	}
}
