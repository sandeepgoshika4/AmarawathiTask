package com.task.amarawathitask.model;

public class SliderBanner {
    public String id;
    public String image;
    public String category_id;
    public String title;
    public String tag;
    public String content;
    public String promocode;
    public String status;
    public String slider_banner;
    public String offer_banner;
    public String trending_banner;
    public Object created_at;
    public Object updated_at;

    public SliderBanner(String id, String image, String category_id, String title, String tag, String content, String promocode, String status, String slider_banner, String offer_banner, String trending_banner, Object created_at, Object updated_at) {
        this.id = id;
        this.image = image;
        this.category_id = category_id;
        this.title = title;
        this.tag = tag;
        this.content = content;
        this.promocode = promocode;
        this.status = status;
        this.slider_banner = slider_banner;
        this.offer_banner = offer_banner;
        this.trending_banner = trending_banner;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPromocode() {
        return promocode;
    }

    public void setPromocode(String promocode) {
        this.promocode = promocode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSlider_banner() {
        return slider_banner;
    }

    public void setSlider_banner(String slider_banner) {
        this.slider_banner = slider_banner;
    }

    public String getOffer_banner() {
        return offer_banner;
    }

    public void setOffer_banner(String offer_banner) {
        this.offer_banner = offer_banner;
    }

    public String getTrending_banner() {
        return trending_banner;
    }

    public void setTrending_banner(String trending_banner) {
        this.trending_banner = trending_banner;
    }

    public Object getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Object created_at) {
        this.created_at = created_at;
    }

    public Object getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Object updated_at) {
        this.updated_at = updated_at;
    }
}
