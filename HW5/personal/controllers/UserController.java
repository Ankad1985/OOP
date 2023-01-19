package personal.controllers;

import personal.model.Repository;
import personal.model.User;

import java.util.List;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) throws Exception {
        validate(user);
        repository.CreateUser(user);
    }

    public User readUser(String userId) throws Exception{
        return repository.readUser(userId);
    }
    public List<User> readUserList(){
        return repository.getAllUsers();
    }
    public User updateUser(User user) throws Exception {
        validate(user);
        return repository.updateUser(user);
    }
    public void deleteUser(String id) throws Exception{
        repository.deleteUser(id);
    }

    private void validate(User user) throws Exception {
        if(user.getFirstName().isEmpty())
        {
            throw new Exception("No name!");
        }
        if(user.getLastName().isEmpty())
        {
            throw new Exception("No last name!");
        }
        if(user.getPhone().isEmpty())
        {
            throw new Exception("No phone!");
        }
    }
}
