package rims.myinfo;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.List;

public class RssItemArrayAdapter extends ArrayAdapter<RssItem> {


    private Context context;
    private List<RssItem> news;


    public RssItemArrayAdapter(Context context, List<RssItem> news) {
        super(context, android.R.layout.simple_list_item_1, news);
        this.news = news;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(this.context).inflate(R.layout.rss_item_layout, null);
            holder = new ViewHolder();

            holder.rsstitle = convertView.findViewById(R.id.title_TextView);
            holder.rsstext = convertView.findViewById(R.id.description_TextView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        RssItem item = this.news.get(position);
        holder.rsstitle.setText(item.title);
        holder.rsstext.setText(item.description);
        return convertView;
    }


    static class ViewHolder {
        TextView rsstitle;
        TextView rsstext;
    }
}