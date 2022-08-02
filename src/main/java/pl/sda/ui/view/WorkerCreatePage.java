package pl.sda.ui.view;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import pl.sda.jpa.service.WorkerService;

import java.util.Scanner;

public class WorkerCreatePage implements Page {
    private final WorkerService workerService;

    public WorkerCreatePage(WorkerService workerService) {
        this.workerService = workerService;
    }

    @Override
    public void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First name: ");
        String firstName = scanner.next();
        System.out.print("Last name: ");
        String lastName = scanner.next();

        workerService.create(firstName, lastName);
    }
}
