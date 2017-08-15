package selector;

import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Дмитрий on 04.08.2017.
 */
public class selectors {

    public static Map<String, By> getSelectors(String formName) throws InterruptedException {
        Map<String , By> fieldBy = new HashMap<String, By>() {{
            switch (formName) {
                case ("Project calculation"):
                    put("name",By.cssSelector("input[name=\"form_text_71\"]"));
                    put("telephone", By.cssSelector("input[name=\"form_text_72\"]"));
                    put("idForm", By.xpath("//*[@name=\"av_steel_form_1\"]/input[@name=\"WEB_FORM_ID\"]"));
                    put("submit", By.xpath("//*[@name=\"av_steel_form_1\"]//*[@name=\"web_form_submit\"]"));
                    break;

                case ("Callback request"):
                    put("name",By.cssSelector("input[name=\"form_text_76\"]"));
                    put("telephone", By.cssSelector("input[name=\"form_text_77\"]"));
                    put("idForm", By.xpath("//*[@name=\"av_steel_form_callBack\"]/*[@name=\"WEB_FORM_ID\"]"));
                    put("submit", By.xpath("//*[@name=\"av_steel_form_callBack\"]//*[@name=\"web_form_submit\"]"));
                    break;

                case ("Order of corrugated board"):
                    put("name",By.cssSelector("input[name=\"form_text_78\"]"));
                    put("mail", By.cssSelector("input[name=\"form_text_79\"]"));
                    put("message", By.cssSelector("input[name=\"form_text_87\"]"));
                    put("idForm", By.xpath("//*[@name=\"av_steel_Order_Now\"]/*[@name=\"WEB_FORM_ID\"]"));
                    put("submit", By.xpath("//*[@name=\"av_steel_Order_Now\"]//*[@name=\"web_form_submit\"]"));
                    break;

                case ("Affiliate request"):
                    put("organization",By.cssSelector("input[name=\"form_text_75\"]"));
                    put("name", By.cssSelector("input[name=\"form_text_84\"]"));
                    put("telephone", By.cssSelector("input[name=\"form_text_85\"]"));
                    put("mail", By.cssSelector("input[name=\"form_email_86\"]"));
                    put("idForm", By.xpath("//*[@name=\"av_steel_patners_form\"]/*[@name=\"WEB_FORM_ID\"]"));
                    put("submit", By.xpath("//*[@name=\"av_steel_patners_form\"]//*[@name=\"web_form_submit\"]"));
                    break;

                case ("Quick order form"):
                    put("name", By.cssSelector("input[name=\"form_text_81\"]"));
                    put("telephone", By.cssSelector("input[name=\"form_text_82\"]"));
                    put("idForm", By.xpath(".//*[@id='comp_2be93780002226f2cdce029cc4aef5d3']/div/form/input[4]"));
                    put("submit", By.xpath("//*[@name=\"av_steel_catalog_order\"]//*[@name=\"web_form_submit\"]"));
                    break;

                default:
                    System.out.println("ERROR");
                    break;
            }
        }};
        return fieldBy;
    }


}
