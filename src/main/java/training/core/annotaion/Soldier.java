package training.core.annotaion;

@Inforamtion(
        author = "Awesome programmer",
        date = "2015-09-09",
        description = "Base class")
public class Soldier {

  @Inforamtion(
            author = "Awesome programmer",
            date = "2015-09-09",
            description = "Actual grade")
    private String grade;
    private String devision;
    private String name;

    @Inforamtion(
            author = "Awesome programmer",
            date = "2017-12-29",
            description = "Default constructor with initialization")


    public Soldier() {
        grade = "privite";
        devision = "NN";
        name = "NN";

    }

    public Soldier(String grade, String devision, String name) {
        this.grade = grade;
        this.devision = devision;
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public String getDevision() {
        return devision;
    }
    @Inforamtion(
            author = "Good writer",
            date = "2017-12-29",
            description = "add as needed")

    public String getName() {
        return name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setDevision(String devision) {
        this.devision = devision;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println("ATACK !!!!!!");
    }
    public void confirmOrder(String order){
        System.out.println("ROGER " + order);
    }

}
