/*
 * Copyright (c) 2022
 * For Nix
 */
package com.nix.alextuleninov.task1;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

/**
 * The Student class consists data about students.
 * @version 01
 *
 * @author Alexander Tuleninov
 */
@Log4j
@Getter
@Setter
public class Student {
    private String name;
    private int age;

    /**
     * This method displays data about an object of class Student.
     *
     * @param name          student's name
     * @return              displays data about an object of class Student
     * */
    public String displayDataOfStudent(String name) {
        return "Name: " + name + ", age: " + age + "\n";
    }
}
