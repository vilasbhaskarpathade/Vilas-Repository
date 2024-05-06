class PercentageCalculate {
    public static void main(String[] args) {
      
        double eng = 90.0;
        double sci = 80.4;
        double math = 70.6;
        double phy = 60.9;
        double chem = 50.8;
        double geo = 40.8;
      
        double total = eng + sci + math + phy + chem + geo;

      
        double per = (total / 600) * 100;

        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + per + "%");
    }
}
