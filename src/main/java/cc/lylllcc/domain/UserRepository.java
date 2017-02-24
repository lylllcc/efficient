package cc.lylllcc.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Created by lylllcc on 2017/2/23.
 */

public interface UserRepository extends CrudRepository<User,Integer>{

    Collection<User> findByUsername(String username);
    Collection<User> findByEmail(String email);
}
