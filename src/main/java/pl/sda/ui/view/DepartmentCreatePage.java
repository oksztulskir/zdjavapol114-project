package pl.sda.ui.view;

import java.util.Scanner;

public class DepartmentCreatePage implements Page {
    @Override
    public void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Department name: ");
        String name = scanner.next();


    }
}
