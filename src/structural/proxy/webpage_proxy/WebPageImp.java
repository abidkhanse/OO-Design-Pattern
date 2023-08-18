package src.structural.proxy.webpage_proxy;

public class WebPageImp implements WebPage{
    @Override
    public void renderUrl(String url) {

        System.out.println("Enjoy the " +  url);
    }
}
