package com.song.dailytime.dailytime.service.serviceInterface;


import com.song.dailytime.dailytime.Entity.ArticleVO;

import java.util.List;

public interface ArticleServiceInterFace {
    //保存文章
    int saveArticle(ArticleVO articleVO);

    //删除文章
    int deleteArticle(String id);

    //更新文章
    int updateArticle(ArticleVO articleVO);

    //根据ID查找文章
    ArticleVO selectArticleById(String id);

    //查询文章列表
    List<ArticleVO> queryArticleList();

}
