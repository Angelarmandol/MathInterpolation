package pck;

import java.util.Vector;

public interface InterpolationMethod {

	public double calculateResult(double t, Vector<Double> xx, Vector<Double> yy);
}