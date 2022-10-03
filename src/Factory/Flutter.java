package Factory;

public class Flutter {

    public void setTheme()
    {
        //
    }

    public void setRefreshRate()
    {
        //
    }

    public UIFactory createUIFactory(SupportedPlatforms platform)
    {
        return UIFactoryFactory.getUIFactory(platform);
    }
}
