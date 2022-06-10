package com.ragnarok.todosistemas.tasktoolapi.services.impl;

import com.ragnarok.todosistemas.tasktoolapi.model.Task;
import com.ragnarok.todosistemas.tasktoolapi.model.User;
import com.ragnarok.todosistemas.tasktoolapi.repository.UserRepository;
import com.ragnarok.todosistemas.tasktoolapi.services.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServicesImpl implements UserServices {

    @Autowired
    private final UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        User searchuser = userRepository.findById(user.getId()).get();
        searchuser.setName(user.getName());
        searchuser.setEmployeeId(user.getEmployeeId());
        searchuser.setDni(user.getDni());
        searchuser.setEmail(user.getEmail());
        searchuser.setContactNumber(user.getContactNumber());
        return userRepository.save(searchuser);
    }

    @Override
    public boolean deleteUser(Long id) {
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
