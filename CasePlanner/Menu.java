package CasePlanner;

public class Menu {
    public void getWelcome() {
        System.out.println("Welcome to Case Planner\n");

    }

    public void getMainMenu() {
        System.out.println("""
                What you want to do?\s
                1.Add case\s
                2.View outstanding case\s
                3.View all outstanding tasks\s
                4.Close case\s
                5.View close case\s
                6.View all close case\s
                7.Exit.""");

    }

    public void getTaskMenu() {
        System.out.println("""                   
                1.Set deadline\s
                2.Set description\s
                3.Overwrite title\s
                4.Get Id\s
                5.View deadline\s
                6.View description\s
                7.View priority\s
                8.View title\s
                9.View author\s
                10.View CaseInformation\s
                11.To menu""");
    }


}
