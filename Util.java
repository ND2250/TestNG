import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Util {
    public static void SelectValueFromDropdown(WebElement element, String Value ){
        Select select = new Select(element);
        select.selectByVisibleText(Value);
    }


}
