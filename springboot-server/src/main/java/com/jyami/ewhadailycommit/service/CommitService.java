package com.jyami.ewhadailycommit.service;

import com.jyami.ewhadailycommit.crawler.Commit;
import com.jyami.ewhadailycommit.crawler.GitHomeCrawler;
import com.jyami.ewhadailycommit.crawler.JsoupConnection;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jyami on 2020/03/17
 */
@Service
public class CommitService {

    public List<Commit> getUserCommits(String userCommitURL){
        Document connectionWithUserName = JsoupConnection.getConnectionWithUserName(userCommitURL);
        return GitHomeCrawler.getAllBlockOfYears(connectionWithUserName);
    }

}
