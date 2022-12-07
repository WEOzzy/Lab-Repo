package Chapter4.Challenges.Exponent;

public class Exponent {
    /**
     * return the result of the math equation (base)^(exp) - eg, 3^2 = 9.
     * (try using your own logic rather than using Math.exp.)
     * @param base base of the exponent equation.
     * @param exp exponent of the exponent equation.
     * @return the exponent of base to the exp power.
     */
    public double getExp(double base, int exp){
        double result = base;
        for (int i = 1; i < exp; i++){
            result *= base;
        }
        return result;
    }
}
