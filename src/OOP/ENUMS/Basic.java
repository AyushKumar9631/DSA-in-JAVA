package OOP.ENUMS;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday, Sunday;
        //above are enum constants.
        //are public static and final

        Week(){
            System.out.println("Enum created for"+ this);
        }
        //this is not public or protected only private or default
        //to prevent creation of multiple objects
        //
    }

    public static void main(String[] args) {
        Week week;
        week=Week.Monday;

        //for(Week day: Week.values()) System.out.println(day);

        System.out.println(week);
        System.out.println(week.ordinal());//prints the position if week in Week enum
    }
}
