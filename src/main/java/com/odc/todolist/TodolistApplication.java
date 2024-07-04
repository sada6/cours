package com.odc.todolist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.odc.todolist.model.Task;
import com.odc.todolist.model.repository.TaskRepository;
import com.odc.todolist.service.TaskService;

@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}
	// @Bean
	// CommandLineRunner runner(TaskRepository taskRepository){
	// 	return args ->{
	// 		for(int i = 0; i < 30; i++){
	// 			Task task = new Task();
	// 			task.setName("Tache "+i);
	// 			task.setDescription("Une petite tach e"+i);
	// 			task.setCompleted(i%2==0);
	// 			taskRepository.save(task);
	// 		}
	// 		//Rechercher une tache
	// 		taskRepository.findAll().forEach(System.out::println);
	// 		Task task = taskRepository.findById(1).orElse(null);

	// 		if(task != null){
	// 			System.out.println("******************************");
	// 			System.out.println(task);
	// 			System.out.println("*****************************");

	// 		}else{
	// 			System.out.println("Element Introuvable");
	// 		}
	// 		//Modifier une tache
	// 		task.setName("Une tache a ete modifieé");
	// 		task.setDescription("Modification de la tache... ");
	// 		taskRepository.save(task);
	// 		System.out.println("***************Apres modification de la tache");
	// 		System.out.println(task);


	// 	};
	// }

	@Bean
	CommandLineRunner runner(TaskService service){
		return args ->{
			service.add();			
			service.modifier();
		};
	}

}
