package CasePlanner;

public class Program<T extends Case> {

    public  void start() {
        Input input = new Input();
        Menu menu = new Menu();
        menu.getWelcome();
        CasePlanner casePlanner = new CasePlanner(input.scanStr("Enter name  of your case planner: "));
        int choice = 0;
        do {
            menu.getMainMenu();
            choice = input.scanInt();
            switch (choice) {
                case 1:
                    casePlanner.addTask(new ProcessCase(input.scanStr("Enter title"),
                            input.scanStr("Enter Name"),
                            input.scanStr("Enter Surname ")));
                    System.out.println("Task added successfully!");
                    break;
                case 2: {
                    ProcessCase task = casePlanner.currentTasks.showCase(input.scanInt("Input case ID"));
                    while (input.scanInt() != 11) {
                        menu.getTaskMenu();
                        switch (input.scanInt()) {
                            case 1:
                                task.setDeadline(input.scanInt("Input year"),
                                        input.scanInt("Input month"), input.scanInt("Input day"), input.scanInt("Input hour"));
                                System.out.println("Deadline updated successfully!");
                                break;
                            case 2:
                                task.setDescription(input.scanStr("Your description: "));
                                System.out.println("Description updated successfully!");
                                break;
                            case 3:
                                task.setTitle("New title:");
                                System.out.println("Title updated successfully!");
                                break;
                            case 4:
                                task.showId();
                                break;
                            case 5:
                                task.showDeadline();
                                break;
                            case 6:
                                task.showDescription();
                                break;
                            case 7:
                                task.showPriority();
                                break;
                            case 8:
                                task.showTitle();
                                break;
                            case 9:
                                task.showAuthor();
                                break;
                            case 10:
                                task.showInfo();
                                break;
                        }
                    }
                    break;
                }
                case 3:
                    casePlanner.currentTasks.showAll();
                    break;
                case 4:
                    casePlanner.closeTask(input.scanInt("Input case ID"));
                    System.out.println("Task closed successfully!");
                    break;
                case 5:
                    do {
                        casePlanner.currentTasks.showAll();
                    }while (input.scanInt("Enter 1 to back in menu") != 1);

                    break;
                case 6:
                    casePlanner.archive.showAll();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 7);
    }
}