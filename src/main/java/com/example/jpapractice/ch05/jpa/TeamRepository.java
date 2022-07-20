package com.example.jpapractice.ch05.jpa;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, String> {
}
