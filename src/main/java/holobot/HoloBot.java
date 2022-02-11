package holobot;

import holobot.exception.DukeException;
import holobot.misc.Parser;
import holobot.misc.Storage;
import holobot.misc.TaskList;

/**
 * KoroBot is a chatbot that tracks the list of tasks on hand.
 * @author Terng Yan Long
 * @version 9.0
 * @since 1.0
 */
public class HoloBot {
    private Storage storage;
    private TaskList listOfTasks;

    /**
     * Creates a new instance of HoloBot.
     */
    public HoloBot() {
        storage = new Storage();
        listOfTasks = storage.initTaskList(100); // Assume there will be no more than 100 tasks
    }

    /**
     * Transfers the user input to the parser, which generates an output for the DialogBox.
     *
     * @param userInput The command that the user entered.
     * @return Either the parsed string input or an exception message.
     */
    public String getResponse(String userInput) {
        try {
            return Parser.parse(userInput, listOfTasks);
        } catch (DukeException e) {
            return e.toString();
        }
    }

}