package Lab2_ex1;

public class main {

	private static final int noOfThreads = 6;

	private static final int processorLoad = 1000000;

	public static void main(String args[]){

	Window win=new Window(noOfThreads);

	for(int i =0; i<noOfThreads; i++){

		Fir f = new Fir(i,processorLoad,win);
		f.addObserver(win);
		Thread t = new Thread(f);
		
		
		
	    t.start();

	}
	
}
	
	}
