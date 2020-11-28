package singleton;

import java.io.Serializable;

public class Settings implements Serializable {

    private Settings () {};
    private static Settings settings = null;

    public static Settings getSettings() {
        return InnerSettingsClass.instance;
    }

    private static class InnerSettingsClass {
        private static final Settings instance = new Settings();
    }

    private boolean darkMode = false;
    private int fontSize = 13;

    public boolean getDarkMode() {return darkMode;}
    public int getFontSize() {return fontSize;}

    public void setDarkMode(boolean _darkMode) {
        darkMode = _darkMode;
    }

    public void setFontSize(int _fontSize) {
        fontSize = _fontSize;
    }
}
