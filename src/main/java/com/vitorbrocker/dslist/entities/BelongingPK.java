package com.vitorbrocker.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;

    public BelongingPK(){
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof BelongingPK that)) return false;

        return game.equals(that.game) && list.equals(that.list);
    }

    @Override
    public int hashCode() {
        int result = game.hashCode();
        result = 31 * result + list.hashCode();
        return result;
    }
}
