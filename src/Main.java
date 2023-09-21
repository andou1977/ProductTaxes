import Model.Article.Article;
import Model.Receipt.Receipt;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a sample receipt with Articles
        List<Article> articles = new ArrayList<>();
        articles.add(new Article("Book", 12.49, true, false));
        articles.add(new Article("Music CD", 14.99, false, false));
        articles.add(new Article("Chocolate Bar", 0.85, true, false));

        Receipt receipt = new Receipt(articles);
        receipt.printReceipt();
    }
}