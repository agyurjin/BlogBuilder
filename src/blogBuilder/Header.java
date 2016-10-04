package blogBuilder;

public class Header implements BlogPart{

	@Override
	public void create() {
		System.out.println("Header was created!");
	}

}
