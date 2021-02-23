package colorcoder.colorpair;

import colorcoder.colornames.ColorNames;
import colorcoder.type.IColor;
import colorcoder.type.Primary;
import colorcoder.type.Secondary;

public class ColorPair {
	private Primary primary;
	private Secondary secondary;

	public ColorPair(Primary primary, Secondary secondary) {
		this.primary = primary;
		this.secondary = secondary;
	}

	public Primary getMajor() {
		return primary;
	}

	public Secondary getMinor() {
		return secondary;
	}

	public String ToString() {
		String colorPairStr = ColorNames.primary[primary.getIndex()];
		colorPairStr += " ";
		colorPairStr += ColorNames.secondary[secondary.getIndex()];
		return colorPairStr;
	}

	public static ColorPair getColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		Primary primary = (Primary) fromIndex(Primary.values(), zeroBasedPairNumber / ColorNames.numberOfSecondary);
		Secondary minorColor = (Secondary) fromIndex(Secondary.values(),
				zeroBasedPairNumber % ColorNames.numberOfSecondary);
		return new ColorPair(primary, minorColor);
	}

	public static int getPairNumberFromColor(Primary primary, Secondary secondary) {
		return primary.getIndex() * ColorNames.numberOfSecondary + secondary.getIndex() + 1;
	}

	public static IColor fromIndex(Object[] values, int index) {
		for (Object obj : values) {
			IColor color = (IColor) obj;
			if (color.getIndex() == index) {
				return color;
			}
		}
		return null;
	}
};