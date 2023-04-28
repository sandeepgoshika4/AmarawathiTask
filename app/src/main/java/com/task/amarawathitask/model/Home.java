package com.task.amarawathitask.model;

import java.util.List;

public class Home {
    public List<ParentCategory> parent_categories;
    public List<SliderBanner> slider_banners;
    public List<OfferBanner> offer_banners;
    public List<Object> trending_banners;
    public List<TrendingProduct> trending_products;
    public List<AllProduct> all_products;

    public Home(List<ParentCategory> parent_categories, List<SliderBanner> slider_banners, List<OfferBanner> offer_banners, List<Object> trending_banners, List<TrendingProduct> trending_products, List<AllProduct> all_products) {
        this.parent_categories = parent_categories;
        this.slider_banners = slider_banners;
        this.offer_banners = offer_banners;
        this.trending_banners = trending_banners;
        this.trending_products = trending_products;
        this.all_products = all_products;
    }

    public List<ParentCategory> getParent_categories() {
        return parent_categories;
    }

    public void setParent_categories(List<ParentCategory> parent_categories) {
        this.parent_categories = parent_categories;
    }

    public List<SliderBanner> getSlider_banners() {
        return slider_banners;
    }

    public void setSlider_banners(List<SliderBanner> slider_banners) {
        this.slider_banners = slider_banners;
    }

    public List<OfferBanner> getOffer_banners() {
        return offer_banners;
    }

    public void setOffer_banners(List<OfferBanner> offer_banners) {
        this.offer_banners = offer_banners;
    }

    public List<Object> getTrending_banners() {
        return trending_banners;
    }

    public void setTrending_banners(List<Object> trending_banners) {
        this.trending_banners = trending_banners;
    }

    public List<TrendingProduct> getTrending_products() {
        return trending_products;
    }

    public void setTrending_products(List<TrendingProduct> trending_products) {
        this.trending_products = trending_products;
    }

    public List<AllProduct> getAll_products() {
        return all_products;
    }

    public void setAll_products(List<AllProduct> all_products) {
        this.all_products = all_products;
    }
}
