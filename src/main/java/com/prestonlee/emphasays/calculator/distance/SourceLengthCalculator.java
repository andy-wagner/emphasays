package com.prestonlee.emphasays.calculator.distance;

import com.prestonlee.emphasays.calculator.AbstractCalculator;

/**
 * Always returns the length of the source {@link String}.
 * 
 * @author Preston Lee <preston@asu.edu>
 * 
 */
public class SourceLengthCalculator extends AbstractCalculator implements IDistanceCalculator {

	public float calculate(final String pSource, final String pTarget) {
		if (pSource == null || pTarget == null) {
			throw new IllegalArgumentException();
		}
		return pSource.length();
	}

}
