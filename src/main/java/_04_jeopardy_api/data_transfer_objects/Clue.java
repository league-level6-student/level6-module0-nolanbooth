package _04_jeopardy_api.data_transfer_objects;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Clue {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("game_id")
@Expose
private Integer gameId;
@SerializedName("value")
@Expose
private Integer value;
@SerializedName("daily_double")
@Expose
private Boolean dailyDouble;
@SerializedName("round")
@Expose
private String round;
@SerializedName("category")
@Expose
private String category;
@SerializedName("clue")
@Expose
private String clue;
@SerializedName("response")
@Expose
private String response;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public Integer getGameId() {
return gameId;
}

public void setGameId(Integer gameId) {
this.gameId = gameId;
}

public Integer getValue() {
return value;
}

public void setValue(Integer value) {
this.value = value;
}

public Boolean getDailyDouble() {
return dailyDouble;
}

public void setDailyDouble(Boolean dailyDouble) {
this.dailyDouble = dailyDouble;
}

public String getRound() {
return round;
}

public void setRound(String round) {
this.round = round;
}

public String getCategory() {
return category;
}

public void setCategory(String category) {
this.category = category;
}

public String getClue() {
return clue;
}

public void setClue(String clue) {
this.clue = clue;
}

public String getResponse() {
return response;
}

public void setResponse(String response) {
this.response = response;
}

}