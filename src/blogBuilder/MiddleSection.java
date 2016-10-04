package blogBuilder;

public class MiddleSection implements BlogPart {
	private int nSections = 1;
	
	public MiddleSection(int nsections) {
		this.nSections = nsections;
	}
	@Override
	public void create() {
		System.out.println("Middle Section was created with " + nSections + "!");
	}
}
