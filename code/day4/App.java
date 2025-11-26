package com.training.day4;


import java.lang.reflect.Constructor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnection {

    private static volatile DatabaseConnection instance;
    private Connection connection;

    // Private constructor
    private DatabaseConnection() {
        // Reflection guard: prevent second instantiation
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }

    }

    // Double-checked locking
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    // Prevent cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning not allowed");
    }

    // Prevent breaking via serialization
    protected Object readResolve() {
        return getInstance();
    }
}

public class App {
	public static void main(String[] args) throws Exception {
        DatabaseConnection instance1 = DatabaseConnection.getInstance();

        // Attempt reflection
        Constructor<DatabaseConnection> constructor =
                DatabaseConnection.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        // This will throw RuntimeException
        DatabaseConnection instance2 = constructor.newInstance();

        System. out.println(instance1 == instance2); // never reached
    }
}
