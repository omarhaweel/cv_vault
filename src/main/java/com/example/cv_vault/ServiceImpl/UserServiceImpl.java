package com.example.cv_vault.ServiceImpl;


import com.example.cv_vault.dtos.UserDto;
import com.example.cv_vault.entities.User;
import com.example.cv_vault.repositories.UserRepository;
import com.example.cv_vault.services.UserService;
import org.springframework.stereotype.Service;
import java.util.List;
import static java.util.stream.Collectors.toList;


/**
 * Authored by: Omar Haweel, omarhaweel@gmail.com 6.2025
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto getUserById(Long id){
        return userRepository.getUserById(id)
                .map(this::toDto)
                .orElse(null);
    }

    @Override
    public UserDto getUserByEmail(String email) {
        return userRepository.findByEmail(email)
                .map(this::toDto)
                .orElse(null);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(this::toDto)
                .collect(toList());
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setJobTitle(userDto.getJobTitle());
        user.setEmail(userDto.getEmail());
        user.setPhoneNumber(String.valueOf(userDto.getPhoneNumber()));
        user.setAddress(userDto.getAddress());
        user.setNationality(userDto.getNationality());
        user.setDrivingLicense(userDto.getDrivingLicense());
        this.userRepository.save(user);
        return toDto(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }


    /**
     * Converts a User entity to a UserDto.
     */
    private UserDto toDto(User user) {
        if (user == null) {
            return null;
        }
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setJobTitle(user.getJobTitle());
        userDto.setEmail(user.getEmail());
        userDto.setPhoneNumber(user.getPhoneNumber());
        userDto.setAddress(user.getAddress());
        userDto.setNationality(user.getNationality());
        userDto.setDrivingLicense(user.getDrivingLicense());
        return userDto;
    }
}
