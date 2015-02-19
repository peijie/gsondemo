package com.mountainwind.BusinessObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peijie on 19/2/2015.
 */
public class JsonFirstObject {

    private int age = 76;
    private String name = "Morgan Freeman";
    private JsonSecondObject jsnSO = new JsonSecondObject();
    private List<String> messages;

    public JsonFirstObject() {
        this.messages = new ArrayList<String>() {
            {
                add("I once heard a wise man say..");
                add("Well, what is it today? More..");
                add("Bruce... I'm God. Circumstances have..");
            }
        };
    }

    public List<String> getMessages () {
        return messages;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Class name: JsonFirstObject\n");
        builder.append("age=");
        builder.append(this.age);
        builder.append("\n");

        builder.append("name=");
        builder.append(this.name);
        builder.append("\n");

        builder.append("JsonFirstObject=");
        builder.append(jsnSO.toString());
        builder.append("\n");

        builder.append("messages={\n");
        for(String s: messages) {
            builder.append("\t");
            builder.append(s);
            builder.append("\n");
        }
        builder.append("}");


        return builder.toString();
    }


}
