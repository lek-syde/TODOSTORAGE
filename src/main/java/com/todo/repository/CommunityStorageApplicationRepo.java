package com.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.restmodels.CommunitySpaces;


public interface CommunityStorageApplicationRepo extends JpaRepository<CommunitySpaces, Integer > {

}
