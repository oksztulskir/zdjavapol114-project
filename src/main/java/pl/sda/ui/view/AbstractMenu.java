package pl.sda.ui.view;

import java.util.List;
import java.util.Scanner;

public abstract class AbstractMenu implements Page {
    public abstract List<MenuItem> getItems();

    public void show() {
        getItems().forEach((item) -> {
            System.out.println(item.getOption() + " - " + item.getDescription());
        });

        Scanner scanner = new Scanner(System.in);
        MenuItem foundItem = null;
        while (foundItem == null) {
            System.out.print("Your choice: ");
            int option = scanner.nextInt();
            foundItem = getItems().stream()
                    .filter(item -> option == item.getOption())
                    .findFirst()
                    .orElse(null);
            if (foundItem != null) {
                if (foundItem.getOption() == 0) {
                    if (foundItem.getParent() == null) {
                        System.exit(0);
                    } else {
                        foundItem.getParent().show();
                    }
                } else {
                    foundItem.getActionPage().show();
                    foundItem.getParent().show();
                }
            }
        }
    }
}
