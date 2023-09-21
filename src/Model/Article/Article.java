package Model.Article;


/**
 * @author Andou Emmanuel
 *
 */
// class Article {}
public class Article {
    private String name;
    private double price;
    private boolean isTaxExempt;
    private boolean isImported;

//Contructor with parameter Article Class
    public Article(String name, double price, boolean isTaxExempt, boolean isImported) {
        this.name = name;
        this.price = price;
        this.isTaxExempt = isTaxExempt;
        this.isImported = isImported;
    }
//Getter and Setter Article Class
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isTaxExempt() {
        return isTaxExempt;
    }

    public void setTaxExempt(boolean taxExempt) {
        isTaxExempt = taxExempt;
    }

    public boolean isImported() {
        return isImported;
    }

    public void setImported(boolean imported) {
        isImported = imported;
    }
}
