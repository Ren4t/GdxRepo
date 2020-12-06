package ru.home.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import ru.home.game.base.BaseScreen;

public class MenuScreen extends BaseScreen {


    private Texture img;
    private Vector2 pos;
    private Vector2 v;

    @Override
    public void show() {
        super.show();

        img = new Texture("badlogic.jpg");
        pos = new Vector2();
        v = new Vector2();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        Gdx.gl.glClearColor(0.1f, 0.5f, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, pos.x, pos.y);
        batch.end();
        pos.add(v.nor());

    }

    @Override
    public void dispose() {
        super.dispose();
        img.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        v.set(screenX,Gdx.graphics.getHeight() - screenY);
        return super.touchDown(screenX, screenY, pointer, button);
    }
}
