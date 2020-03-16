package com.jyami.ewhadailycommit.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Created by jyami on 2020/03/16
 */
public class JsoupConnection {

    public static Document getConnectionWithUserName(String url){
        return Jsoup.parse(url);
    }

}
