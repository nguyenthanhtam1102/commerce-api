package com.thanhtam1102.commerceapi.domain.entities;

import java.time.ZonedDateTime;

public class Category extends BaseEntity<CategoryId> {

    private CategoryId parentId;
    private String slug;
    private String name;
    private String description;
    private Integer products;
    private ZonedDateTime created;
    private ZonedDateTime updated;

}
