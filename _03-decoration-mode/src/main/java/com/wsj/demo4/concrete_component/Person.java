package com.wsj.demo4.concrete_component;

import com.wsj.demo4.component.ICharacter;

//具体人类
public class Person implements ICharacter {

	private String name;
    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的"+name);
    }
}



