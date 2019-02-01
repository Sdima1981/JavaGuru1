package own_study.training.product;

/**
 * Необходимо описать класс Product. Данный класс должен описывать состояние и поведение продукта.
 * <p>
 * Требования:
 * Необходимо создать класс Product. Параметры которые необходимы:
 * <p>
 * название (name) - тип данных String
 * стандартная цена (regularPrice) - тип данных double
 * скидка в процентах (discount) - тип данных double
 * <p>
 * Функциональные требования:
 * для каждого поля необходимо создать геттер и сеттер (Getters & Setters)
 * метод который возвращает цену с учетом скидки (calculateActualPrice)
 * метод для вывода на консоль всей информации о продукте (printInformation)
 * Пример вывода информации на консоль, при условии, что значения name = milk, regularPrice = 0.8, discount = 20:
 * "Product : name = milk, regular price = 0.8 EUR, discount = 20%, actual price = 0.64 EUR"
 * <p>
 * Протестировать/продемонстрировать работу класса Product в классе ProductTest (в методе main).
 * Залить в архиве zip оба файла Product.java и ProductTest.java
 */
class Product {
    String name;
    double regularPrice;
    double discount;

    public static void main(String[] args) {


        Product product = new Product ();

        product.name = "milk";
        product.regularPrice = 0.8;
        product.discount = 20.0;

        String productName = product.name;
        double productRegularPrice = product.regularPrice;
        double productDiscount = product.discount;
        double productActualPrice = product.calculateActualPrice ();
        int discountWithoutDecimal = (int) productDiscount;


        //System.out.println ("Product name is " + productName + "Product regulal price is " + productRegularPrice + productDiscount + productActualPrice);
        System.out.println ("Product name is " + productName);
        System.out.println ("Product regulal price is " + productRegularPrice + " €");
        System.out.println ("Product discount is " + discountWithoutDecimal + "%");
        System.out.println ("Product actual price is " + productActualPrice + " €");

    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRegularPrice(Double regularPrice) {
        return regularPrice;
    }

    public void setRegularPrice(Double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public Double getDiscount(Double discount) {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    double calculateActualPrice() {
        double actualPrice = regularPrice - (discount / 100 * regularPrice);
        return actualPrice;
    }
}

