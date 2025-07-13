import java.util.Vector;
public class ConvertTemperature {
    

    public double[] convertTemperature(double celsius) {
        Vector<Double> ans = new Vector<>();
        Double kelvin = celsius + 273.15;
        Double fahrenheit = celsius * 1.80 +32.00;
     
        ans.add(kelvin);
        ans.add(fahrenheit);

        double[] result = new double[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
    public static void main(String[] args){
        ConvertTemperature ct = new ConvertTemperature();
        double[] result = ct.convertTemperature(0);
        System.out.println("Kelvin: " + result[0]);
        System.out.println("Fahrenheit: " + result[1]);
    
    }
}
