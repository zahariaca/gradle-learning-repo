/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.zahariaca.gradle;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        var product = new Product();
        product.name = "My-Name";
        product.description = "My-description";
        product.price = 16.7f;
        System.out.println(product);
    }
}
