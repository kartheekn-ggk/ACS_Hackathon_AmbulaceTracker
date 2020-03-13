package com.Ambulance.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class CustomRepository implements RestRepository{

	@Override
	public List<Ambulance> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return this.findAll();
	}

	@Override
	public List<Ambulance> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return this.findAllById(ids);
	}

	@Override
	public <S extends Ambulance> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return this.saveAll(entities);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		this.flush();
	}

	@Override
	public <S extends Ambulance> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return this.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<Ambulance> entities) {
		// TODO Auto-generated method stub
		this.deleteInBatch(entities);
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		this.deleteAllInBatch();
	}

	@Override
	public Ambulance getOne(Long id) {
		// TODO Auto-generated method stub
		return this.getOne(id);
	}

	@Override
	public <S extends Ambulance> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return this.findAll(example);
	}

	@Override
	public <S extends Ambulance> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return this.findAll(example, sort);
	}

	@Override
	public Page<Ambulance> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return this.findAll(pageable);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return this.existsById(id);
	}

	@Override
	public void delete(Ambulance entity) {
		// TODO Auto-generated method stub
		this.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Ambulance> entities) {
		// TODO Auto-generated method stub
		this.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		this.deleteAll();
	}

	@Override
	public <S extends Ambulance> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return this.findOne(example);
	}

	@Override
	public <S extends Ambulance> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Ambulance> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Ambulance> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Ambulance> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Ambulance> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ambulance save(Ambulance ambul) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
