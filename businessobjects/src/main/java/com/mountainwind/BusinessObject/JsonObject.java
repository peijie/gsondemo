package com.mountainwind.BusinessObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peijie on 19/2/2015.
 */
public class JsonObject {

    private int age = 52;
    private String name = "Jim Carrey";
    private JsonFirstObject jsnFO = new JsonFirstObject();
    private List<String> messages;

    public JsonObject() {
        this.messages = new ArrayList<String>() {
            {
                add("Hey, maybe I will give you..");
                add("Excuse me, I'd like to..");
                add("Brain freeze. Alrighty Then I just..");
            }
        };
    }

    public List<String> getMessages() {
        return messages;
    }

    public JsonFirstObject getFirstObject () {
        return jsnFO;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("age=");
        builder.append(this.age);
        builder.append("\n");

        builder.append("name=");
        builder.append(this.name);
        builder.append("\n");

        builder.append("JsonFirstObject=");
        builder.append(jsnFO.toString());
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
