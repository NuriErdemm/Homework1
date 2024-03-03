public class Runners {
    private final String[] runnerNames;
    private final int[] minutes;

    public Runners(String[]runnerNames, int[] minutes){
        this.runnerNames=runnerNames;
        this.minutes=minutes;
    }

    private String firstPerson;
    private String secondPerson;
    private String thirdPerson;

    public int getLowestMinute(){
        int lowestMin = minutes[0];
        for (int i=0; i<minutes.length; i++){
            if (lowestMin>minutes[i]){
                lowestMin = minutes[i];
                firstPerson = runnerNames[i];
            }
        }
        return lowestMin;
    }
    public int getSecondLowestMinute(){
        int secondLowestMin = minutes[0];
        for (int i=0; i<minutes.length; i++){
            if (minutes[i]> getLowestMinute() && secondLowestMin>minutes[i]){
                secondLowestMin = minutes[i];
                secondPerson = runnerNames[i];
            }
        }
        return secondLowestMin;
    }
    public int getThirdLowestMinute(){
        int thirdLowestMin = minutes[0];
        for (int i=0; i<minutes.length; i++){
            if (thirdLowestMin>minutes[i] && minutes[i]!= getLowestMinute() && minutes[i]!= getSecondLowestMinute()){
                thirdLowestMin = minutes[i];
                thirdPerson = runnerNames[i];
            }
        }
        return thirdLowestMin;
    }
    public void outputRating(){
        getThirdLowestMinute();
        System.out.println("Birinci: "+ firstPerson + " " + getLowestMinute() + "'");
        System.out.println("İkinci: "+ secondPerson + " " + getSecondLowestMinute() + "'");
        System.out.println("Üçüncü: "+ thirdPerson + " " + getThirdLowestMinute() + "'");
    }

    public void outputBarChart(){
        int[] frequancy = new int[3];
        for (int minute:minutes){
            frequancy[(minute/100)-2]++;
        }
        System.out.println("A -> "+ frequancy[0]);
        System.out.println("B -> "+ frequancy[1]);
        System.out.println("C -> "+ frequancy[2]);
    }
}
