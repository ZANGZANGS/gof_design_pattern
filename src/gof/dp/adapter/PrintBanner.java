package gof.dp.adapter;

public class PrintBanner implements Print{//Adapter

    private Banner banner;

    public PrintBanner(String str){
        this.banner = new Banner(str);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }

}
