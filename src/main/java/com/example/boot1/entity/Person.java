package com.example.boot1.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ConfigurationProperties 告诉boot将配置文件和本类属性绑定
 * 此组件是容器中的，@ConfigurationProperties才有用
 * 默认从全局配置文件获取值
 *
 * @PropertySource()读取指定配置文件,只能读取properties
 */
@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private boolean sex;
    private int age;
    private Date birthDate;

    private Dog dog;
    private List<Object> l1;
    private Map<String,String> map;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", dog=" + dog +
                ", l1=" + l1 +
                ", map=" + map +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public List<Object> getL1() {
        return l1;
    }

    public void setL1(List<Object> l1) {
        this.l1 = l1;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
