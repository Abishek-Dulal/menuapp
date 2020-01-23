package com.narayanahotel.menuapp.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "menuItem")
public class MenuItem {

    @Id
    private String itemName;

    @Lob
    private String details;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "itemImages",
    joinColumns = @JoinColumn(name = "itemName",referencedColumnName = "itemName"))
    private Collection<ItemImage>  itemimages = new ArrayList<>();

    @ElementCollection(fetch = FetchType.EAGER)
    @MapKeyEnumerated(EnumType.STRING)
    @CollectionTable(name = "itemRate",
    joinColumns = @JoinColumn(name = "itemName" ,referencedColumnName = "itemName"))
    private Map<QUANTITY,ItemRate> itemRates = new HashMap<>();

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Collection<ItemImage> getItemimages() {
        return itemimages;
    }

    public void setItemimages(Collection<ItemImage> itemimages) {
        this.itemimages = itemimages;
    }

    public Map<QUANTITY, ItemRate> getItemRates() {
        return itemRates;
    }

    public void setItemRates(Map<QUANTITY, ItemRate> itemRates) {
        this.itemRates = itemRates;
    }

    public void addImage(ItemImage img){
        itemimages.add(img);
    }

    public void putItemRate(QUANTITY quantity,ItemRate rate){
        itemRates.put(quantity,rate);
    }



}
