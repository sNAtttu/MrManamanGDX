package com.gdx.manaman;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gdx.manaman.helpers.AssetLoader;
import com.gdx.manaman.screens.GameScreen;

public class ManamanGame extends Game {
	
	@Override
	public void create () {
		AssetLoader.Load();
		setScreen(new GameScreen());
	}

	@Override
	public void dispose () {
		super.dispose();
		AssetLoader.dispose();
	}
}
