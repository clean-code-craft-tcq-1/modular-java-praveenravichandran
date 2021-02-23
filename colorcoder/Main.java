package colorcoder;

import colorcoder.colorpair.ColorPair;
import colorcoder.type.Primary;
import colorcoder.type.Secondary;

public class Main {
	static void testNumberToPair(int pairNumber, Primary expectedMajor, Secondary expectedMinor) {
		ColorPair colorPair = ColorPair.getColorFromPairNumber(pairNumber);
		System.out.println("Got pair " + colorPair.ToString());
		assert (colorPair.getMajor() == expectedMajor);
		assert (colorPair.getMinor() == expectedMinor);
	}

	static void testPairToNumber(Primary major, Secondary minor, int expectedPairNumber) {
		int pairNumber = ColorPair.getPairNumberFromColor(major, minor);
		System.out.println("Got pair number " + pairNumber);
		assert (pairNumber == expectedPairNumber);
	}

	static void printColorPairs() {
		String colorPair = "";

		for (int i = 1; i <= 25; i++) {
			colorPair += "Color pair " + i + " " + ColorPair.getColorFromPairNumber(i).ToString() + "\n";
		}
		System.out.println(colorPair);
	}

	public static void main(String[] args) {
		testNumberToPair(4, Primary.WHITE, Secondary.BROWN);
		testNumberToPair(5, Primary.WHITE, Secondary.SLATE);
		testPairToNumber(Primary.BLACK, Secondary.ORANGE, 12);
		testPairToNumber(Primary.VIOLET, Secondary.SLATE, 25);

		printColorPairs();
	}
}
