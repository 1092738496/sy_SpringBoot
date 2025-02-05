package com.meditation.pojo;



public class press {
    private int id;
    private String date;
    private String title;
    private String title1;
    private String version;
    private String column;
    private String text;
    private String author;
    private String url;

    public press(int id, String date, String title, String title1, String version, String column, String text, String author, String url) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.title1 = title1;
        this.version = version;
        this.column = column;
        this.text = text;
        this.author = author;
        this.url = url;
    }

    public press() {
    }

    @Override
    public String toString() {
        return "press{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", title1='" + title1 + '\'' +
                ", version='" + version + '\'' +
                ", column='" + column + '\'' +
                ", text='" + text + '\'' +
                ", author='" + author + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getTitle1() {
        return title1;
    }

    public String getVersion() {
        return version;
    }

    public String getColumn() {
        return column;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public String getUrl() {
        return url;
    }
}
