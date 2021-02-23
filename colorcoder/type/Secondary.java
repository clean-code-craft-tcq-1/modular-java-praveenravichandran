package colorcoder.type;

public enum Secondary implements IColor {
	BLUE(0), ORANGE(1), GREEN(2), BROWN(3), SLATE(4);

	private int index;

	private Secondary(int index) {
		this.index = index;
	}

	@Override
	public int getIndex() {
		return index;
	}
};
