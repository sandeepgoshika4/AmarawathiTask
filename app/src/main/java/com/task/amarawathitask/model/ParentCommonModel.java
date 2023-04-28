package com.task.amarawathitask.model;

import java.util.List;

public class ParentCommonModel {
    List<CommonModel> models;
    String title;

    public ParentCommonModel(List<CommonModel> models, String title) {
        this.models = models;
        this.title = title;
    }

    public List<CommonModel> getModels() {
        return models;
    }

    public void setModels(List<CommonModel> models) {
        this.models = models;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
