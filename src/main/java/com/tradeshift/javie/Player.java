package com.tradeshift.javie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by Javie on 15/7/22.
 */
@XmlRootElement
@Service
public class Player {
    private String name;
    private String level;

    @Autowired
    private IGame game;

    public String play() {
        return this.game.play();
    }

    @Override
    public String toString() {
        return "name:"+name+","+"level:"+level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
