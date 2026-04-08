package com.vibol.basic.Java8.to.Java._5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import com.learn.java.date.java17.Product;

public class RecordExampleTest {


	@Test
	void createProduct() {
		
		// given
		var product = new Product("Iphone", new BigDecimal("999.99"), "ELECTRONICS");
		
		// when
		System.out.println("Product : " + product);
		assertEquals("Iphone", product.name());
		assertEquals("ELECTRONICS", product.type());
	}
	
	@Test
    void createProduct_nameNotValid() {
        //given
        //when

        var exception = assertThrows(IllegalArgumentException.class,
                ()->  new Product("",
                        new BigDecimal("999.99"),
                        "ELECTRONICS"));

        //then
        assertEquals("name is not valid!", exception.getMessage());
    }

    @Test
    void createProduct_costNotValid() {
        //given
        //when

        var exception = assertThrows(IllegalArgumentException.class,
                ()->  new Product("Iphone",
                        new BigDecimal("-999.99"),
                        "ELECTRONICS"));

        //then
        assertEquals("cost is not valid!", exception.getMessage());
    }
    
    @Test
	void createProduct_CustomConstructor() {
		
		// given
		var product = new Product("Iphone", new BigDecimal("999.99"));
		
		// when
		System.out.println("Product : " + product);
		assertEquals("Iphone", product.name());
		assertEquals("GENERAL", product.type());
	}
    
    //custom test to what field you want
    
    @Test
    void createProductComparison() {
        //given
        var product = new Product("Iphone",
                new BigDecimal("999.99"), "ELECTRONICS1"
        );

        var product1 = new Product("Iphone",
                new BigDecimal("999.99"), "ELECTRONICS"
        );

        //then
        assertEquals(product, product1);
    }
    

}
