package com.thanhtam1102.commerceapi.infrastructure.entities;

import com.thanhtam1102.commerceapi.domain.domain_core.entities.BaseEntity;
import com.thanhtam1102.commerceapi.domain.domain_core.entities.CategoryId;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.ZonedDateTime;
import java.util.UUID;

@NoArgsConstructor
@Entity
@Table(name = "categories")
public class JpaCategory extends BaseEntity<CategoryId> {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private JpaCategory parent;

    @Column(nullable = false)
    private String slug;

    @Column(nullable = false)
    private String name;

    private String description;
    private Integer products;

    @CreationTimestamp
    private ZonedDateTime created;

    @CreationTimestamp
    private ZonedDateTime updated;

    public JpaCategory(JpaCategory parent, String slug, String name, String description) {
        this.parent = parent;
        this.slug = slug;
        this.name = name;
        this.description = description;
    }
}
