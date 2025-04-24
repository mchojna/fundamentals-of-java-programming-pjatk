public class MyQueue {
    private String[] tab = {};
    private int length = 0;
    private int index = -1;

    public void put(String item){

        length += 1;
        index += 1;

        String[] tmpTab = tab;
        tab = new String[length];

        for(int i = 0; i < tmpTab.length; i++){
            tab[i] = tmpTab[i];
        }

        tab[index] = item;
    }

    public String get(){
        
        if(length > 0){
            
            String item = tab[0];

            length -= 1;
            index -= 1;

            String[] tmpTab = tab;
            
            if(length > 0){
                tab = new String[length];

                for(int i = 0; i < tab.length; i++){
                    tab[i] = tmpTab[i + 1];
                }

            }else{
                String[] placeHolder = {};
                tab = placeHolder;
            }

            return item;

        }else{
            return "0";
        }
    }

    public void show(){
        for(int i = 0; i < tab.length; i++){
            System.out.print(tab[i] + ", ");
        }
        System.out.println();
    }

    public int len(){
        return length;
    }
}
