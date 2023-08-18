package src.structural.proxy.webpage_proxy;

import java.util.ArrayList;
import java.util.List;

public class WebPageProxy implements WebPage {
    List<String> restrictedUrls;
    private WebPage webPage;

    public WebPageProxy() {

        webPage = new WebPageImp();
        loadRestrictedWebSites();

    }

    private void loadRestrictedWebSites() {

        restrictedUrls = new ArrayList<>();

        restrictedUrls.add("www.xyz.com");
        restrictedUrls.add("www.x-web.com");
        restrictedUrls.add("www.unofficial-livestream.com");

    }

    @Override
    public void renderUrl(String url) {

        if (restrictedUrls.contains(url)) {
            System.out.println("Restricted URL: " + url + " is restricted by your ISP");
            return;
        }

        webPage.renderUrl(url);

    }
}
