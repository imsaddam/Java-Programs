public class CompoundInterest {


    public void calculateInterest(int p, int t, double r, int n){

        double amount = p * Math.pow(1 + (r / n), n * t);
        double compoundInterest = amount - p;

        System.out.println(" Compound Interest after "+ t + " years : "+ compoundInterest);
        System.out.println(" Amount after "+ t + " years : "+amount);

    }


    public static void main(String[] args) {

        CompoundInterest object = new CompoundInterest();
        object.calculateInterest(2000,5, .08, 12);
    }
}
