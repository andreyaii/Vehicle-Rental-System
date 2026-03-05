package insurance;

public abstract class Insurance {

    String coverageInfo;
    double costPerDay;

    Insurance(String coverageInfo, double costPerDay) {
        this.coverageInfo = coverageInfo;
        this.costPerDay = costPerDay;
    }
}