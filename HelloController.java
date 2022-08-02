package com.nunueffe.redis.demo.controller;
aaaaa
bbbb
ccccc
import java.util.List;
CHANGE006CHANGE006CHANGE006CHANGE006CHANGE006CHANGE006CHANGE006CHANGE006CHANGE006CHANGE006
import java.util.stream.StreamSupport;
CHANGE001CHANGE001CHANGE001CHANGE001CHANGE001CHANGE001CHANGE001
XXXXQQQQQQQQQQQQQQQQQQQXXXXXXXXXXXXXXXXXXXZZZZZZZZZZZZZZZ
aaaaaaaaaaaaaaaaxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
change002change002change002change002change002change002change002change002change002change002change002change002change002change002change002
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
007007007007007007007007007007007007
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nunueffe.redis.demo.entity.Person;
import com.nunueffe.redis.demo.repository.PersonRepository;
import com.nunueffe.redis.demo.service.PeopleService;

import io.micrometer.core.annotation.Timed;

@RestControllerCCCCCCCCCCCCCCCDDDDDDDDDDDDDDDDCCCCCCCCCCCCC
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
DDDDDDDDDDDDDDDDDDDDDD
		return StreamSupport.stream(personRepository.findAll().spliterator(), false).toList();
	}
	
	@GetMapping("/{id}")
	public Person getById(@PathVariable String id) {
		

		return helloService.getHelloById(id);
	}
CCCCCCCCCCCCCCCCCCCCC
	
}
