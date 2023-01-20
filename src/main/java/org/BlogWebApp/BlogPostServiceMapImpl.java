package org.BlogWebApp;

import java.util.Collection;
import java.util.HashMap;

public class BlogPostServiceMapImpl implements BlogPostService{
    private HashMap<String, BlogPost> postMap;

    public BlogPostServiceMapImpl() {
        postMap = new HashMap<>();
    }

    @Override
    public void addPost(BlogPost blogPost){
        postMap.put(blogPost.getId(), blogPost);
    }
    @Override
    public Collection<BlogPost> getPosts() {
        return postMap.values();
    }
    @Override
    public BlogPost getPost(String id) {
        return postMap.get(id);
    }
    @Override
    public BlogPost editPost(BlogPost forEdit) throws BlogPostException {
        try {
            if (forEdit.getId() == null) throw new BlogPostException("ID cannot be blank");

            BlogPost toEdit = postMap.get(forEdit.getId());

            if (forEdit.getPost() != null) {
                toEdit.setPost(forEdit.getPost());
            }
            if (forEdit.getId() != null){
                toEdit.setId(forEdit.getId());
            }
            return toEdit;
        }catch (Exception e) {
            throw new BlogPostException(e.getMessage());
        }
    }
    @Override
    public void deletePost(String id) {
        postMap.remove(id);
    }
    @Override
    public void deletePosts() {
        postMap.clear();
    }
    @Override
    public boolean postExist(String id) {
        return postMap.containsKey(id);
    }
}
