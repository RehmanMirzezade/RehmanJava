package lesson;

public class Tapsiriqq {
	protected int width;
	protected int height;

	public Tapsiriqq(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setheight(int height) {
		this.height = height;
	}

	public int getwidth() {
		return width;
	}

	public int getheight() {
		return height;

	}

	public int getkvadrat() {
		return width * height;
	}
}
