package com.wuge.duocat.dao;

/**
 * Created by wuhao on 16/1/5.
 */
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.wuge.duocat.model.Forum;


@Repository
public class ForumDaoImpl implements ForumDao {

    public List<Forum> getAllForums()
    {
        List<Forum> forums = new ArrayList<Forum>();
        Forum forum1 = new Forum();
        forum1.setnId(1);
        forum1.setnNews(32);
        forum1.setStrImgURL("http://www.baidu.com");
        forum1.setStrName("名称1");
        forum1.setStrIntro("简介1");

        Forum forum2 = new Forum();
        forum2.setnId(1);
        forum2.setnNews(32);
        forum2.setStrImgURL("http://www.baidu.com");
        forum2.setStrName("名称2");
        forum2.setStrIntro("简介2");

        forums.add(forum1);
        forums.add(forum2);

        return forums;
    }

}
