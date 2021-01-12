package rims.myinfo;

public class RssItem {
    public String title;
    public String description;
    public String pubDate;
    public String link;

    public RssItem(String title,String description,String pubDate,String link){
        this.title = title;
        this.description = description;
        this.pubDate = pubDate;
        this.link = link;
    }
    public RssItem(String title) {
        this.title = title;
    }
    @Override
    public String toString(){
        return this.title;
    }
}
