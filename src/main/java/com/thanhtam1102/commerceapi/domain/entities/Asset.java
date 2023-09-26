package com.thanhtam1102.commerceapi.domain.entities;

import java.time.ZonedDateTime;

public class Asset extends BaseEntity<AssetId> {

    private String url;
    private String description;
    private String fileName;
    private Integer fileSize;
    private ZonedDateTime created;

}
