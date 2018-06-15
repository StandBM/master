package com.zb.entity;

public class Student {
    public Student(String stuName,String id,String classId){
        this.stuName = stuName;
        this.id = id;
        this.classId = classId;
    }

    private String stuName;
    private String id;
    private String classId;
    private String className;

    public String getClassName(){
        return className;
    }
    public void setClassName(String className){
        this.className = className;
    }

    public String getStuName(){
        return stuName;
    }
    public void setStuName(String stuName){
        this.stuName = stuName;
    }

    public String getId(){
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getClassId(){
        return classId;
    }
    public void setClassId(String classId){
        this.classId = classId;
    }

}
