package pl.sda.ui.view;

import lombok.RequiredArgsConstructor;
import pl.sda.jpa.service.WorkerService;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
public class WorkerMenu extends AbstractMenu {
    private final WorkerService workerService;

    @Override
    public List<MenuItem> getItems() {
        return Arrays.asList(
                new MenuItem("Create", 1, this, new WorkerCreatePage(workerService)), // TODO actionPage reference
                new MenuItem("Update", 2, this, null), // TODO actionPage reference
                new MenuItem("Show all", 3, this, null), // TODO actionPage reference
                new MenuItem("Delete", 4, this, null), // TODO actionPage reference
                new MenuItem("Back to main menu", 0, new MainMenu(workerService), null)
        );
    }
}
