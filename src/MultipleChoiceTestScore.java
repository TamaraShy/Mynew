public class MultipleChoiceTestScore {
    public static void main(String[] args) {
        float total = 1000;
        float p = 900;
        float f = 100;
        float passed = (p/total)*100;
        float failed = (f/total)*100;
        System.out.println("Passed %" + passed);
        System.out.println("Failed %" + failed);
    }
}

