package com.greenart.MyHome.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
   //@Size(min=2, max=30, message = "제목은 2자이상 30자 이하입니다.")
    private String title;
    
    private String content;
    

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "user_id")
	 * 
	 * @JsonIgnore private User user;
	 */
}