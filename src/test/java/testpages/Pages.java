package testpages;
import base.Base;
import org.junit.Test;
import testpages.interfface.InterfacesOfTestPages;
import tests.*;

import java.io.IOException;
import java.text.BreakIterator;

public class Pages extends Base implements InterfacesOfTestPages{
    @Test
    public void Pages() throws IOException {
        new TextBoxPage();
        new CheckBoxPage();
        new RadioButtonPage();
        new WebTablesPage();
        new ButtonsPage();
        new LinksPage();
        new BrokenLinksImagesPage();
        new UploadAndDownloadPage();
        new DynamicPropertiesPage();
    }
}