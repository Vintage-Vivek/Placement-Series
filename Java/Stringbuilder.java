class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Hello");
        
        int size = name.length();

        for(int i = 0; i < size/2; i++){
            int front = i;
            int back = size-1-i;

            char frontChar = name.charAt(front);
            char backChar = name.charAt(back);

            name.setCharAt(front, backChar);
            name.setCharAt(back, frontChar);
        }

        System.out.println(name);

        StringBuilder sb = new StringBuilder("Ghar");

        sb.insert(0, "Apna");
        sb.insert(4, ' ' );

        System.out.println(sb);

        sb.delete(4,5); // means from 4 to 4

        System.out.println(sb);

        sb.append("Mast");

        System.out.println(sb);

    }
}
