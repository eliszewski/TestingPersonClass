package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetWeight(){ //writing test first
        Person person = new Person();
        int expected = 140;

        person.setWeight(expected);

        int actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetHeight(){ //writing test first
        Person person = new Person();
        int expected = 67;

        person.setHeight(expected);

        int actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetJob(){ //writing test first
        Person person = new Person();
        String expected = "boss";

        person.setJob(expected);

        String actual = person.getJob();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetId(){
        Person person = new Person();
        int expected = 4567;

        person.setId(expected);
        int actual = person.getId();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSetShirtColor(){
        Person person = new Person();
        String expected = "blue";

        person.setShirtColor(expected);
        String actual = person.getShirtColor();
        Assert.assertEquals(expected,actual);
    }
}
