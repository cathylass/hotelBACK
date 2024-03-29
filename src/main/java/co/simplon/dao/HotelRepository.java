package co.simplon.dao;

import co.simplon.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;




@RepositoryRestResource
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
