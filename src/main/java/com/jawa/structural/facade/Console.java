package com.jawa.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class Console {

    private List<Viewport> viewports = new ArrayList<>();
    private int width,height;

    public Console(int x, int y) {
        this.width = x;
        this.height = y;
    }

    public void addVieport(Viewport viewport) {
        viewports.add(viewport);
    }

    public void render(){
        for (int y=0; y<height; ++y) {
            for (int x=0; x<width; ++x) {
                for (Viewport viewport: viewports) {
                    System.out.print(viewport.charAt(x,y));
                }
                System.out.println();
            }
        }
    }

    // this method facilitates the facade of classes creation
    public static Console createConsole(int width, int height) {
        Buffer buffer = new Buffer(width, height);
        Viewport viewport = new Viewport(buffer, width, height, 0, 0);
        Console console = new Console(width, height);
        console.addVieport(viewport);
        return console;
    }
}
