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
        float day1 = 24;
        float hour1 = 60;
        float min1 = 60;
        float sec1 = 60;
        float by = now - born;
        float bm = by*month;
        float bd = by*year;
        float bw = bd/week;
        float bh = bd*day1;
        float bmin = bh*min1;
        float bsec = bmin*sec1;
        System.out.println("I been in years =" + by);
        System.out.println("I been in months =" + bm);
        System.out.println("I been in weeks =" + bw);
        System.out.println("I been in days =" + bd);
        System.out.println("I been in hours =" + bh);
        System.out.println("I been in minutes =" + bmin);
        System.out.println("I been in seconds =" + bsec);
    }
}
