package testpages;
import base.Base;
import org.junit.Test;
import testpages.interfface.InterfacesOfTestPages;
import tests.CheckBoxPage;
import tests.RadioButtonPage;
import tests.TextBoxPage;
public class Pages extends Base implements InterfacesOfTestPages{
    @Test
    public void Pages() {
        new TextBoxPage();
        new CheckBoxPage();
        new RadioButtonPage();
    }
}