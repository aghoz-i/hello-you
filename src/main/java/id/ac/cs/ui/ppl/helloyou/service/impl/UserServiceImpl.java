package id.ac.cs.ui.ppl.helloyou.service.impl;

import id.ac.cs.ui.ppl.helloyou.model.User;
import id.ac.cs.ui.ppl.helloyou.repository.UserRepository;
import id.ac.cs.ui.ppl.helloyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  UserRepository userRepository;

  @Override
  public User createUser(String name) {
    var playlist = User.builder()
                        .name(name)
                        .build();
    return userRepository.save(playlist);
  }

  @Override
  public List<User> getUsers() {
    return userRepository.findAll();
  }

  @Override
  public User getUserById(String id) {
    return userRepository.getReferenceById(id);
  }

  @Override
  public void deleteUser(String id) {
    userRepository.deleteById(id);
  }
}
