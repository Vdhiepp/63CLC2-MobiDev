package vn.edu.tinhoc123.vieccanlam;

import java.util.HashMap;

public class TASKS {
    String name;
    String date;
    String message;
    String priority;

    public TASKS(String name, String date, String message, String priority) {
        this.name = name;
        this.date = date;
        this.message = message;
        this.priority = priority;
    }

    public TASKS() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    //
    public HashMap<String, String> toFireBaseObject() {
        HashMap<String, String> taskObject = new HashMap<String, String>();
        taskObject.put("name",name);
        taskObject.put("date",name);
        taskObject.put("message",name);
        taskObject.put("priority",name);
        return taskObject;
    }
}
