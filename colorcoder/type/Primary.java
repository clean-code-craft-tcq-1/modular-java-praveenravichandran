package colorcoder.type;

public enum Primary implements IColor {
	WHITE(0), RED(1), BLACK(2), YELLOW(3), VIOLET(4);

	private int index;

	private Primary(int index) {
		this.index = index;
	}

	@Override
	public int getIndex() {
		return index;
	}
};
