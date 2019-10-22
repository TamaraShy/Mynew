public class TimeCalculation {
    public static void main(String[] args) {
        //convert time in seconds to days, hours, min and seconds or reverse
        float sec = 60;
        float min = 60;
        float hour = 24;
        float day = 24;
        float days = hour/min/sec;
        System.out.println("Convert second to days = "+ days );
        float hours = min/sec/hour;
        System.out.println("Convert second to hours =" + hours);
        float minutes = min/sec;
        System.out.println("Convert second to minutes =" + minutes);
        float s1 = min*sec;
        System.out.println("Convert minutes to seconds =" +s1);
        float s2 = hour*min*sec;
        System.out.println("Convert hours to second = " +s2);
        float s3 = sec*min*hour*day;
        System.out.println("Convert day to seconds = " + s3);

        //calculate the number seconds, minutes, hours, days, weeks, years you’ve been
        float now = 2019;
        float born = 1983;
        float year = 365;
        float month = 12;
        float week =7;
        float day = 24;
        float hour = 60;
        float min = 60;
        float sec = 60;
        float by = now - born;
        float bm = by*month;
        float bw = by*bm*week;
        float bd = 20;
        float bh =
        float bmin =
        float bsec =
        System.out.println("I been in years =" + by);
    }
}
