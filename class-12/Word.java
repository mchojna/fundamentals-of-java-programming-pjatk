public class Word {
    char[] cArr;
    int value;

    Word(){
        this.cArr = new char[100];
        this.value = 0;
    }

    public void addChar(char charVal){
        if(this.value < this.cArr.length){
            this.cArr[this.value++] = charVal;
        }else{
            char[] tmpCharArr = new char[this.cArr.length * 2];

            for(int i = 0; i < this.cArr.length; i++){
                tmpCharArr[i] = this.cArr[i];
            }

            this.cArr = tmpCharArr;
            this.cArr[this.value++] = charVal;
        }
    }

    public void show(){
        System.out.print("[");
        for(int i = 0; i < this.value; i++){
            System.out.print(cArr[i] + ", ");
        }
        System.out.println("]");
    }

    public int length(){
        return this.value;
    }
}
