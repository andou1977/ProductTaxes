package Model.Receipt;

import Interface.InterfaceReceipt;
import Model.Article.Article;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andou Emmanuel
 *
 */
// class Receipt {} that implement InterfaceReceipt
public class Receipt implements InterfaceReceipt {
    private List<Article> articles;

    public Receipt(List<Article> articles) {
        this.articles = articles;
    }



    // Print the receipt
    public void printReceipt() {
        double totalCost = 0;
        double totalTax = 0;
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println("Receipt:");

        for (Article article : articles) {
            double itemPrice = article.getPrice();
            // Base sales tax rate
            double taxRate = article.isTaxExempt() ? 0 : 0.10;
            // Import tax rate
            double importTaxRate = article.isImported() ? 0.05 : 0;
            // Rounding up to the nearest 0.05
            double salesTax = Math.ceil((taxRate * itemPrice) * 20) / 20.0;
            // Rounding up to the nearest 0.05
            double importTax = Math.ceil((importTaxRate * itemPrice) * 20) / 20.0;
            double totalItemCost = itemPrice + salesTax + importTax;
            totalCost += totalItemCost;
            totalTax += salesTax + importTax;

            System.out.println(
                    article.getName() + ": $" + df.format(totalItemCost) +
                            " (Sales Tax: $" + df.format(salesTax) +
                            ", Import Tax: $" + df.format(importTax) + ")"
            );
        }

        System.out.println("Total Cost: $" + df.format(totalCost));
        System.out.println("Total Tax: $" + df.format(totalTax));
    }

}







