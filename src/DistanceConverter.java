public class DistanceConverter {
    public static void main(String[] args) {
        //Convert meters to inches
        float m = 100.5f;
        float inch = 39.37f;
        float result = m * inch;
        System.out.println("Meters to Inches =" + result);

        //Convert inches to meters
        float result1 = inch/m;
        System.out.println("Inches to Meters =" +result1);

        //Convert miles to kilometers
        float km = 1.609f;
        float mil = 110f;
        float result2 = mil*km;
        System.out.println("Miles to Kilometers =" + result2);

        //Convert kilometers to miles
        float result3 = mil/km;
        System.out.println("Convert Kilometers to miles = " + result3);

        //Convert kilograms to pounds
        float kg = 115.5f;
        float lb = 2.2046f;
        float result4 = kg* lb;
        System.out.println("Convert Kilograms to Pounds = " + result4);

        //Convert Pounds to kilograms
        float result5 = kg/lb;
        System.out.println("Convert Pounds to kilograms = " + result5);

        //Convert speed km/hr to mi/hr
        float kmhr = 0.6214f;
        float mihr = 100f;
        float result6 = kmhr * mihr;
        System.out.println("Convert speed km/hr to mi/hr = " + result6);

        //Convert speed mi/hr to km/hr
        float result7 = mihr/kmhr;
        System.out.println("Convert speed mi/hr to km/hr = " + result7);
    }
}
