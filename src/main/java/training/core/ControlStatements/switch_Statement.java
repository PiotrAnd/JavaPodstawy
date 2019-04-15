package training.core.ControlStatements;

import training.core.Day;

import java.time.Month;

public class switch_Statement {
    public static void main(String[] args) {
        currentSeasonName(1);
        seasonNumberByNumber("Winter");
        amountOfDayInMonth(2);
        whatYouThinkAbaut(Day.FRIDAY);
        Day.MONDAY.ShortName();
        System.out.println(Day.SUNDAY);
    }

    private static void whatYouThinkAbaut(Day dayOfWeek) {
        System.out.println(dayOfWeek + " statistic; ");
        dayOfWeek.DayNumber();
        dayOfWeek.ShortName();
        switch (dayOfWeek){
            case MONDAY:
                System.out.println("Oh no!!!");
                break;
            case TUESDAY:
                System.out.println("It`s better!!!");
                break;
            case WEDNESDAY:
                System.out.println("In the week middle!!!");
                break;
            case THURSDAY:
                System.out.println("Almost weekend!!!");
                break;
            case FRIDAY:
                System.out.println("Yeah, today is my day!!!");
                break;
            case SATURDAY:
                System.out.println("Party time!!!");
                break;
            case SUNDAY:
                System.out.println("Hangover killing me!!!");
        }
    }

    private static void amountOfDayInMonth(int month) {
        //2 -28
        //1,3,5,7,8,10,12 - 31
        //4,6,9,11 - 30
        switch (month) {
            case 2:
                System.out.println("28 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("31 days");
                break;
            default:
                System.out.println("Not exist!!!");
        }

    }

    private static void seasonNumberByNumber(String seazon) {
        String partOfYear = seazon.toUpperCase();
        switch (partOfYear) {
            case "SPRING" :
                System.out.println("No.: 1");
                break;
            case "SUMMER" :
                System.out.println("No.: 2");
                break;
            case "AUTUMN" :
                System.out.println("No.: 3");
                break;
            case "WINTER" :
                System.out.println("No.: 4");
                break;
            default:
                System.out.println("Not exist!!!");
        }
    }

    private static void currentSeasonName(int seazonNumber) {
        switch (seazonNumber){
            case 1: //przypadek //
                System.out.println("Spring");
                break;
            case 2:
                System.out.println("Summer");
                break;
            case 3:
                System.out.println("Autumn");
                break;
            case 4:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Not exist!!!");
        }
    }
}
