package week1day1;

public class LearnMobileMethods {
	
	
	
	
	String brandName="Oppo";
	int price=32000;
	boolean buyMoblie=false;
	long phNo=9003163056l;
	
	
	//method dec as calls(){}
	//message , picture , playing , transaction, browsing 	
	
	public long typeMessages() {
		
		long friendNo=8939717833l;
		System.out.println(phNo);
		return friendNo;
	}
	public void makeCalls() {
		System.out.println(price);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		LearnMobileMethods obj =new LearnMobileMethods();
		
	  String name=obj.brandName;
		System.out.println(name);
		obj.typeMessages();
		
		
		
	
		
	}

}
