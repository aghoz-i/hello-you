package id.ac.cs.ui.ppl.helloyou.service;

import id.ac.cs.ui.ppl.helloyou.model.User;

import java.util.List;

public interface UserService {

  User createUser(String name);

  List<User> getUsers();

  User getUserById(String id);

  void deleteUser(String id);
}
