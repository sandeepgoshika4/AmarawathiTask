package com.task.amarawathitask.model;

public class CommonModel {
    String product_name;
    String description;
    String image;

    public CommonModel(String product_name, String description, String image) {
        this.product_name = product_name;
        this.description = description;
        this.image = image;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
