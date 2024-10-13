package com.spring.jobPortal.jobPortal.repo;

import java.util.List;

import com.spring.jobPortal.jobPortal.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer>
{
	List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
}
