package pl.sda.ui.view;

import lombok.RequiredArgsConstructor;
import pl.sda.jpa.service.WorkerService;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
public class MainMenu extends AbstractMenu {
    private final WorkerService workerService;

    @Override
    public List<MenuItem> getItems() {
        return Arrays.asList(
                new MenuItem("Departments", 1, null, new DepartmentMenu(workerService)),
                new MenuItem("Workers", 2, null, new WorkerMenu(workerService)),
                new MenuItem("Exit", 0, null, null)
        );
    }
}
