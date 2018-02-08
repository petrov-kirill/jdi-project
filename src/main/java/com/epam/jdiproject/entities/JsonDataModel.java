package com.epam.jdiproject.entities;

import java.util.List;

public class JsonDataModel {
    private List<Integer> summary;
    private List<String> elements;
    private List<String> color;
    private List<String> metals;
    private List<String> vegetables;

    public List<Integer> getSummary() {
        return summary;
    }

    public void setSummary(List<Integer> summary) {
        this.summary = summary;
    }

    public List<String> getElements() {
        return elements;
    }

    public void setElements(List<String> elements) {
        this.elements = elements;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    public List<String> getMetals() {
        return metals;
    }

    public void setMetals(List<String> metals) {
        this.metals = metals;
    }

    public List<String> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<String> vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public String toString() {
        return "JsonDataModel{" +
                "summary=" + summary +
                ", elements=" + elements +
                ", color=" + color +
                ", metals=" + metals +
                ", vegetables=" + vegetables +
                '}';
    }
}
