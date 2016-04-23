package com.example.hitesh.movies.api;

/**
 * Created by hitesh on 23-04-2016.
 */
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CommentList{

    @SerializedName("results")
    private List<Comment> commentList;

    public List<Comment> getCommentList() {
        return commentList;
    }
}