package com.izdebski.SpringBootRESTfulAPIDocWithSwaggerAdvance.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "The database generated product ID")
    @Column(name="id")
    private Integer id;

    @Version
    @ApiModelProperty(notes = "The auto-generated version of the product")
    @Column(name="version")
    private Integer version;

    @ApiModelProperty(notes = "The application-specific product ID")
    @Column(name="product_id")
    private String productId;

    @ApiModelProperty(notes = "The product description")
    @Column(name="description")
    private String description;

    @ApiModelProperty(notes = "The image URL of the product")
    @Column(name="image_url",length=4000)
    private String imageUrl;

    @ApiModelProperty(notes = "The price of the product", required = true)
    @Column(name="price")
    private BigDecimal price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}