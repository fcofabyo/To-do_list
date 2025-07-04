package com.example.demo.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.swing.Spring;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_task")
public class TaskModel {

    /**
     * 
     * ID
     * Usuário (ID_USUARIO)
     * Descrição
     * Título
     * Data de início
     * Data de término
     * Prioridade
     * 
     */

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String description;

    @Column(length = 50)
    private Spring title;
    private LocalDateTime starAt;
    private LocalDateTime endAt;
    private Spring priority;

    private UUID idUser;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
