/**
 * 
 */
package com.taxtoken.Taxtoken;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Teja
 *
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByName(String name);
	boolean existsByName(String name);
}
