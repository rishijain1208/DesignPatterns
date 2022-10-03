package Factory;

public class UIFactoryFactory {

    public static UIFactory getUIFactory(SupportedPlatforms platform)
    {
        if(platform==SupportedPlatforms.ANDROID)
        {
            return new AndroidUIFactory();
        }
        else if(platform==SupportedPlatforms.IOS)
        {
            return new IosUIFactory();
        }
        return null;
    }
}
