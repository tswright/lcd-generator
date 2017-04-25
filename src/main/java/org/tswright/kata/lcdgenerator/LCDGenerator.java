package org.tswright.kata.lcdgenerator;

import java.util.Arrays;

public class LCDGenerator
{
	static public int generateLCD( int[] denominators )
	{
		int largestDenominator = Arrays.stream( denominators ).max().getAsInt();
		int lcd = largestDenominator;
		while ( !check( lcd, denominators ) )
		{
			lcd += largestDenominator;
		}
		return lcd;
	}

	static private boolean check( int candidate, int[] denominators )
	{
		return Arrays.stream( denominators ).allMatch( value -> candidate % value == 0 );
	}
}
