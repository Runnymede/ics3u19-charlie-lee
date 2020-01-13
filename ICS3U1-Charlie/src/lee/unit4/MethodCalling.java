package lee.unit4;

public class MethodCalling {
    
	public static void printSignature()
	{
);
	}     
				                                                    
	public static void printImage()
	{                    
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		System.out.println("Method calling");
		Thread.sleep(2000);
		printSignature();
		Thread.sleep(1000);
		System.out.println("Method end");
		System.out.println();
		System.out.println("Method Image calling");
		Thread.sleep(2000);
		printImage();
		Thread.sleep(1000);
		System.out.println("Method Image end");
	}

}
