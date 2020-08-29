package Java.board;

public class Board {
    Cell[][] board = new Cell[3][3];
    boolean win;
    boolean newGame = true;

    public boolean isNewGame() {
        return newGame;
    }

    public void setNewGame(boolean newGame) {
        this.newGame = newGame;
    }

    public Cell[][] getBoard() {
        return board;
    }

    public void setBoard(Cell[][] board) {
        this.board = board;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public void cleanBoard() {
        for (Cell[] line : board) {
            for (Cell column : line) {
                column.playerCell = ' ';
            }
        }
        this.win = false;
        this.newGame = true;
    }


    public boolean winCondition() {
        for (int i = 0; i < 3; i++) {
            if ((this.board[i][0].equals(this.board[i][1])) && (this.board[i][1].equals(this.board[i][2]))) {
                this.win = true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if ((this.board[0][i].equals(this.board[1][i])) && (this.board[1][i].equals(this.board[2][i]))) {
                this.win = true;
            }
        }

        if ((this.board[0][0].equals(this.board[1][1])) && (this.board[1][1].equals(this.board[2][2]))) {
            this.win = true;
        }
        if ((this.board[0][2].equals(this.board[1][1])) && (this.board[1][1].equals(this.board[2][0]))) {
            this.win = true;
        }

        return this.win;
    }

    public String mountBoard(){
        if(isNewGame()){
            cleanBoard();
        }
        String boardMounting  = String.format("%s|%s|%s\n", this.board[0][0].playerCell,this.board[0][1].playerCell,this.board[0][2].playerCell);
        boardMounting  +=       String.format("--------\n");
        boardMounting  +=       String.format("%s|%s|%s\n", this.board[1][0].playerCell,this.board[1][1].playerCell,this.board[1][2].playerCell);
        boardMounting  +=       String.format("--------\n");
        boardMounting  +=       String.format("%s|%s|%s\n", this.board[2][0].playerCell,this.board[2][1].playerCell,this.board[2][2].playerCell);
        return boardMounting;
    }

    public String setCell(KeyPress key, Cell cell){
        if(this.board[key.pressed[0]][key.pressed[1]].equals(" ")) {
            this.board[key.pressed[0]][key.pressed[1]] = cell;
        }
        return  mountBoard();
    }
}
