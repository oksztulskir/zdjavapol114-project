package pl.sda.ui.view;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MenuItem {
    private String description;

    private int option;

    private Page parent;

    private Page actionPage;
}
