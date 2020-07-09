package Tasks;

public class TaskSudoku extends Task{
    // 0 -- means hollow cell!!!
    public TaskSudoku(){
        super();
    }
    int[] NUMBERS = {1,2,3,4,5,6,7,8,9};

    private class Cell{
        int[] probability = new int[9];
        int value;
        void setValue(int a)
        {
            value = a;
        }
        int getValue()
        {
            return value;
        }
    }
    private class raw{
        Cell[] raw = new Cell[9];
    }
    private class Block{
        Cell[] col = new Cell[9];
    }
    private class Field{
        Cell[] cells = new Cell[81];

    }
}
