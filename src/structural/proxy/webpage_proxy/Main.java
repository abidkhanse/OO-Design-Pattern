package src.structural.proxy.webpage_proxy;

public class Main {
    public static void main(String[] args) {

        WebPage webPage = new WebPageProxy();

        webPage.renderUrl("www.youtube.com");
        webPage.renderUrl("www.java.com");
        webPage.renderUrl("www.xyz.com");

    }
}
