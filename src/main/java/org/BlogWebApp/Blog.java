package org.BlogWebApp;

import java.util.Scanner;

import com.google.gson.Gson;

import static spark.Spark.*;

public class Blog {

    private final BlogPostService blogPostService = new BlogPostServiceMapImpl();

    public Blog(){
//        menu();
        Scanner scanner = new Scanner(System.in);

        get("/posts", (request, response) -> {
            response.type("application/json");
            return new Gson().toJson(
                    new StandardResponse(StatusResponce.SUCCESS, new Gson().toJsonTree(blogPostService.getPosts()).toString()));
        });
//                    GET http://localhost:4567/posts
        post("/post",(request, response) -> {
            response.type("application/json");
            BlogPost blogPost = new Gson().fromJson(request.body(),BlogPost.class);
            blogPostService.addPost(blogPost);
            return new Gson().toJson(new StandardResponse(StatusResponce.SUCCESS));
        });
        get("/post/:id",(request, response) -> {
            response.type("application/json");
            return new Gson().toJson(
                    new StandardResponse(StatusResponce.SUCCESS,new Gson().toJsonTree(blogPostService.getPost(request.params(":id"))))
            );
        });
        put("/post/:id", (request, response) -> {
            response.type("application/json");
            BlogPost toEdit = new Gson().fromJson(request.body(),BlogPost.class);
            BlogPost editedPost = blogPostService.editPost(toEdit);

            if (editedPost != null){
                return new Gson().toJson(
                        new StandardResponse(StatusResponce.SUCCESS, new Gson().toJsonTree(editedPost)));
            } else {
                return new Gson().toJson(
                        new StandardResponse(StatusResponce.ERROR,new Gson().toJson("Post not found or error in edit")));
            }
        });
        delete("/posts",(request, response) -> {
            response.type("application/json");
            blogPostService.deletePosts();
            return new Gson().toJson(new StandardResponse(StatusResponce.SUCCESS,"posts deleted"));
        });
        delete("/post/:id",(request, response) -> {
            response.type("application/json");
            blogPostService.deletePost(request.params(":id"));
            return new Gson().toJson(new StandardResponse(StatusResponce.SUCCESS,"post deleted"));
        });
        options("/post/:id",(request, response) -> {
            response.type("application/json");
            return new Gson().toJson(new StandardResponse(
                    StatusResponce.SUCCESS,blogPostService.postExist(request.params("/:id")) ? "Post exist" : "Post does not exist"));
        });
        }
    }

//    public void menu() {
//        System.out.println("What you wanna do?\n" +
//                "1: Get list of all posts.\n" +
//                "2: Get post with given id.\n" +
//                "3: Add new post.\n" +
//                "4: Check whether a post exist with given id.\n" +
//                "5: Delete a particular post.\n" +
//                "6: Delete all posts.\n" +
//                "7: Exit blog.");
//    }
//}
