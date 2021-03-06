package com.Project.PetBook.Services;

import com.Project.PetBook.Models.MyUser;
import com.Project.PetBook.Models.VerificationToken;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface MyUserService extends UserDetailsService {

    public MyUser insertUser(MyUser user);

    public List<MyUser> getSuggestedFriends();

    public MyUser getUserByUsername(String userName);

    public MyUser getUserById(int id);

    public List<MyUser> getFriendList();

    public MyUser getUserByEmail(String email);

    public void updatePassword(String password, Integer userId);

    public MyUser register(MyUser myUser);

    public String verifyUser(VerificationToken verificationToken);

    public boolean checkIfUserNameNotExists(String username);

    public boolean checkIfEmailNotExists(String email);
}
