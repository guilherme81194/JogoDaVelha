package Java.board;

public class KeyPress {
    int[] pressed;

    public int[] getPressed() {
        return pressed;
    }

    public void setPressed(int[] pressed) {
        this.pressed = pressed;
    }

    public int[] press(int position){

        switch (position){
            case 1:
                this.pressed = new int[]{0, 0};
                break;
            case 2:
                this.pressed = new int[]{0, 1};
                break;
            case 3:
                this.pressed = new int[]{0, 2};
                break;
            case 4:
                this.pressed = new int[]{1, 0};
                break;
            case 5:
                this.pressed = new int[]{1,1};
                break;
            case 6:
                this.pressed = new int[]{1, 2};
                break;
            case 7:
                this.pressed = new int[]{2, 0};
                break;
            case 8:
                this.pressed = new int[]{2, 1};
                break;
            case 9:
                this.pressed = new int[]{2, 2};
                break;
            default:
                this.pressed = new int[]{};
                break;

        }
        return this.pressed;
    }
}
