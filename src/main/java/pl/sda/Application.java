package pl.sda;

import pl.sda.jpa.dao.WorkerDao;
import pl.sda.jpa.service.WorkerService;
import pl.sda.ui.view.MainMenu;

public class Application {
    public static void main(String[] args) {
        WorkerDao workerDao = new WorkerDao();
        WorkerService workerService = new WorkerService(workerDao);

        MainMenu mainMenu = new MainMenu(workerService);
        mainMenu.show();
    }
}
