public class RunnersTest {
    public static void main(String[] args) {
        int[] minutes={341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265};
        String[] runnerNames={"Kadir","Gökhan","Hakan","Suzan","Pınar","Mehmet","Ali","Emel","Fırat","James","Jale","Ersin","Deniz","Gözde","Anıl","Burak"};
        Runners minuteSort=new Runners(runnerNames,minutes);
        minuteSort.outputRating();
        minuteSort.outputBarChart();
    }
}
