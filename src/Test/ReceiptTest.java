package Test;

import Model.Article.Article;
import Model.Receipt.Receipt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * @author Andou Emmanuel
 *
 */

//Test class for the Receipt class
class ReceiptTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private List<Article> articles;
    private Receipt receipt;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @BeforeEach
    public void setUp() {
        articles = new ArrayList<>();
        articles.add(new Article("Book", 12.49, true, false));
        articles.add(new Article("Music CD", 14.99, false, false));
        articles.add(new Article("Chocolate Bar", 0.85, true, false));
        receipt = new Receipt(articles);
    }

    @Test
    void printReceipt() {
        // Define the expected output
        String expectedOutput = "Receipt:\n" +
                "Book: $12.49 (Sales Tax: $0.00, Import Tax: $0.00)\n" +
                "Music CD: $16.49 (Sales Tax: $1.50, Import Tax: $0.00)\n" +
                "Chocolate Bar: $0.85 (Sales Tax: $0.00, Import Tax: $0.00)\n" +
                "Total Cost: $30.83\n" +
                "Total Tax: $1.50\n";

        // Call the printReceipt method
        receipt.printReceipt();


    }


    @Test
    public void testPrintReceiptWithNoItems() {
        // Create an empty list of articles
        articles.clear();

        // Define the expected output for an empty basket
        String expectedOutput = "Receipt:\n" +
                "Total Cost: $0.00\n" +
                "Total Tax: $0.00\n";

        // Call the printReceipt method
        receipt.printReceipt();


    }
}