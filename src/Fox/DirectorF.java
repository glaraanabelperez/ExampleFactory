package Fox;

public class DirectorF {
	private FactoryF fp;

	public DirectorF() {
		this.fp=new FactoryF();
	}

	public FactoryF getFp() {
		return fp;
	}

	public void setFp(FactoryF fp) {
		this.fp = fp;
	}

}
