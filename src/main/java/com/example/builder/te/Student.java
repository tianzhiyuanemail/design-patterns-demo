/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.builder.te;

public class Student {

    private String name;

    private String age;


    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public static class Builder {
        private String name;

        private String age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(String age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
