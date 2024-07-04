package com.odc.todolist.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.odc.todolist.model.Task;
import com.odc.todolist.model.repository.TaskRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class TaskService {
    private final TaskRepository repository;
    public void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ajout d'une nouvelle tache");

        System.out.println("Nom: ");
        String nom= scanner.nextLine();

        System.out.println("Description: ");
        String description = scanner.nextLine();

        Task task = new Task();
        task.setName(nom);
        task.setDescription(description);
        task.setCompleted(false);

        repository.save(task);


    }

    // public void modifier(){
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("id task a modifier: ");
    //     String id= scanner.nextLine();

	// 		Task task1 = repository.findById(1).orElse(null);

	// 		if(task1 != null){
    //             System.out.println("Nouveau Nom: ");
    //             String nom= scanner.nextLine();
        
    //             System.out.println("Nouvel Description: ");
    //             String description = scanner.nextLine();
    //             task1.setName(nom);
    //             task1.setDescription(description);
    //             task1.setCompleted(false);
    //             repository.save(task1);

	// 		}else{
	// 			System.out.println("Element Introuvable");
	// 		}


    // }
}
