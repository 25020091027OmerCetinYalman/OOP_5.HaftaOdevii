package Odev;

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
    private BigInteger numerator = BigInteger.ZERO;
    private BigInteger denominator = BigInteger.ONE;

    public Rational(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = numerator.gcd(denominator);
        this.numerator = numerator.divide(gcd);
        this.denominator = denominator.divide(gcd);
    }

    @Override
    public int compareTo(Rational o) {
        BigInteger diff = this.numerator.multiply(o.denominator).subtract(o.numerator.multiply(this.denominator));
        return diff.signum();
    }

    @Override
    public int intValue() { return (int) doubleValue(); }
    @Override
    public long longValue() { return (long) doubleValue(); }
    @Override
    public float floatValue() { return (float) doubleValue(); }
    @Override
    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }
}