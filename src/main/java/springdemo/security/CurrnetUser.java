package springdemo.security;

import am.itspace.springdemo.model.User;
import am.itspace.springdemo.model.UserType;
import org.springframework.security.core.authority.AuthorityUtils;

public class CurrnetUser extends org.springframework.security.core.userdetails.User {

    private User user;
    public CurrnetUser(User user){
        super(user.getEmail(),user.getPassword(), AuthorityUtils.createAuthorityList(user.getUserType().name()));
        this.user=user;
    }

    public User getUser() {
        return user;
    }

    public int getUserId(){
        return user.getId();
    }

    public UserType getUserType(){
        return user.getUserType();
    }
}
