package com.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.todo.restmodels.StorageSpace;

public interface StorageSpaceRepo extends JpaRepository<StorageSpace, Integer > {
	
	
	@Query("Select a from StorageSpace a  left join a.information b  on a.information.StoreId=b.StoreId left join a.location l on a.location.id= l.id where 6371 * acos(cos(radians(?1)) *    cos(radians(l.latitude)) *  cos(radians(l.longitude) -    radians(?2)) + sin(radians(?1)) *    sin(radians(l.latitude))) < 500")
	List<StorageSpace> findUserByStatusAndName(double longitude, double lat);


}
