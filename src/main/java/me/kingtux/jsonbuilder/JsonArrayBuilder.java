package me.kingtux.jsonbuilder;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

/**
 * A Gson JsonArray Builder
 */
public class JsonArrayBuilder implements JsonElementBuilder {
    private JsonArray jsonArray = new JsonArray();

    public JsonArrayBuilder() {

    }

    public JsonArrayBuilder(JsonArray jsonArray) {
        this.jsonArray = jsonArray;
    }

    public JsonArrayBuilder add(Boolean bool) {
        jsonArray.add(bool);
        return this;
    }

    public JsonArrayBuilder add(Character character) {
        jsonArray.add(character);
        return this;
    }

    public JsonArrayBuilder add(Number number) {
        jsonArray.add(number);
        return this;
    }

    public JsonArrayBuilder add(String string) {
        jsonArray.add(string);
        return this;
    }

    public JsonArrayBuilder add(JsonElementBuilder element) {
        jsonArray.add(element.buildString());
        return this;

    }

    public JsonArrayBuilder addAll(JsonArray array) {
        jsonArray.addAll(array);
        return this;
    }

    public JsonArrayBuilder set(int index, JsonElementBuilder element) {
        jsonArray.set(index, element.build());
        return this;
    }

    @Override
    public JsonElement build() {
        return jsonArray;
    }

    @Override
    public String buildString() {
        return JsonBuilder.GSON.toJson(this);
    }
}
