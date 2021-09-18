package com.example.application.views.onas;

import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

@PageTitle("O Nas")
@Route(value = "onas", layout = MainLayout.class)
@Tag("o-nas-view")
@JsModule("./views/onas/o-nas-view.ts")
public class ONasView extends LitTemplate implements HasStyle {

    public ONasView() {
        addClassNames("flex", "flex-col", "h-full");
    }
}
