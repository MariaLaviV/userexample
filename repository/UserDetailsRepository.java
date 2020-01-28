package com.example.userexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userexample.dto.UserDetailsMetaData;
import com.example.userexample.entity.UserDetails;
import com.example.userexample.util.ServicesUtil;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer>{

	default void deleteEntity(UserDetailsMetaData dto) {
		delete(ServicesUtil.mapModel(dto, UserDetails.class));
	}

	default UserDetailsMetaData find(Integer id) {
		return ServicesUtil.mapModel((findById(id).get()), UserDetailsMetaData.class);
	}

	default UserDetails save(UserDetailsMetaData dto) {
		return save(ServicesUtil.mapModel(dto, UserDetails.class));
	}
	
	@SuppressWarnings("unchecked")
	default List<UserDetails> findAll() {
		return (List<UserDetails>) ServicesUtil.mapModel(findAll(), UserDetails.class);
	}
}
