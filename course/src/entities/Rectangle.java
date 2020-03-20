package entities;

public class Rectangle {
		
		public double width ;
		public double heigth;
		
		public double area() {
			return (width * heigth);	
		}
	    
		public double diagonal() {
	        return Math.sqrt((width*width + heigth*heigth));
		}    
		
	    public double perimetro() {
	    	return 2*width + 2* heigth;
			
		}
		

}
