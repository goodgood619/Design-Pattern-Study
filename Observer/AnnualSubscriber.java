package com.company.Observer;

public class AnnualSubscriber implements Observer {
    private String newsString;
    private Publisher publisher;

    public AnnualSubscriber(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.add(this);
    }
    @Override
    public void update(String title, String news) {
        this.newsString = title + '\n'+news;
        display();
    }
    public void withdraw() {
        this.publisher.delete(this);
    }
    private void display() {
        System.out.println("오늘의 뉴스 : "+newsString);
    }
}
