package com.tradeshift.javie;

import org.springframework.stereotype.Repository;

/**
 * Created by Javie on 15/7/22.
 */
//@Repository
public class LolGame implements IGame {

    public String play() {
        return " is a lol player!\n";
    }
}
