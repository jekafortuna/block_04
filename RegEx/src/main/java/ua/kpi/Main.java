package ua.kpi;

/**
 * Created on 11. November. 16.
 * Main class for run the application
 *
 * @author Evgeniy
 */
public class Main {
    public static void main(String[] args) {

        // Initialization
        Notebook notebook = new Notebook();
        View view = new View();
        Controller controller = new Controller(notebook, view);

        // Run
        controller.processUser();
    }
}
