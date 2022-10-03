package Factory;

import Factory.components.Button.IButton;

public class Client {

    public static void main(String[] args)
    {
        Flutter flutter = new Flutter();

        UIFactory android = flutter.createUIFactory(SupportedPlatforms.ANDROID);

        IButton androidButton = android.createButton();

        androidButton.changeSize();

    }
}
