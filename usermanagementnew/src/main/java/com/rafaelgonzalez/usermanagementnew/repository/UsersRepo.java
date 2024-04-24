
package com.rafaelgonzalez.usermanagementnew.repository;

import com.rafaelgonzalez.usermanagementnew.entity.OurUsers;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepo extends JpaRepository<OurUsers, Integer>{
    Optional<OurUsers> findByEmail(String email);
}
