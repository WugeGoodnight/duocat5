package com.wuge.duocat.service;

/**
 * Created by wuhao on 16/1/5.
 */

import java.util.List;

import com.wuge.duocat.dao.ForumDao;
import com.wuge.duocat.model.Forum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForumServiceImpl implements ForumService {

    @Autowired
    ForumDao forumDao;

    public List<Forum> getAllForums()
    {
        return forumDao.getAllForums();
    }
}
