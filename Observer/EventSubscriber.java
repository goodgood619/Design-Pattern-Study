package com.company.Observer;

public class EventSubscriber implements Observer {
    private String newsString;
    private Publisher publisher;

    public EventSubscriber(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.add(this);
    }

    @Override
    public void update(String title, String news) {
        newsString = title+"\n"+news;
        display();
    }
    public void withdraw() {
        this.publisher.delete(this);
    }

    private void display() {
        System.out.println("이벤트 유저 : \n");
        System.out.println(newsString);
    }
}
