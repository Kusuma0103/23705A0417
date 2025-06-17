class Main {
    public static void main(String[] args) {
        System.out.print("max profit : " + napSack(8,0,new int[]{1,3,5,7},new int[]{2,4,7,10}));
    }
    public static int napSack(int bagweight,int selectedElement,int[] weights,int[] profits){
        if(selectedElement>=weights.length||bagweight==0){
            return 0;
        }
        int pick = 0;
        if(bagweight>=weights[selectedElement]){
            pick = profits[selectedElement]+napSack(bagweight-weights[selectedElement],selectedElement+1,weights,profits);
        }
        int notpick = napSack(bagweight,selectedElement+1,weights,profits);
        return Math.max(pick,notpick);
    }
}