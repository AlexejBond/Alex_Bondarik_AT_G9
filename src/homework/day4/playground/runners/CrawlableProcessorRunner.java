package homework.day4.playground.runners;

import homework.day4.playground.essence.creatures.*;
import homework.day4.playground.processors.CrawlableProcessor;

public class CrawlableProcessorRunner {
    public static void main(String[] args) {

        CrawlableProcessor crawlableProcessor = new CrawlableProcessor();

        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        Vertebrata vertebrataCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insect insectBeetle = new Beetle(43, "Christmas Insect");
        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");
        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";

            @Override
            public void crawl(String direction, int distance) {
                System.out.println("I am " + this.getClass().getSimpleName() + ", my name is " + name + " and I am crawling to " + direction + " for " + distance + " units");
            }
        };

        crawlableProcessor.runCrawlable(aBeetle);
        crawlableProcessor.runCrawlable(aCrocodile);
        crawlableProcessor.runCrawlable(anonymousCrawlable);
//      crawlableProcessor.runCrawlable(vertebrataCrocodile);  - Vertebrata class does not implement Crawlable interface
        crawlableProcessor.runCrawlable(crawlableCrocodile);
//      crawlableProcessor.runCrawlable(insectBeetle); - Insect class doesn't implement Crawlable interface
//      crawlableProcessor.runCrawlable(vertebrataCrocodile);

        crawlableProcessor.runCrawlable(crawlableBeetle, "NOWHERE");
        crawlableProcessor.runCrawlable(crawlableBeetle, "TO THE LEFT");

        crawlableProcessor.runCrawlable(crawlableBeetle, "BACK", 37);

        crawlableProcessor.runCrawlable(anonymousCrawlable);

        crawlableProcessor.runCrawlable(new Crawlable() {
            String name = "Anonymous";

            @Override
            public void crawl(String direction, int distance) {
                System.out.println("My name is " + name + " and I am crawling to " + direction + " for " + distance + " units");
            }
        }, "DOWN", 37);
    }

}



