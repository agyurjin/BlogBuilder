package blogBuilder;

public class BlogBuilder {

	Header header;
	Footer footer;
	LeftPane leftPane;
	RightPane rightPane;
	MiddleSection middleSection;
	
	public BlogBuilder(int n){
		this.header = new Header();
		this.footer = new Footer();
		this.leftPane = new LeftPane();
		this.rightPane = new RightPane();
		this.middleSection = new MiddleSection(n); 
	}
	
	void create(){
		this.header.create();
		this.footer.create();
		this.leftPane.create();
		this.rightPane.create();
		this.middleSection.create();
	}

}
