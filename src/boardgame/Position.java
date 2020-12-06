package boardgame;

public class Position {
    private int linha;
    private int coluna;

    public void setValues(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
    }

    public Position(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    @Override
    public String toString(){
        return String.format("Linha: %d, Coluna: %d",getLinha(),getColuna());
    }
}