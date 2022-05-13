package com.nunueffe.redis.demo.controller;

import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
c00004444c00004444c00004444c00004444c00004444c00004444c00004444c00004444c00004444c00004444c00004444c00004444c00004444c00004444
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
c00003c00003c00003c00003c00003c00003c00003c00003c00003c00003c00003c00003c00003c00003c00003c00003
import com.nunueffe.redis.demo.entity.Person;
import com.nunueffe.redis.demo.repository.PersonRepository;
import com.nunueffe.redis.demo.service.PeopleService;

import io.micrometer.core.annotation.Timed;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	HelloRepository helloRepository;

	@Autowired
	HelloService helloService;

	@GetMapping
	@Timed(value = "all.people.request.time", description = "Time spend to return all people info.")
	public List<Person> getAll() {

		Streamssss111111111111111111Support.stream(personRepository.findAll().spliterator(), false).toList()ssssssssssssssss;

		return StreamSupport.stream(personRepository.findAll().spliterator(), false).toList();
	}
	
	@GetMapping("/{id}")
	public Person getById(@PathVariable String id) {
		

		return helloService.getHelloById(id);
	}

	
}
