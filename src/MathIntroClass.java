public class MathIntroClass {
    public static void main(String[] args) {
        System.out.println("abs in Math is Math.abs(-110) = " + Math.abs(-110)); // positive
        System.out.println("ceil in Math is Math.ceil(12.4) = " + Math.ceil(12.4)); // up round
        System.out.println("floor in Math is Math.floor(12.4) = " + Math.floor(12.4)); // down round
        System.out.println("max in Math is Math.max(12.4, 22) = " + Math.max(12.4, 22)); // maximum
        System.out.println("min in Math is Math.min(12.4, 22) = " + Math.min(12.4, 22)); // minimum
        System.out.println("pow in Math is Math.pow(4, 3) = " + Math.pow(4, 3)); // Not round -- power
        System.out.println("sqrt in Math is Math.sqrt(4) = " + Math.sqrt(4)); // Not round -- square root
        System.out.println("round in Math is Math.round(21.3) = " + Math.round(21.3)); // round to down <0.5 and to up >= 0.5
    }
}
