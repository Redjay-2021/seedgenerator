package seed;

public class Generate {
	static String seed;
	public Generate(String arg1){
		seed = "";	
		seedgen(Integer.parseInt(arg1));
	}
	 
	
	private void seedgen(int count) {
		for(int i = 0; i < count; i++) {
			seedCharGen((int)(Math.random()*(32-1+1)+1));
			System.out.println(Integer.toString(i + 1) + ". " + seed);
			seed = "";
		}
	}
	private void seedCharGen(int count) {
		int max = 9;
        int min = 0;
        int range = max - min + 1;
		for(int i = 0; i < count; i++) {
			int rand = (int)(Math.random() * range) + min;
			
			seed = seed + Integer.toString(rand);
		}
	}
}
