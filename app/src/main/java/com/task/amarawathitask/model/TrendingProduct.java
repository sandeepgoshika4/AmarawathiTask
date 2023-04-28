package com.task.amarawathitask.model;

public class TrendingProduct {
    public String id;
    public String category_id;
    public String parent_category_id;
    public String child_category_id;
    public String parent_category_name;
    public String child_category_name;
    public String product_name;
    public String product_slug;
    public String product_code;
    public String description;
    public String mrp_price;
    public String discount;
    public String price;
    public String weight;
    public String image;
    public Object dealof_day;
    public Object dealof_date;
    public String trending_product;
    public String status;
    public String created_at;
    public String updated_at;

    public TrendingProduct(String id, String category_id, String parent_category_id, String child_category_id, String parent_category_name, String child_category_name, String product_name, String product_slug, String product_code, String description, String mrp_price, String discount, String price, String weight, String image, Object dealof_day, Object dealof_date, String trending_product, String status, String created_at, String updated_at) {
        this.id = id;
        this.category_id = category_id;
        this.parent_category_id = parent_category_id;
        this.child_category_id = child_category_id;
        this.parent_category_name = parent_category_name;
        this.child_category_name = child_category_name;
        this.product_name = product_name;
        this.product_slug = product_slug;
        this.product_code = product_code;
        this.description = description;
        this.mrp_price = mrp_price;
        this.discount = discount;
        this.price = price;
        this.weight = weight;
        this.image = image;
        this.dealof_day = dealof_day;
        this.dealof_date = dealof_date;
        this.trending_product = trending_product;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getParent_category_id() {
        return parent_category_id;
    }

    public void setParent_category_id(String parent_category_id) {
        this.parent_category_id = parent_category_id;
    }

    public String getChild_category_id() {
        return child_category_id;
    }

    public void setChild_category_id(String child_category_id) {
        this.child_category_id = child_category_id;
    }

    public String getParent_category_name() {
        return parent_category_name;
    }

    public void setParent_category_name(String parent_category_name) {
        this.parent_category_name = parent_category_name;
    }

    public String getChild_category_name() {
        return child_category_name;
    }

    public void setChild_category_name(String child_category_name) {
        this.child_category_name = child_category_name;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_slug() {
        return product_slug;
    }

    public void setProduct_slug(String product_slug) {
        this.product_slug = product_slug;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMrp_price() {
        return mrp_price;
    }

    public void setMrp_price(String mrp_price) {
        this.mrp_price = mrp_price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Object getDealof_day() {
        return dealof_day;
    }

    public void setDealof_day(Object dealof_day) {
        this.dealof_day = dealof_day;
    }

    public Object getDealof_date() {
        return dealof_date;
    }

    public void setDealof_date(Object dealof_date) {
        this.dealof_date = dealof_date;
    }

    public String getTrending_product() {
        return trending_product;
    }

    public void setTrending_product(String trending_product) {
        this.trending_product = trending_product;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
