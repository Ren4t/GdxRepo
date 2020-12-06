package ru.home.game;

import com.badlogic.gdx.Game;

import ru.home.game.screen.MenuScreen;


public class StarGame extends Game {


	@Override
	public void create() {
		setScreen(new MenuScreen());
	}
}
