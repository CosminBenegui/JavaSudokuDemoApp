package sudoku.userinterface;

import sudoku.problemdomain.SudokuGame;

public interface View {
    void setListerner(EventListener listener);

    void updateSquare(int x, int y, int input);

    void updateBoard(SudokuGame game);

    void showDialog(String Message);

    void showError(String message);


}
