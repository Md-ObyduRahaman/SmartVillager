package com.smart.village.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.smart.village.model.AdminInformation;
import com.smart.village.model.UserSms;
import com.smart.village.repository.AdminInformationRepo;

public class AdminInformationImpl implements AdminInformationRepo {
	
	@Autowired
	AdminInformationRepo adminInformationRepo;

	@Override
	public List<AdminInformation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminInformation> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminInformation> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AdminInformation> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends AdminInformation> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<AdminInformation> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AdminInformation getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AdminInformation> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AdminInformation> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<AdminInformation> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AdminInformation> S save(S entity) {
		// TODO Auto-generated method stub
		return adminInformationRepo.save(entity);
	}

	@Override
	public Optional<AdminInformation> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(AdminInformation entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends AdminInformation> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends AdminInformation> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AdminInformation> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AdminInformation> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends AdminInformation> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<AdminInformation> findByemail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminInformation> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminInformation> findByissocode(String issocode) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
