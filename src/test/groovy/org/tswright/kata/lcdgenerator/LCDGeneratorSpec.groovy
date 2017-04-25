package org.tswright.kata.lcdgenerator

import spock.lang.Specification

class LCDGeneratorSpec extends Specification {

	def "2 denominators work"() {

		expect:
		LCDGenerator.generateLCD( first, second ) == lcd

		where:
		first   |   second  ||  lcd
		2       |   3       ||  6
		2       |   4       ||  4
		3       |   5       ||  15
	}

	def "3 denominators work"() {
		expect:
		LCDGenerator.generateLCD(first, second, third) == lcd

		where:
		first | second | third || lcd
		2     | 3      | 15    || 30
		2     | 3      | 6     || 6
		3     | 3      | 8     || 24
		3     | 8      | 4     || 24
		5     | 7      | 11    || 385
	}
}