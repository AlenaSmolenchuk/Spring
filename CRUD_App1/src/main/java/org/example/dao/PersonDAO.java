package org.example.dao;

import org.example.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private static int PEOPLE_COUNT;
    // to use db
    private static final String URL = "jdbc:mysql://localhost:3306/first_db";
    private static final String USERNAME = "user";
    private static final String PASSWORD = "password";

    private static Connection connection;
    
    // to use ArrayList
    // private List<Person> people;

     static {
        try {
            Class.forName("org.mysql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // {
    //     people = new ArrayList<>();

    //     people.add(new Person(++PEOPLE_COUNT, "Non", 24 , "non@gmail.com"));
    //     people.add(new Person(++PEOPLE_COUNT,"Tom", 52, "tom@gmail.com"));
    //     people.add(new Person(++PEOPLE_COUNT,"Bob", 36, "bob@gmail.com"));
    //     people.add(new Person(++PEOPLE_COUNT,"Mike", 18, "mikey@gmail.com"));

    // }

    public List<Person> index() {
        List<Person> people = new ArrayList<>();
        
        try {
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM person";
            ResultSet resultSet = statement.executeQuery(SQL);
            
            while(resultSet.next()) {
                Person person = new Person();

                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString("name"));
                person.setAge(resultSet.getInt("age"));
                person.setEmail(resultSet.getString("email"));

                people.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return people;
    }

    public Person show(int id) {
        return people.stream()
                .filter(person -> person.getId() == id)
                .findAny()
                .orElse(null);
    }

    public void save(Person person) {
        // person.setId(++PEOPLE_COUNT);
        // people.add(person);

        try {
            Statement statement = connection.createStatement();
            String SQL = "INSERT INTO person VALUES("
                    + 1 + ",'" + person.getName() + "',"
                    + person.getAge()  + ",'"
                    + person.getEmail() + "')";

            statement.executeUpdate(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(int id, Person updatedPerson) {

        Person personToBeUpdated = show(id);

        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setAge(updatedPerson.getAge());
        personToBeUpdated.setEmail(updatedPerson.getEmail());
    }

    public void delete(int id) {
        people.removeIf(p -> p.getId() == id);
    }
}
