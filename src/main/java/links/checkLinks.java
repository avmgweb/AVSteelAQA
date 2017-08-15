package links;

import javax.net.ssl.HttpsURLConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * Created by Дмитрий on 10.08.2017.
 */
public class checkLinks {

    public static void verifyLinkActive(List<String> linksUrl){
        for(String linkUrl : linksUrl) {
            System.out.println(linkUrl);
            try {
                URL url = new URL(linkUrl);
                HttpsURLConnection httpsURLConnect = (HttpsURLConnection) url.openConnection();
                url.openConnection();
                httpsURLConnect.setConnectTimeout(3000);
                httpsURLConnect.connect();
                if (httpsURLConnect.getResponseCode() == 200) {
                    System.out.println(linkUrl + " - " + httpsURLConnect.getResponseMessage());
                }
                if (httpsURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
                    System.out.println(linkUrl + " - "
                            + httpsURLConnect.getResponseMessage() + " - "
                            + HttpURLConnection.HTTP_NOT_FOUND);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}