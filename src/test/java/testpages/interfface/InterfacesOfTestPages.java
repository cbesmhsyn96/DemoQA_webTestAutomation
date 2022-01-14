package testpages.interfface;
import tests.CheckBoxPage;
import tests.RadioButtonPage;
import tests.TextBoxPage;
import tests.WebTablesPage;

public interface InterfacesOfTestPages{
    TextBoxPage t = new TextBoxPage();
    CheckBoxPage c = new CheckBoxPage();
    RadioButtonPage r = new RadioButtonPage();
    WebTablesPage w = new WebTablesPage();
}