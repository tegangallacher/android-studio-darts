package com.example.user.firstandroidhomework;
import java.util.*;
/**
 * Created by user on 12/12/2016.
 */
public class Player {

    private String name;
    private String nickname;
    private int ranking;

    public Player(String name, String nickname, int ranking) {
        this.name = name;
        this.nickname = nickname;
        this.ranking = ranking;
    }

    public String getName() {
        return this.name;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getRanking() {
        return this.ranking;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return String.format("Name: " + name + ", Nickname: " + nickname + ", Ranking: " + ranking);
    }

}
