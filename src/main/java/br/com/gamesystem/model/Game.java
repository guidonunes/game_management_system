package br.com.gamesystem.model;

public class Game {
    private int id;
    private String title;
    private boolean isFinished;
    private double price;

    public Game(String title, boolean isFinished, double price) {
        this.title = title;
        this.isFinished = isFinished;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
