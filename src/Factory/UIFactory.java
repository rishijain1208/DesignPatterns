package Factory;

import Factory.components.Button.IButton;
import Factory.components.Dropdown.IDropdown;
import Factory.components.Menu.IMenu;

public interface UIFactory {

    public IButton createButton();

    public IMenu createMenu();

    public IDropdown createDropDown();
}
