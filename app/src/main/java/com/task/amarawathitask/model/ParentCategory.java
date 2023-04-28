package com.task.amarawathitask.model;

public class ParentCategory {
    public String id;
    public String parent_id;
    public String name;
    public String description;
    public Object url;
    public String icon;
    public String status;
    public String sort;
    public String created_at;
    public String updated_at;

    public ParentCategory(String id, String parent_id, String name, String description, Object url, String icon, String status, String sort, String created_at, String updated_at) {
        this.id = id;
        this.parent_id = parent_id;
        this.name = name;
        this.description = description;
        this.url = url;
        this.icon = icon;
        this.status = status;
        this.sort = sort;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
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
