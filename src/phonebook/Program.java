package phonebook;

import java.util.logging.*;

public class Program {
    public static void main(String[] args) {

        phonebook.LoggerClass.logger.log(Level.INFO, "Start program");

        phonebook.Menu.menu();

        phonebook.LoggerClass.logger.log(Level.INFO, "Stop program");
    }

}