package com.athena.dintshang.repository;

/**
 * Created by siphokazi on 2017/05/20.
 */

import com.athena.dintshang.domain.User;
/*import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;*/
import org.springframework.stereotype.Repository;

@Repository
//public interface UserRepository extends JpaRepository<User,Long> {
public interface UserRepository  {

    /*@Query("SELECT u FROM User u WHERE u.email = ?1")
     User findByEmail(String email);*/

}
