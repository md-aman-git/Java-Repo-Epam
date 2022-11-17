class Encap {
	private int score;
	Encap(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
public class EncapsulationExample {
	public static void main(String [] args) {
		Encap access = new Encap(46); //setting through constructor
		//int score = access.score; //due to private non accessible.
		int score = access.getScore(); //accessing through getters
		System.out.println("Get Score : " + score);
		access.setScore(78); //setting through setters
		score = access.getScore();
		System.out.println("Get Score : " + score);
	}
}
