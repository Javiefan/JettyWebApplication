package com.tradeshift.javie;

import org.springframework.stereotype.Repository;


/**
 * Created by Javie on 15/7/22.
 */


@Repository
public class DotaGame implements IGame {

    public String play() {
        return " is a dota2 player!\n";
    }
}
