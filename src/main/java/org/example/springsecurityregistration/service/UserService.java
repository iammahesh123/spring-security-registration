    package org.example.springsecurityregistration.service;

    import org.example.springsecurityregistration.DTO.RegistrationRequest;
    import org.example.springsecurityregistration.model.User;
    import org.example.springsecurityregistration.repository.UserRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    @Service
    public class UserService {

        @Autowired
        private UserRepository userRepository;

        public void registerUser(RegistrationRequest request) {
            User user = new User();
            user.setUsername(request.getUsername());
            user.setEmail(request.getEmail());
            user.setPassword(request.getPassword());
            userRepository.save(user);
        }
    }

