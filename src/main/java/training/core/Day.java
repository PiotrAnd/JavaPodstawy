package training.core;

public enum Day {
    FRIDAY(5, "pt"),
    MONDAY(1, "pon"),
    SATURDAY(6, "sob"),
    SUNDAY(7, "ndz"),
    THURSDAY(4, "czw"),
    TUESDAY(2, "wt"),
    WEDNESDAY(3, "śr");

    private int dayNumber;
    private String shortName;

    Day(int dayNumber, String shortName) {
        this.dayNumber = dayNumber;
        this.shortName = shortName;
    }

    public void DayNumber() {

        System.out.println("Number of day: " + dayNumber);
    }

    public void ShortName()
    {
        System.out.println("Short name: " + shortName);
    }

    @Override
    public String toString() {
        String nameLower = super.toString().toLowerCase();
        Character firstLetter = nameLower.toUpperCase().charAt(0);

        String finalName = firstLetter + nameLower.substring(1);
        return finalName;
    }
}

