package Factory;

import Factory.components.Button.IButton;
import Factory.components.Button.IosButton;
import Factory.components.Dropdown.IDropdown;
import Factory.components.Dropdown.IosDropdown;
import Factory.components.Menu.IMenu;
import Factory.components.Menu.IosMenu;

public class IosUIFactory implements UIFactory {

    @Override
    public IDropdown createDropDown() {
        return new IosDropdown();
    }

    @Override
    public IButton createButton() {
        return new IosButton();
    }

    @Override
    public IMenu createMenu() {
        return new IosMenu();
    }
}
