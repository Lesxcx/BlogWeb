package org.BlogWebApp;

public class BlogPost {
    private String id;
    private String post;

    public BlogPost(String id, String post) {
        this.id = id;
        this.post = post;
    }

    public String getId() {
        return id;
    }

    public String getPost() {
        return post;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
