package vo;

public class Phone {
	private int num;
	private String model;
	private String title;
	private String publisher;
	private int price;

	public Phone() {
	}

	public Phone(int num, String model, String title, String publisher, int price) {
		super();
		this.num = num;
		this.model = model;
		this.title = title;
		this.publisher = publisher;
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public String getModel() {
		return model;
	}

	public String getTitle() {
		return title;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [num=" + num + ", model=" + model + ", title=" + title + ", publisher=" + publisher + ", price="
				+ price + "]";
	}

}
