package me.kingtux.jsonbuilder;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * A Gson JsonObject Builder
 *
 */
public class JsonObjectBuilder implements JsonElementBuilder {
    private JsonObject object = new JsonObject();

    public JsonObjectBuilder() {

    }

    public JsonObjectBuilder(JsonObject object) {
        this.object = object;
    }

    public JsonObjectBuilder add(String property, JsonElementBuilder value) {
        object.add(property, value.build());
        return this;
    }

    public JsonObjectBuilder add(String property, String value) {
        object.addProperty(property, value);
        return this;

    }

    public JsonObjectBuilder add(String property, Number value) {
        object.addProperty(property, value);
        return this;

    }

    public JsonObjectBuilder add(String property, Boolean value) {
        object.addProperty(property, value);
        return this;
    }

    public JsonObjectBuilder add(String property, Character value) {
        object.addProperty(property, value);
        return this;
    }

    @Override
    public JsonElement build() {
        return object;
    }

    @Override
    public String buildString() {
        return JsonBuilder.GSON.toJson(this);
    }
}
