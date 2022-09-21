package dad.codesignal;

public class TheJourneyBegins {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int century(int a) {
		return ((a-1)/100)+1;
	}
	
	public boolean checkpalindromo(String inputString) {
	    boolean check = true;
	    String s = "";
	    for(int i = inputString.length()-1 ; i >= 0 ; i--){
	        s += inputString.charAt(i);
	    }
	    if(!s.equals(inputString)){
	        check = false;
	    }
	    return check;
	}

}
