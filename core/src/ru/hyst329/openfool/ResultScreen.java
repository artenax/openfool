package ru.hyst329.openfool;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;

/**
 * Created by main on 18.03.2017.
 */
public class ResultScreen implements Screen {
    private final OpenFoolGame game;
    private final Result result;

    public enum Result {
        WON,
        LOST,
        PARTNER_LOST,
        DRAW
    }

    public ResultScreen(OpenFoolGame game, Result result) {
        this.game = game;
        this.result = result;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Color color = Color.BLACK;
        String header = "", text = "";
        switch (result) {
            case WON:
                color = new Color(0.2f, 0.6f, 0.125f, 1);
                header = "Victory!";
                text = "Your team has defeated the opponents!";
                break;
            case LOST:
                color = new Color(0.6f, 0.2f, 0.125f, 1);
                header = "Defeat :(";
                text = "Your team has lost the game.";
                break;
            case PARTNER_LOST:
                color = new Color(0.6f, 0.4f, 0.125f, 1);
                header = "Still a defeat...";
                text = "You have managed to finish the game, but your partner hasn't.";
                break;
            case DRAW:
                color = new Color(0.6f, 0.6f, 0.125f, 1);
                header = "It's a draw";
                text = "You and your opponents achieved a peaceful result.";
                break;
        }
        GlyphLayout headerLayout = new GlyphLayout(game.font, header);
        GlyphLayout textLayout = new GlyphLayout(game.font, text);
        Gdx.gl.glClearColor(color.r, color.g, color.b, color.a);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.font.draw(game.batch, headerLayout,
                400 - headerLayout.width / 2,
                400 - headerLayout.height / 2);
        game.font.draw(game.batch, textLayout,
                400 - textLayout.width / 2,
                280 - textLayout.height / 2);
        game.batch.end();
        if (Gdx.input.isTouched()) {
            game.setScreen(new MainMenuScreen(game));
            dispose();
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

}