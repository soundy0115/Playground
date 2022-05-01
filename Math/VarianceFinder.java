package math161a;

public class VarianceFinder {

	private int[] given;
	
	public VarianceFinder(int[] given){
		this.given = given;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {31, 53, 57, 58, 63, 66, 67, 67, 67, 68, 69, 70, 70, 70, 70, 72, 73, 75, 75, 76, 76, 78, 79, 81};
		VarianceFinder vf = new VarianceFinder(array);
		System.out.println("Given number's size is: " + vf.getGiven().length);
		System.out.println("Sample mean is: " + vf.findMean());
		System.out.println("Variance is: " + vf.findVar());
		System.out.println("Standard Deviation is: " + vf.findSd());
	}
	
	public int[] getGiven() {
		return this.given;
	}
	
	public double findMean() {
		double sum = 0;
		for(int i = 0; i < given.length; i++ ) {
			sum += given[i];
		}
		double mean = sum / given.length;
		double roundedMean = Math.round(mean * 100);
		return roundedMean / 100;
	}
	
	public double findVar() {
		double sumA = 0;
		double sumB;
		double sumC;
		for(int i = 0; i < given.length; i++) {
			sumB = (given[i]*given[i] - findMean()*findMean());
			sumC = Math.round(sumB * 100);
			sumA += sumC / 100;
		}

		double varA = Math.round(sumA / (given.length - 1) * 100);
		return varA / 100;
	}
	
	public double findSd() {
		double sd = Math.round(Math.sqrt(findVar()) * 100);
		return sd / 100;
	}

}
