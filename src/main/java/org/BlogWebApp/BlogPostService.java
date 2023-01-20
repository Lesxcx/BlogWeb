package org.BlogWebApp;

import java.util.Collection;

public interface BlogPostService {
    public void addPost(BlogPost blogPost);
    public Collection<BlogPost> getPosts();
    public BlogPost getPost(String id);
    public BlogPost editPost(BlogPost blogPost) throws BlogPostException;
    public void deletePost(String id);
    public void deletePosts();
    public boolean postExist(String id);
}
