/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productcatalogdemo;

/**
 *
 * @author Acer
 */
public class Movie extends Product {
    
    private int lenght;
    
    public Movie(String name, double price, int lenght) {
     
        super(name, price);
        this.lenght = lenght;
    }
    
    public int getRunlenght() {
        return this.lenght;
    }
    
    public int setRunlenght(int setLenght) {
        return this.lenght = setLenght;
    }
    
    @Override
    public String getType() {
        return "Movie";
    }
    
}
