package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
        private int id;
        private String fullName;
        private String age;
        private String address;

        public Student(){}

        public Student(int sid, String fullName, String age, String address) {
            this.id = sid;
            this.fullName = fullName;
            this.age = age;
            this.address = address;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return fullName;
        }

        public String getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        public void setSid(int sid) {
            this.id = sid;
        }

        public void setName(String name) {
            this.fullName = name;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String toString(){
            String s = " student name : " + getName() + " student id : " + getId() + " student age : " + getAge() + " student address : " + getAddress() ;
            return s;
        }

}
