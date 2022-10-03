package Factory;

import Factory.components.Button.AndroidButton;
import Factory.components.Button.IButton;
import Factory.components.Dropdown.AndroidDropdown;
import Factory.components.Dropdown.IDropdown;
import Factory.components.Menu.AndroidMenu;
import Factory.components.Menu.IMenu;

public class AndroidUIFactory implements UIFactory{

    @Override
    public IButton createButton() {
        return new AndroidButton();
    }

    @Override
    public IDropdown createDropDown() {
        return new AndroidDropdown();
    }

    @Override
    public IMenu createMenu() {
        return new AndroidMenu();
    }
}
