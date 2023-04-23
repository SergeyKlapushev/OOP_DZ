package ui;

import presenter.Presenter;

public interface View {

    void showCommands(String text);
    void start();
    void setPresenter(Presenter presenter);
}