// parent class
abstract class Parent {
	int a = 1; 
	 public Parent(){
   		System.out.println("Parent Constructor" + a);
   		this.init();
 	}

 	public void init(){
   		
		System.out.println("parent Init()");
 	}	

	public  abstract void pop();
}

// child class
class Child extends Parent {

        
 //	a = 2;
	private Integer attribute1;
	private Integer attribute2 = null;

	public Child(){
	
    		System.out.println("--==--" + a);		
    		System.out.println("Child Constructor" + a);
		

	}
	
	a = 2;

	
	
	

	public void init(){

		System.out.println("=-" + a);

    		System.out.println("Child init()");
    		super.init();
    		attribute1 = new Integer(100);
    		attribute2 = new Integer(200);
	}

	public void print(){
    		System.out.println("attribute 1 : " +attribute1);
    		System.out.println("attribute 2 : " +attribute2);
	}
}

public class Tester {

	public static void main(String[] args) {
   		 Child c = new Child();
    	//	((Child)c).print();


	}	
}


































