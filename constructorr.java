//output xxyxy

public class constructorr{
	public static void main(String[] args){
		x aa = new x();
		x bb = new y();
		y cc = new y();
		//y dd = new x();
	//	return 0;
	}

}

class x{
	x(){
		System.out.println("x");
	}
}

class y extends x{
	y(){
		System.out.println("y");
	}
}


