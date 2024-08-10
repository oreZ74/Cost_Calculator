package com.orez.cost_calculator.Models;

import com.orez.cost_calculator.Views.ViewFactory;

public class Model {
    private final ViewFactory viewFactory;
    private static Model model;

    private Model() {
        this.viewFactory = new ViewFactory();
    }

    public static synchronized Model getInstance() {
        if (model == null) {
            model = new Model();
        }
        return model;
    }
    public ViewFactory getViewFactory() {
        return viewFactory;
    }
}
