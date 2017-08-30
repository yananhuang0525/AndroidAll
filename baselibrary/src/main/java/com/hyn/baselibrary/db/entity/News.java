package com.hyn.baselibrary.db.entity;

/**
 * Date：2017/7/18
 * Time: 16:11
 * author: huangyanan
 */

public class News {
    private String title;//标题
    private String content;//内容
    private String time;//时间
    private String author;//作者

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
