package com.example.demo.model;

/**
 * Represents a User entity with an ID, name, and surname.
 * This class provides the necessary getters and setters to access
 * and modify the user data.
 */
public class User {

    // User's ID
    private long id;

    // User's name
    private String name;

    // User's surname
    private String surname;

    /**
     * Constructs a new User instance with the specified ID, name, and surname.
     *
     * @param id       The unique identifier for the user.
     * @param name     The name of the user.
     * @param surname  The surname of the user.
     */
    public User(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    /**
     * Gets the user's ID.
     *
     * @return The user's ID.
     */
    public long getId() {
        return id;
    }

    /**
     * Gets the user's name.
     *
     * @return The user's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the user's surname.
     *
     * @return The user's surname.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the user's ID.
     *
     * @param id The unique identifier to assign to the user.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Sets the user's name.
     *
     * @param name The name to assign to the user.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the user's surname.
     *
     * @param surname The surname to assign to the user.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
}
