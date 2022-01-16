package testpages.interfface;
import tests.*;

import java.io.IOException;

public interface InterfacesOfTestPages{
    TextBoxPage t = new TextBoxPage();
    CheckBoxPage c = new CheckBoxPage();
    RadioButtonPage r = new RadioButtonPage();
    WebTablesPage w = new WebTablesPage();
    ButtonsPage b = new ButtonsPage();
    DynamicPropertiesPage d = new DynamicPropertiesPage();
    LinksPage l = new LinksPage();
    ThreadLocal<BrokenLinksImagesPage> br = ThreadLocal.withInitial(() -> {
        try {
            return new BrokenLinksImagesPage();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    });
    UploadAndDownloadPage ud = new UploadAndDownloadPage();
    DynamicPropertiesPage dy = new DynamicPropertiesPage();
}